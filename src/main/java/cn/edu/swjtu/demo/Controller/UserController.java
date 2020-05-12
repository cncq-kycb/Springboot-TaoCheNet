package cn.edu.swjtu.demo.Controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cn.edu.swjtu.demo.Pojo.CarBrand;
import cn.edu.swjtu.demo.Pojo.CarBusiness;
import cn.edu.swjtu.demo.Pojo.CarClassify;
import cn.edu.swjtu.demo.Pojo.CarColor;
import cn.edu.swjtu.demo.Pojo.CarInfoWithBLOBs;
import cn.edu.swjtu.demo.Pojo.CarPicture;
import cn.edu.swjtu.demo.Pojo.CarSeries;
import cn.edu.swjtu.demo.Pojo.UserInfo;
import cn.edu.swjtu.demo.Service.PostService;
import cn.edu.swjtu.demo.Service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userService;
	@Autowired
	PostService postService;

	// 获取同车型历史价格与信息
	@GetMapping(value = "/getRecommendCarList")
	@ResponseBody
	public HashMap<String, Object> getRecommendCarList(@RequestParam(required = true, value = "pid") Long pid) {
		return userService.getRecommendCarList(pid);
	}

	// 浏览帖子详情
	@GetMapping(value = "/getDetails")
	@ResponseBody
	public CarInfoWithBLOBs getDetails(@RequestParam(required = true, value = "pid") Long pid, HttpSession session) {
		UserInfo userInfo = (UserInfo) session.getAttribute("user");
		if (userInfo != null) {
			// 浏览帖子埋点
			userService.viewLog(userInfo.getCookieid(), pid, 0);
			// 获取收藏情况
			return postService.getPostDetails(userInfo.getCookieid(), pid);
		}
		return postService.getPostDetails(pid);
	}

	// 浏览推荐帖子详情
	@GetMapping(value = "/getRecommendDetails")
	@ResponseBody
	public CarInfoWithBLOBs getRecommendDetails(@RequestParam(required = true, value = "pid") Long pid,
			HttpSession session) {
		UserInfo userInfo = (UserInfo) session.getAttribute("user");
		if (userInfo != null) {
			// 浏览帖子埋点
			userService.viewLog(userInfo.getCookieid(), pid, 1);
			// 获取收藏情况
			return postService.getPostDetails(userInfo.getCookieid(), pid);
		}
		return postService.getPostDetails(pid);
	}

	// 添加收藏帖子
	@GetMapping(value = "/confirmFavorite")
	@ResponseBody
	public int confirmFavorite(@RequestParam(required = true, value = "pid") Long pid, HttpSession session) {
		UserInfo userInfo = (UserInfo) session.getAttribute("user");
		if (userInfo != null) {
			return userService.confirmFavorite(userInfo.getCookieid(), pid);
		}
		return -1;
	}

	// 取消收藏帖子
	@GetMapping(value = "/cancelFavorite")
	@ResponseBody
	public int cancelFavorite(@RequestParam(required = true, value = "pid") Long pid, HttpSession session) {
		UserInfo userInfo = (UserInfo) session.getAttribute("user");
		if (userInfo != null) {
			return userService.cancelFavorite(userInfo.getCookieid(), pid);
		}
		return -1;
	}

	// 收藏列表
	@GetMapping(value = "/getFavoriteList")
	@ResponseBody
	public List<CarInfoWithBLOBs> getFavoriteList(HttpSession session) {
		UserInfo userInfo = (UserInfo) session.getAttribute("user");
		if (userInfo.getCookieid() != null) {
			return userService.getFavoriteList(userInfo.getCookieid());
		}
		return new ArrayList<CarInfoWithBLOBs>();
	}

	// 帖子商家详情
	@GetMapping(value = "/getSalerInfo")
	@ResponseBody
	public CarBusiness getSalerInfo(@RequestParam(required = true, value = "pid") Long pid) {
		return postService.getSalerInfo(pid);
	}

	// 联系商家
	@GetMapping(value = "/inquirePost")
	@ResponseBody
	public String inquirePost(@RequestParam(required = true, value = "pid") Long pid, HttpSession session) {
		UserInfo userInfo = (UserInfo) session.getAttribute("user");
		if (userInfo != null) {
			// 联系商家埋点
			userService.inquireLog(userInfo.getCookieid(), pid);
		}
		return userService.getBusinessTelFromPost(pid);
	}

	// 申请试驾
	@GetMapping(value = "/driveRequest")
	@ResponseBody
	public int driveRequest(@RequestParam(required = true, value = "pid") Long pid, HttpSession session) {
		UserInfo userInfo = (UserInfo) session.getAttribute("user");
		if (userInfo != null) {
			// 联系商家埋点
			return userService.driveLog(userInfo.getCookieid(), pid);
		}
		return 0;
	}

	// 发起微聊
	@GetMapping(value = "/chatRequest")
	@ResponseBody
	public int chatRequest(@RequestParam(required = true, value = "pid") Long pid, HttpSession session) {
		UserInfo userInfo = (UserInfo) session.getAttribute("user");
		if (userInfo != null) {
			// 联系商家埋点
			return userService.chatLog(userInfo.getCookieid(), pid);
		}
		return 0;
	}

	// 搜索帖子
	@GetMapping(value = "/searchPost")
	@ResponseBody
	public List<CarInfoWithBLOBs> searchPost(
			@RequestParam(required = false, value = "selectedBrand") Integer selectedBrand,
			@RequestParam(required = false, value = "selectedSeries") Integer selectedSeries,
			@RequestParam(required = false, value = "selectedClassify") Integer selectedClassify,
			@RequestParam(required = false, value = "selectedPaifang") String selectedPaifang,
			@RequestParam(required = false, value = "selectedColor") Integer selectedColor,
			@RequestParam(required = false, value = "selectedLichengLeft") Integer selectedLichengLeft,
			@RequestParam(required = false, value = "selectedLichengRight") Integer selectedLichengRight,
			@RequestParam(required = false, value = "selectedPriceLeft") Integer selectedPriceLeft,
			@RequestParam(required = false, value = "selectedPriceRight") Integer selectedPriceRight,
			HttpSession session) {
		UserInfo userInfo = (UserInfo) session.getAttribute("user");
		if (userInfo != null) {
			// 搜索帖子埋点
			userService.searchLog(userInfo.getCookieid(), selectedBrand, selectedSeries, selectedClassify,
					selectedPaifang, selectedColor, selectedLichengLeft, selectedLichengRight, selectedPriceLeft,
					selectedPriceRight);
		}
		return userService.getPostByCondition(selectedBrand, selectedSeries, selectedClassify, selectedPaifang,
				selectedColor, selectedLichengLeft, selectedLichengRight, selectedPriceLeft, selectedPriceRight);
	}

	// 获取可选品牌数据
	@GetMapping(value = "/getBrandSelectBox")
	@ResponseBody
	public List<CarBrand> getCarBrands() {
		return userService.getAllCarBrands();
	}

	// 获取可选车系数据
	@GetMapping(value = "/getSeriesSelectBox")
	@ResponseBody
	public List<CarSeries> getCarSeries() {
		return userService.getAllCarSeries();
	}

	// 获取可选类型数据
	@GetMapping(value = "/getClassifySelectBox")
	@ResponseBody
	public List<CarClassify> getCarClassifies() {
		return userService.getAllCarClassifies();
	}

	// 获取可选颜色数据
	@GetMapping(value = "/getColorSelectBox")
	@ResponseBody
	public List<CarColor> getCarColor() {
		return userService.getAllCarColor();
	}

	// 帖子详情图片
	@GetMapping(value = "/getDetailsPic")
	@ResponseBody
	public List<CarPicture> getDetailsPic(@RequestParam(required = true, value = "pid") Long pid) {
		return userService.getCarPicture(pid);
	}

	// 买车申请
	@GetMapping(value = "/buyCar")
	@ResponseBody
	public int buyCar(@RequestParam(required = true, value = "pid") Long pid,
			@RequestParam(required = true, value = "buyType") int buyType,
			@RequestParam(required = true, value = "price") BigDecimal price, HttpSession session) {
		UserInfo userInfo = (UserInfo) session.getAttribute("user");
		return userService.buyCar(pid, userInfo.getCookieid(), price, buyType);
	}

}
