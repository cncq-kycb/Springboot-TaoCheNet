package cn.edu.swjtu.demo.Service.ServiceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cn.edu.swjtu.demo.Dao.CarBusinessMapper;
import cn.edu.swjtu.demo.Dao.CarInfoMapper;
import cn.edu.swjtu.demo.Dao.RecommendMapper;
import cn.edu.swjtu.demo.Dao.UserInfoMapper;
import cn.edu.swjtu.demo.Pojo.CarBusiness;
import cn.edu.swjtu.demo.Pojo.CarBusinessExample;
import cn.edu.swjtu.demo.Pojo.CarInfo;
import cn.edu.swjtu.demo.Pojo.CarInfoExample;
import cn.edu.swjtu.demo.Pojo.Recommend;
import cn.edu.swjtu.demo.Pojo.RecommendExample;
import cn.edu.swjtu.demo.Pojo.UserInfo;
import cn.edu.swjtu.demo.Pojo.UserInfoExample;
import cn.edu.swjtu.demo.Service.BusinessService;

@Component
public class BusinessServiceImpl implements BusinessService {

	@Autowired
	UserInfoMapper userInfoMapper;
	@Autowired
	CarBusinessMapper carBusinessMapper;
	@Autowired
	CarInfoMapper carInfoMapper;
	@Autowired
	RecommendMapper recommendMapper;

	@Override
	public List<UserInfo> getAllRecommendUsers(String cookieid) {
		try {
			List<UserInfo> result = new ArrayList<UserInfo>();
			List<String> userCookieids = new ArrayList<String>();
			CarBusinessExample carBusinessExample = new CarBusinessExample();
			carBusinessExample.or().andCookieidEqualTo(cookieid);
			List<CarBusiness> carBusinesses = carBusinessMapper.selectByExample(carBusinessExample);
			if (carBusinesses.size() != 0) {
				Integer sid = carBusinesses.get(0).getSid();
				CarInfoExample carInfoExample = new CarInfoExample();
				carInfoExample.or().andSidEqualTo((long) sid);
				List<CarInfo> carInfos = carInfoMapper.selectByExample(carInfoExample);
				if (carInfos.size() != 0) {
					for (CarInfo carInfo : carInfos) {
						RecommendExample example = new RecommendExample();
						example.or().andPidEqualTo(carInfo.getPid());
						List<Recommend> temp = recommendMapper.selectByExample(example);
						for (Recommend recommend : temp) {
							userCookieids.add(recommend.getCookieid());
						}
					}
					for (String userCookieid : userCookieids) {
						UserInfoExample userInfoExample = new UserInfoExample();
						userInfoExample.or().andCookieidEqualTo(userCookieid);
						result.addAll(userInfoMapper.selectByExample(userInfoExample));
					}
					return result;
				}
				return new ArrayList<UserInfo>();
			}
			return null;
		} catch (Exception e) {
			System.err.println(e);
			return null;
		}
	}

	@Override
	public List<CarInfo> getAllSellingCars(String cookieid) {
		try {
			CarBusinessExample carBusinessExample = new CarBusinessExample();
			carBusinessExample.or().andCookieidEqualTo(cookieid);
			List<CarBusiness> businessUsers = carBusinessMapper.selectByExample(carBusinessExample);
			if (businessUsers.size() != 0) {
				Integer sid = businessUsers.get(0).getSid();
				CarInfoExample carInfoExample = new CarInfoExample();
				carInfoExample.or().andSidEqualTo((long) sid);
				List<CarInfo> carInfos = carInfoMapper.selectByExample(carInfoExample);
				if (carInfos.size() != 0) {
					return carInfos;
				}
				return new ArrayList<CarInfo>();
			}
			return null;
		} catch (Exception e) {
			System.err.println(e);
			return null;
		}
	}

	@Override
	public int bindBusinessUser(String cookieid, String sname, String dizhi, String tel, String describe) {
		try {
			CarBusiness carBusiness = new CarBusiness();
			carBusiness.setCookieid(cookieid);
			carBusiness.setSname(sname);
			carBusiness.setDizhi(dizhi);
			carBusiness.setTel(tel);
			carBusiness.setDescribe(describe);
			carBusiness.setHaoping(new Double(0));
			carBusiness.setHuiyuan("商家 | 会员0年");
			carBusiness.setZaishou(0);
			carBusiness.setYishou(0);
			carBusinessMapper.insert(carBusiness);
			return 1;
		} catch (Exception e) {
			System.err.println(e);
			return 0;
		}
	}

}
