package cn.edu.swjtu.demo.Controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import cn.edu.swjtu.demo.Pojo.CarInfo;
import cn.edu.swjtu.demo.Pojo.UserInfo;
import cn.edu.swjtu.demo.Service.PostService;
import cn.edu.swjtu.demo.Service.UserService;

@Controller
public class UserController {

	@Autowired
	UserService userService;
	@Autowired
	PostService postService;

	// 浏览帖子
	@PostMapping(value = "/viewPost")
	@ResponseBody
	public CarInfo viewPost(@RequestBody Map<String, Object> json, HttpSession session) {
		UserInfo userInfo = (UserInfo) session.getAttribute("user");
		Long pid = (Long) json.get("pid");
		// 浏览帖子埋点
		userService.viewLog(userInfo.getCookieid(), pid);
		return postService.getPostDetails(pid);
	}

	// 联系商家
	@PostMapping(value = "/inquirePost")
	@ResponseBody
	public boolean inquirePost(@RequestBody Map<String, Object> json, HttpSession session) {
		UserInfo userInfo = (UserInfo) session.getAttribute("user");
		Long pid = (Long) json.get("pid");
		// 联系商家埋点
		userService.inquireLog(userInfo.getCookieid(), pid);
		return true;
	}

	// 搜索帖子
	@PostMapping(value = "/searchPost")
	@ResponseBody
	public ModelAndView searchPost(@RequestBody Map<String, Object> json, HttpSession session) {
		// TODO：
		return new ModelAndView("post/searchResult");
	}

}
