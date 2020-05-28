package cn.edu.swjtu.demo.Service;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

import cn.edu.swjtu.demo.Pojo.CarBusiness;
import cn.edu.swjtu.demo.Pojo.CarInfoWithBLOBs;
import cn.edu.swjtu.demo.Pojo.DriveCount;
import cn.edu.swjtu.demo.Pojo.InquireCount;
import cn.edu.swjtu.demo.Pojo.TransactionView;
import cn.edu.swjtu.demo.Pojo.UserInfo;
import cn.edu.swjtu.demo.Pojo.ViewCount;

@Service
public interface BusinessService {

	// 获取推荐用户目标
	List<UserInfo> getAllRecommendUsers(String cookieid);

	// 按车辆获取推荐用户目标
	List<UserInfo> getAllRecommendUsersByPid(String pid);

	// 获取上架车辆
	List<CarInfoWithBLOBs> getAllSellingCars(String cookieid);

	// 绑定用户与商家
	int bindBusinessUser(String cookieid, String sname, String dizhi, String tel, String describe);

	// 获取商家信息
	CarBusiness getCarBusiness(String cookieid);

	// 获取用户近期历史行为
	@SuppressWarnings("rawtypes")
	HashMap<String, List> getUserHistory(String cookieid);

	// 获取交易列表
	List<TransactionView> getBuyList(String cookieid);

	// 通过用户购买请求
	int sellCar(Long recordId);

	// 根据车辆获取浏览记录
	HashMap<String, Object> getViewCount(String pid);

	// 根据车辆获取询价记录
	List<InquireCount> getInquireCount(String pid);

	// 根据车辆获取申请试驾记录
	List<DriveCount> getDriveCount(String pid);

}
