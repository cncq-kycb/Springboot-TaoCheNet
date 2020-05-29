package cn.edu.swjtu.demo.Controller;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cn.edu.swjtu.demo.Pojo.CarBusiness;
import cn.edu.swjtu.demo.Pojo.CarInfoWithBLOBs;
import cn.edu.swjtu.demo.Pojo.TransactionView;
import cn.edu.swjtu.demo.Pojo.UserInfo;
import cn.edu.swjtu.demo.Service.BusinessService;

@RestController
public class BusinessController {

	@Autowired
	BusinessService businessService;

	// 获取商家信息
	@GetMapping(value = "/getBusinessInfo")
	@ResponseBody
	public CarBusiness getBusinessInfo(HttpSession session) {
		UserInfo userInfo = (UserInfo) session.getAttribute("user");
		return businessService.getCarBusiness(userInfo.getCookieid());
	}

	// 按车获得推荐目标用户
	@GetMapping(value = "/getAllRecommendUsers")
	@ResponseBody
	public List<UserInfo> getAllRecommendUsers(@RequestParam(required = true, value = "pid") String pid,
			HttpSession session) {
		return businessService.getAllRecommendUsersByPid(pid);
	}

	// 获取用户近期历史行为
	@SuppressWarnings("rawtypes")
	@GetMapping(value = "getUserHistory")
	@ResponseBody
	public HashMap<String, List> getUserHistory(@RequestParam(required = true, value = "cookieid") String cookieid) {
		return businessService.getUserHistory(cookieid);
	}

	// 查看全部上架车辆
	@GetMapping(value = "/getAllSellingCars")
	@ResponseBody
	public List<CarInfoWithBLOBs> getAllSellingCars(
			@RequestParam(required = true, value = "cookieid") String cookieid) {
		return businessService.getAllSellingCars(cookieid);
	}

	// 绑定商家信息
	@GetMapping(value = "/bindBusinessUser")
	@ResponseBody
	public int bindBusinessUser(@RequestParam(required = true, value = "sname") String sname,
			@RequestParam(required = true, value = "dizhi") String dizhi,
			@RequestParam(required = true, value = "tel") String tel,
			@RequestParam(required = true, value = "describe") String describe, HttpSession session) {
		UserInfo userInfo = (UserInfo) session.getAttribute("user");
		return businessService.bindBusinessUser(userInfo.getCookieid(), sname, dizhi, tel, describe);
	}

	// 获取交易列表
	@GetMapping(value = "/getBuyList")
	@ResponseBody
	public List<TransactionView> getBuyList(HttpSession session) {
		UserInfo userInfo = (UserInfo) session.getAttribute("user");
		return businessService.getBuyList(userInfo.getCookieid());
	}

	// 通过用户买车申请
	@GetMapping(value = "/sellCar")
	@ResponseBody
	public int sellCar(@RequestParam(required = true, value = "recordId") Long recordId) {
		return businessService.sellCar(recordId);
	}

	// 根据车辆获取浏览量
	@GetMapping(value = "/getViewCount")
	@ResponseBody
	public HashMap<String, Object> getViewCount(@RequestParam(required = true, value = "pid") String pid) {
		return businessService.getViewCount(pid);
	}

	// 根据车辆获取询价记录
	@GetMapping(value = "/getInquireCount")
	@ResponseBody
	public HashMap<String, Object> getInquireCount(@RequestParam(required = true, value = "pid") String pid) {
		return businessService.getInquireCount(pid);
	}

	// 根据车辆获取申请试驾记录
	@GetMapping(value = "/getDriveCount")
	@ResponseBody
	public HashMap<String, Object> getDriveCount(@RequestParam(required = true, value = "pid") String pid) {
		return businessService.getDriveCount(pid);
	}
}
