package cn.edu.swjtu.demo.Controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import cn.edu.swjtu.demo.Pojo.CarBrand;
import cn.edu.swjtu.demo.Pojo.CarClassify;
import cn.edu.swjtu.demo.Pojo.CarInfo;
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
	public CarInfoWithBLOBs getDetails(@RequestParam(required = true, value = "pid") Long pid) {
//		UserInfo userInfo = (UserInfo) session.getAttribute("user");
//		// 浏览帖子埋点
//		userService.viewLog(userInfo.getCookieid(), pid);
		CarInfoWithBLOBs carInfoWithBLOBs = postService.getPostDetails(pid);
		return carInfoWithBLOBs;
	}

	// 帖子详情图片
	@GetMapping(value = "/getDetailsPic")
	@ResponseBody
	public List<CarPicture> getDetailsPic(@RequestParam(required = true, value = "pid") Long pid) {
		return userService.getCarPicture(pid);
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

}
