package cn.edu.swjtu.demo.Service.ServiceImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cn.edu.swjtu.demo.Dao.CarBusinessMapper;
import cn.edu.swjtu.demo.Dao.CarInfoMapper;
import cn.edu.swjtu.demo.Dao.RecommendBusinessMapper;
import cn.edu.swjtu.demo.Dao.UserChatMapper;
import cn.edu.swjtu.demo.Dao.UserDriveMapper;
import cn.edu.swjtu.demo.Dao.UserInfoMapper;
import cn.edu.swjtu.demo.Dao.UserInquirePostMapper;
import cn.edu.swjtu.demo.Dao.UserSearchPostMapper;
import cn.edu.swjtu.demo.Dao.UserViewPostMapper;
import cn.edu.swjtu.demo.Pojo.CarBusiness;
import cn.edu.swjtu.demo.Pojo.CarBusinessExample;
import cn.edu.swjtu.demo.Pojo.CarInfo;
import cn.edu.swjtu.demo.Pojo.CarInfoExample;
import cn.edu.swjtu.demo.Pojo.CarInfoWithBLOBs;
import cn.edu.swjtu.demo.Pojo.RecommendBusiness;
import cn.edu.swjtu.demo.Pojo.RecommendBusinessExample;
import cn.edu.swjtu.demo.Pojo.UserChat;
import cn.edu.swjtu.demo.Pojo.UserChatExample;
import cn.edu.swjtu.demo.Pojo.UserDrive;
import cn.edu.swjtu.demo.Pojo.UserDriveExample;
import cn.edu.swjtu.demo.Pojo.UserInfo;
import cn.edu.swjtu.demo.Pojo.UserInfoExample;
import cn.edu.swjtu.demo.Pojo.UserInquirePost;
import cn.edu.swjtu.demo.Pojo.UserInquirePostExample;
import cn.edu.swjtu.demo.Pojo.UserSearchPost;
import cn.edu.swjtu.demo.Pojo.UserSearchPostExample;
import cn.edu.swjtu.demo.Pojo.UserViewPost;
import cn.edu.swjtu.demo.Pojo.UserViewPostExample;
import cn.edu.swjtu.demo.Service.BusinessService;
import cn.edu.swjtu.demo.Utils.Utils;

@Component
public class BusinessServiceImpl implements BusinessService {

