package cn.edu.swjtu.demo.Controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cn.edu.swjtu.demo.Pojo.CarBrand;
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

	// 浏览帖子详情
	@PostMapping(value = "/getDetails")
	@ResponseBody
	public CarInfoWithBLOBs getDetails(@RequestParam(required = true, value = "pid") Long pid, HttpSession session) {
		UserInfo userInfo = (UserInfo) session.getAttribute("user");
		// 浏览帖子埋点
		// userService.viewLog(userInfo.getCookieid(), pid);
		CarInfoWithBLOBs carInfoWithBLOBs = postService.getPostDetails(pid);
		return carInfoWithBLOBs;
	}

	// 联系商家
	@GetMapping(value = "/inquirePost")
	@ResponseBody
	public String inquirePost(@RequestParam(required = true, value = "pid") Long pid, HttpSession session) {
		UserInfo userInfo = (UserInfo) session.getAttribute("user");
		// 联系商家埋点
		// userService.inquireLog(userInfo.getCookieid(), pid);
		return userService.getBusinessTelFromPost(pid);
	}

	// 搜索帖子
	@GetMapping(value = "/searchPost")
	@ResponseBody
	public List<CarInfoWithBLOBs> searchPost(
			@RequestParam(required = true, value = "pageNum", defaultValue = "1") Integer pageNum,
			@RequestParam(required = true, value = "pageSize", defaultValue = "10") Integer pageSize,
			@RequestParam(required = false, value = "selectedBrand") Integer selectedBrand,
			@RequestParam(required = false, value = "selectedSeries") Integer selectedSeries,
			@RequestParam(required = false, value = "selectedClassify") Integer selectedClassify,
			@RequestParam(required = false, value = "selectedPaifang") String selectedPaifang,
			@RequestParam(required = false, value = "selectedColor") Integer selectedColor,
			@RequestParam(required = false, value = "selectedLicheng") Integer selectedLicheng,
			@RequestParam(required = false, value = "selectedPrice") Double selectedPrice, HttpSession session) {
		UserInfo userInfo = (UserInfo) session.getAttribute("user");
		// 搜索帖子埋点
		// userService.searchLog(userInfo.getCookieid(), selectedBrand, selectedSeries,
		// selectedClassify, selectedPaifang,
		// selectedColor, selectedLicheng);
		return userService.getPostByCondition(selectedBrand, selectedSeries, selectedClassify, selectedPaifang,
				selectedColor, selectedLicheng, selectedPrice);
	}

	// 选择品牌数据
	@GetMapping(value = "/getBrandSelectBox")
	@ResponseBody
	public List<CarBrand> getCarBrands() {
		return userService.getAllCarBrands();
	}

	// 选择车系数据
	@GetMapping(value = "/getSeriesSelectBox")
	@ResponseBody
	public List<CarSeries> getCarSeries() {
		return userService.getAllCarSeries();
	}

	// 选择类型数据
	@GetMapping(value = "/getClassifySelectBox")
	@ResponseBody
	public List<CarClassify> getCarClassifies() {
		return userService.getAllCarClassifies();
	}

	// 选择颜色数据
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
}
