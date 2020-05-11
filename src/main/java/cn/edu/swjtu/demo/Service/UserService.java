package cn.edu.swjtu.demo.Service;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

import cn.edu.swjtu.demo.Pojo.CarBrand;
import cn.edu.swjtu.demo.Pojo.CarClassify;
import cn.edu.swjtu.demo.Pojo.CarColor;
import cn.edu.swjtu.demo.Pojo.CarInfoWithBLOBs;
import cn.edu.swjtu.demo.Pojo.CarPicture;
import cn.edu.swjtu.demo.Pojo.CarSeries;
import cn.edu.swjtu.demo.Pojo.UserInfo;

@Service
public interface UserService {
	// 用户登录
	boolean login(String username, String password);

	// 获取用户POJO
	UserInfo getUserInfo(String username);

	// 记录用户浏览日志
	void viewLog(String cookieid, Long pid);

	// 记录用户咨询日志
	void inquireLog(String cookieid, Long pid);

	// 记录用申请试驾日志
	int driveLog(String cookieid, Long pid);

	// 记录用户微聊日志
	int chatLog(String cookieid, Long pid);

	// 记录用户搜索日志
	void searchLog(String cookieid, Integer selectedBrand, Integer selectedSeries, Integer selectedClassify,
			String selectedPaifang, Integer selectedColor, Integer selectedLichengLeft, Integer selectedLichengRight,
			Integer selectedPriceLeft, Integer selectedPriceRight);

	// 展示全部帖子
	List<CarInfoWithBLOBs> showPosts();

	// 可选品牌
	List<CarBrand> getAllCarBrands();

	// 可选车系
	List<CarSeries> getAllCarSeries();

	// 可选类型
	List<CarClassify> getAllCarClassifies();

	// 可选颜色
	List<CarColor> getAllCarColor();

	// 搜索帖子
	List<CarInfoWithBLOBs> getPostByCondition(Integer selectedBrand, Integer selectedSeries, Integer selectedClassify,
			String selectedPaifang, Integer selectedColor, Integer selectedLichengLeft, Integer selectedLichengRight,
			Integer selectedPriceLeft, Integer selectedPriceRight);

	// 获取随机推荐结果
	List<CarInfoWithBLOBs> getRecommend();

	// 获取推荐
	List<CarInfoWithBLOBs> getRecommend(String cookieid);

	// 获取帖子图片
	List<CarPicture> getCarPicture(Long pid);

	// 按帖子获取商家电话
	String getBusinessTelFromPost(Long pid);

	// 添加收藏
	int confirmFavorite(String cookieid, Long pid);

	// 取消收藏
	int cancelFavorite(String cookieid, Long pid);

	// 获取收藏
	List<CarInfoWithBLOBs> getFavoriteList(String cookieid);

	// 获取同车型历史价格与信息
	HashMap<String, Object> getRecommendCarList(Long pid);

}
