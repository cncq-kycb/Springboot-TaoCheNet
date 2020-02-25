package cn.edu.swjtu.demo.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import cn.edu.swjtu.demo.Pojo.CarBusiness;
import cn.edu.swjtu.demo.Pojo.CarInfoWithBLOBs;
import cn.edu.swjtu.demo.Pojo.UserInfo;

@Service
public interface BusinessService {

	// 获取推荐用户目标
	List<UserInfo> getAllRecommendUsers(String cookieid);

	// 获取上架车辆
	List<CarInfoWithBLOBs> getAllSellingCars(String cookieid);

	// 绑定用户与商家
	int bindBusinessUser(String cookieid, String sname, String dizhi, String tel, String describe);

	// 获取商家信息
	CarBusiness getCarBusiness(String cookieid);
}
