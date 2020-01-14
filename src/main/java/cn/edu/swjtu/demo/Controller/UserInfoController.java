package cn.edu.swjtu.demo.Controller;

import javax.servlet.http.HttpSession;

import org.apache.tomcat.jni.Local;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mysql.cj.Session;

import cn.edu.swjtu.demo.Pojo.UserInfo;
import cn.edu.swjtu.demo.Service.UserInfoService;

@RestController
public class UserInfoController {

	@Autowired
	UserInfoService userInfoService;

	// 修改密码
	@GetMapping(value = "/changePsw")
	@ResponseBody
	public int changePsw(@RequestParam(required = true, value = "oldPsw") String oldPsw,
			@RequestParam(required = true, value = "newPsw") String newPsw, HttpSession session) {
		UserInfo userInfo = (UserInfo) session.getAttribute("user");
		String cookieid = userInfo.getCookieid();
		if (userInfoService.changePsw(cookieid, oldPsw, newPsw)) {
			return 1;
		}
		return 0;
	}

	// 修改个人信息
	@GetMapping(value = "/changeUserInfo")
	@ResponseBody
	public int changeUserInfo(@RequestParam(required = false, value = "newName") String newName,
			@RequestParam(required = false, value = "newTel") Integer newTel,
			@RequestParam(required = false, value = "newLocation") String newLocation,
			@RequestParam(required = false, value = "NewAge") Integer NewAge, HttpSession session) {
		UserInfo userInfo = (UserInfo) session.getAttribute("user");
		if (newName != null && !newName.equals("")) {
			userInfo.setName(newName);
		}
		if (newTel != null) {
			userInfo.setTel(newTel);
		}
		if (newLocation != null && !newLocation.equals("")) {
			userInfo.setLocation(newLocation);
		}
		if (NewAge != null) {
			userInfo.setAge(NewAge);
		}
		try {
			userInfoService.changeUserInfo(userInfo.getCookieid(), userInfo);
			return 1;
		} catch (Exception e) {
			System.err.println(e);
			return 0;
		}
	}

	// 获取登录信息
	@GetMapping(value = "getUserInfo")
	@ResponseBody
	public UserInfo getUserInfo(HttpSession session) {
		UserInfo userInfo = (UserInfo) session.getAttribute("user");
		if (userInfo == null) {
			UserInfo result = new UserInfo();
			result.setUserId((long) -1);
			return result;
		}
		return userInfo;
	}
}
