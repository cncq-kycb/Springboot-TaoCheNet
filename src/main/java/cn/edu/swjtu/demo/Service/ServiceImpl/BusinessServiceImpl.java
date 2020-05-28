package cn.edu.swjtu.demo.Service.ServiceImpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cn.edu.swjtu.demo.Dao.CarBusinessMapper;
import cn.edu.swjtu.demo.Dao.CarInfoMapper;
import cn.edu.swjtu.demo.Dao.DriveCountMapper;
import cn.edu.swjtu.demo.Dao.InquireCountMapper;
import cn.edu.swjtu.demo.Dao.RecommendBusinessMapper;
import cn.edu.swjtu.demo.Dao.TransactionRecordMapper;
import cn.edu.swjtu.demo.Dao.TransactionViewMapper;
import cn.edu.swjtu.demo.Dao.UserChatMapper;
import cn.edu.swjtu.demo.Dao.UserDriveMapper;
import cn.edu.swjtu.demo.Dao.UserInfoMapper;
import cn.edu.swjtu.demo.Dao.UserInquirePostMapper;
import cn.edu.swjtu.demo.Dao.UserSearchPostMapper;
import cn.edu.swjtu.demo.Dao.UserViewPostMapper;
import cn.edu.swjtu.demo.Dao.ViewCountMapper;
import cn.edu.swjtu.demo.Dao.ViewRecordMapper;
import cn.edu.swjtu.demo.Pojo.CarBusiness;
import cn.edu.swjtu.demo.Pojo.CarBusinessExample;
import cn.edu.swjtu.demo.Pojo.CarInfo;
import cn.edu.swjtu.demo.Pojo.CarInfoExample;
import cn.edu.swjtu.demo.Pojo.CarInfoWithBLOBs;
import cn.edu.swjtu.demo.Pojo.DriveCount;
import cn.edu.swjtu.demo.Pojo.DriveCountExample;
import cn.edu.swjtu.demo.Pojo.InquireCount;
import cn.edu.swjtu.demo.Pojo.InquireCountExample;
import cn.edu.swjtu.demo.Pojo.RecommendBusiness;
import cn.edu.swjtu.demo.Pojo.RecommendBusinessExample;
import cn.edu.swjtu.demo.Pojo.TransactionRecord;
import cn.edu.swjtu.demo.Pojo.TransactionRecordExample;
import cn.edu.swjtu.demo.Pojo.TransactionView;
import cn.edu.swjtu.demo.Pojo.TransactionViewExample;
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
import cn.edu.swjtu.demo.Pojo.ViewCount;
import cn.edu.swjtu.demo.Pojo.ViewCountExample;
import cn.edu.swjtu.demo.Pojo.ViewRecord;
import cn.edu.swjtu.demo.Pojo.ViewRecordExample;
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
	@Autowired
	TransactionViewMapper transactionViewMapper;
	@Autowired
	TransactionRecordMapper transactionRecordMapper;
	@Autowired
	ViewCountMapper viewCountMapper;
	@Autowired
	InquireCountMapper inquireCountMapper;
	@Autowired
	DriveCountMapper driveCountMapper;
	@Autowired
	ViewRecordMapper viewRecordMapper;

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
						for (UserInfo userInfo : userInfos) {
							if (userInfo.getInfoPermission().equals(0)) {
								userInfo.setAge("用户未授权");
								userInfo.setTel("用户未授权");
							}
						}
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

	@SuppressWarnings("rawtypes")
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

	@Override
	public List<TransactionView> getBuyList(String cookieid) {
		try {
			TransactionViewExample transactionViewExample = new TransactionViewExample();
			transactionViewExample.setOrderByClause("transaction_status ASC");
			transactionViewExample.or().andBusinessCookieidEqualTo(cookieid);
			List<TransactionView> transactionViews = transactionViewMapper.selectByExample(transactionViewExample);
			return transactionViews;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}

	@Override
	public int sellCar(Long recordId) {
		try {
			TransactionRecordExample transactionRecordExample = new TransactionRecordExample();
			transactionRecordExample.or().andRecordIdEqualTo(recordId);
			List<TransactionRecord> transactionRecords = transactionRecordMapper
					.selectByExample(transactionRecordExample);
			if (transactionRecords.size() != 0) {
				if (transactionRecords.get(0).getTransactionStatus() == 0) {
					TransactionRecord transactionRecord = new TransactionRecord();
					transactionRecord.setRecordId(recordId);
					transactionRecord.setTransactionStatus(1);
					transactionRecord.setRecordTime(new Date());
					transactionRecordMapper.updateByExampleSelective(transactionRecord, transactionRecordExample);
					return 1;
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;
	}

	@Override
	public HashMap<String, Object> getViewCount(String pid) {
		HashMap<String, Object> result = new HashMap<String, Object>();
		ViewCountExample viewCountExample = new ViewCountExample();
		viewCountExample.or();
		ViewRecordExample viewRecordExample = new ViewRecordExample();
		viewRecordExample.or();
		try {
			List<ViewCount> viewCounts = viewCountMapper.selectByExample(viewCountExample);
			List<ViewRecord> viewRecords = viewRecordMapper.selectByExample(viewRecordExample);
			int total = 0;
			for (ViewCount viewCount : viewCounts) {
				total += viewCount.getViewCount();
			}
			for (ViewRecord viewRecord : viewRecords) {
				if (viewRecord.getInfoPermission().equals(0)) {
					viewRecord.setAge("用户未授权");
					viewRecord.setTel("用户未授权");
				}
			}
			result.put("ViewRecord", viewRecords);
			result.put("ViewCount", total);
		} catch (Exception e) {
			System.out.println(e);
		}
		return result;
	}

	@Override
	public List<InquireCount> getInquireCount(String pid) {
		try {
			InquireCountExample inquireCountExample = new InquireCountExample();
			inquireCountExample.or().andPidEqualTo(new Long(pid));
			List<InquireCount> inquireCounts = inquireCountMapper.selectByExample(inquireCountExample);
			for (InquireCount inquireCount : inquireCounts) {
				if (inquireCount.getInfoPermission().equals(0)) {
					inquireCount.setAge("用户未授权");
					inquireCount.setTel("用户未授权");
				}
			}
			return inquireCounts;
		} catch (Exception e) {
			System.out.println(e);
		}
		return new ArrayList<InquireCount>();
	}

	@Override
	public List<DriveCount> getDriveCount(String pid) {
		try {
			DriveCountExample driveCountExample = new DriveCountExample();
			driveCountExample.or().andPidEqualTo(new Long(pid));
			List<DriveCount> driveCounts = driveCountMapper.selectByExample(driveCountExample);
			for (DriveCount driveCount : driveCounts) {
				if (driveCount.getInfoPermission().equals(0)) {
					driveCount.setAge("用户未授权");
					driveCount.setTel("用户未授权");
				}
			}
			return driveCounts;
		} catch (Exception e) {
			System.out.println(e);
		}
		return new ArrayList<DriveCount>();
	}

}
