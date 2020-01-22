package cn.edu.swjtu.demo.Controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cn.edu.swjtu.demo.Pojo.CarInfo;
import cn.edu.swjtu.demo.Pojo.UserInfo;
import cn.edu.swjtu.demo.Service.BusinessService;

@RestController
public class BusinessController {

	@Autowired
	BusinessService businessService;

	// 获得推荐目标用户
	@GetMapping(value = "/getAllRecommendUsers")
	@ResponseBody
	public List<UserInfo> getAllRecommendUsers(HttpSession session) {
		UserInfo userInfo = (UserInfo) session.getAttribute("user");
		return businessService.getAllRecommendUsers(userInfo.getCookieid());
	}

	// 查看全部上架车辆
	@GetMapping(value = "/getAllSellingCars")
	@ResponseBody
	public List<CarInfo> getAllSellingCars(@RequestParam(required = true, value = "cookieid") String cookieid) {
		return businessService.getAllSellingCars(cookieid);
	}

	// 绑定商家信息
	@GetMapping(value = "/bindBusinessUser")
	@ResponseBody
	public int bindBusinessUser() {
		return 0;
	}
}
