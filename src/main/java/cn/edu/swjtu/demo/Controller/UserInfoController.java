package cn.edu.swjtu.demo.Controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cn.edu.swjtu.demo.Pojo.UserInfo;
import cn.edu.swjtu.demo.Service.UserInfoService;

@RestController
public class UserInfoController {

	@Autowired
	UserInfoService userInfoService;

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
}
