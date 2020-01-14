package cn.edu.swjtu.demo.Controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;

import cn.edu.swjtu.demo.Pojo.CarInfo;
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
	public UserInfo login(@RequestBody Map<String, Object> login, HttpSession session) {
		String username = (String) login.get("username");
		String password = (String) login.get("password");
//		return new Login(counter.incrementAndGet(), String.format(template, id));
//		返回json
//		ModelAndView mav = new ModelAndView(new MappingJackson2JsonView());
//		mav.addObject("loginUrl", "www.baidu.com");
		if (userService.login(username, password)) {
			System.out.println("password match");
			UserInfo userInfo = userService.getUserInfo(username);
			session.setAttribute("user", userInfo);
			return userInfo;
		}
		return new UserInfo();
	}

	@PostMapping(value = "/showPosts")
	@ResponseBody
	public List<CarInfoWithBLOBs> showPosts(
			@RequestParam(required = true, value = "pageNum", defaultValue = "1") Integer pageNum,
			@RequestParam(required = true, value = "pageSize", defaultValue = "10") Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		return userService.showPosts();
	}

	// 推荐结果
	@GetMapping(value = "/getRecommend")
	@ResponseBody
	public List<CarInfoWithBLOBs> getRecommend(HttpSession session) {
		// UserInfo userInfo = (UserInfo) session.getAttribute("user");
		return userService.getRecommend();
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