	@Autowired
	UserInfoMapper userInfoMapper;
	@Autowired
	CarBusinessMapper carBusinessMapper;
	@Autowired
	CarInfoMapper carInfoMapper;
	@Autowired
	RecommendBusinessMapper recommendBusinessMapper;
	@Autowired
	UserSearchPostMapper userSearchPostMapper;
	@Autowired
	UserViewPostMapper userViewPostMapper;
	@Autowired
	UserInquirePostMapper userInquirePostMapper;
	@Autowired
	UserDriveMapper userDriveMapper;
	@Autowired
	UserChatMapper userChatMapper;

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
						RecommendBusinessExample recommendBusinessExample = new RecommendBusinessExample();
						recommendBusinessExample.or().andPidEqualTo(carInfo.getPid().toString());
						List<RecommendBusiness> recommendBusinesses = recommendBusinessMapper
								.selectByExample(recommendBusinessExample);
						for (RecommendBusiness item : recommendBusinesses) {
							List<String> cookieids = Utils.splitJson(item.getRecommenderCookieids());
							for (int i = 0; i < cookieids.size(); i++) {
								Boolean flag = true;
								for (String cookieid_exist : userCookieids) {
									if (cookieid_exist.equals(cookieids.get(i))) {
										flag = false;
										break;
									}
								}
								if (flag) {
									userCookieids.add(cookieids.get(i));
								}
							}
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
	public List<UserInfo> getAllRecommendUsersByPid(String pid) {
		List<UserInfo> result = new ArrayList<UserInfo>();
		try {
			RecommendBusinessExample recommendBusinessExample = new RecommendBusinessExample();
			recommendBusinessExample.or().andPidEqualTo(pid);
			List<RecommendBusiness> recommendBusinesses = recommendBusinessMapper
					.selectByExampleWithBLOBs(recommendBusinessExample);
			if (recommendBusinesses.size() != 0) {
				String recommender_cookieids = recommendBusinesses.get(0).getRecommenderCookieids();
				List<String> cookieids = Utils.splitJson(recommender_cookieids);
				for (String cookieid : cookieids) {
					UserInfoExample userInfoExample = new UserInfoExample();
					userInfoExample.or().andCookieidEqualTo(cookieid);
					List<UserInfo> userInfos = userInfoMapper.selectByExample(userInfoExample);
					if (userInfos.size() != 0) {
						result.add(userInfos.get(0));
					}
				}
			}
			return result;
		} catch (Exception e) {
			System.err.println(e);
			return null;
		}
	}

	@Override
	public List<CarInfoWithBLOBs> getAllSellingCars(String cookieid) {
		try {
			CarBusinessExample carBusinessExample = new CarBusinessExample();
			carBusinessExample.or().andCookieidEqualTo(cookieid);
			List<CarBusiness> businessUsers = carBusinessMapper.selectByExample(carBusinessExample);
			if (businessUsers.size() != 0) {
				Integer sid = businessUsers.get(0).getSid();
				CarInfoExample carInfoExample = new CarInfoExample();
				carInfoExample.or().andSidEqualTo((long) sid);
				List<CarInfoWithBLOBs> carInfos = carInfoMapper.selectByExampleWithBLOBs(carInfoExample);
				if (carInfos.size() != 0) {
					return carInfos;
				}
				return new ArrayList<CarInfoWithBLOBs>();
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

	@Override
	public CarBusiness getCarBusiness(String cookieid) {
		try {
			CarBusinessExample example = new CarBusinessExample();
			example.or().andCookieidEqualTo(cookieid);
			List<CarBusiness> carBusinesses = carBusinessMapper.selectByExample(example);
			if (carBusinesses.size() != 0) {
				return carBusinesses.get(0);
			}
			CarBusiness carBusiness = new CarBusiness();
			carBusiness.setSid(-1);
			return carBusiness;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}

	@Override
	public HashMap<String, List> getUserHistory(String cookieid) {
		HashMap<String, List> data = new HashMap<String, List>();
		UserSearchPostExample userSearchPostExample = new UserSearchPostExample();
		userSearchPostExample.or().andCookieidEqualTo(cookieid);
		UserViewPostExample userViewPostExample = new UserViewPostExample();
		userViewPostExample.or().andCookieidEqualTo(cookieid);
		UserInquirePostExample userInquirePostExample = new UserInquirePostExample();
		userInquirePostExample.or().andCookieidEqualTo(cookieid);
		UserDriveExample userDriveExample = new UserDriveExample();
		userDriveExample.or().andCookieidEqualTo(cookieid);
		UserChatExample userChatExample = new UserChatExample();
		userChatExample.or().andCookieidEqualTo(cookieid);
		try {
			List<UserSearchPost> userSearchPosts = userSearchPostMapper.selectByExample(userSearchPostExample);
			List<UserViewPost> userViewPosts = userViewPostMapper.selectByExample(userViewPostExample);
			List<UserInquirePost> userInquirePosts = userInquirePostMapper.selectByExample(userInquirePostExample);
			List<UserDrive> userDrives = userDriveMapper.selectByExample(userDriveExample);
			List<UserChat> userChats = userChatMapper.selectByExample(userChatExample);
			data.put("UserSearch", userSearchPosts);
			data.put("UserView", userViewPosts);
			data.put("UserInquire", userInquirePosts);
			data.put("UserDrive", userDrives);
			data.put("UserChat", userChats);
			return data;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}

}
