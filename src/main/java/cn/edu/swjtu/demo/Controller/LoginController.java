package cn.edu.swjtu.demo.Controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cn.edu.swjtu.demo.Pojo.CarInfoWithBLOBs;
import cn.edu.swjtu.demo.Pojo.UserInfo;
import cn.edu.swjtu.demo.Service.UserService;

@RestController
public class LoginController {
	@Autowired
	UserService userService;

	// 用户登录
	@PostMapping(value = "/login")
	@ResponseBody
	public int login(@RequestBody Map<String, Object> login, HttpSession session) {
		String username = (String) login.get("username");
		String password = (String) login.get("password");
//		return new Login(counter.incrementAndGet(), String.format(template, id));
//		返回json
//		ModelAndView mav = new ModelAndView(new MappingJackson2JsonView());
//		mav.addObject("loginUrl", "www.baidu.com");
		if (userService.login(username, password)) {
			UserInfo userInfo = userService.getUserInfo(username);
			if (userInfo.getUserPermissionId().intValue() == 2) {
				return -1;
			}
			session.setAttribute("user", userInfo);
			return userInfo.getUserTypeId().intValue();
		}
		return 0;
	}

	// 展示全部帖子
	@PostMapping(value = "/showPosts")
	@ResponseBody
	public List<CarInfoWithBLOBs> showPosts() {
		return userService.showPosts();
	}

	// 推荐结果
	@GetMapping(value = "/getRecommend")
	@ResponseBody
	public List<CarInfoWithBLOBs> getRecommend(HttpSession session) {
//		// 随机推荐，展示用，屏蔽清注释，并开启下面被的注释代码
//		return userService.getRecommend();
		
		// 按数据推荐，若数据不一致将会得不到数据
		UserInfo userInfo = (UserInfo) session.getAttribute("user");
		if(userInfo == null) {
			return userService.getRecommend();
		}
		String cookieid = userInfo.getCookieid();
		return userService.getRecommend(cookieid);
	}

	// 用户退出
	@GetMapping(value = "/logout")
	@ResponseBody
	public int logout(HttpSession session) {
		try {
			session.invalidate();
			return 1;
		} catch (Exception e) {
			System.err.println(e);
			return 0;
		}
	}
}
