package cn.edu.swjtu.demo.Service.ServiceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import cn.edu.swjtu.demo.Dao.TransactionViewMapper;
import cn.edu.swjtu.demo.Dao.UserInfoMapper;
import cn.edu.swjtu.demo.Dao.UserPermissionMapper;
import cn.edu.swjtu.demo.Dao.UserTypeMapper;
import cn.edu.swjtu.demo.Dao.UserViewPostMapper;
import cn.edu.swjtu.demo.Pojo.TransactionView;
import cn.edu.swjtu.demo.Pojo.TransactionViewExample;
import cn.edu.swjtu.demo.Pojo.UserInfo;
import cn.edu.swjtu.demo.Pojo.UserInfoExample;
import cn.edu.swjtu.demo.Pojo.UserPermission;
import cn.edu.swjtu.demo.Pojo.UserPermissionExample;
import cn.edu.swjtu.demo.Pojo.UserType;
import cn.edu.swjtu.demo.Pojo.UserTypeExample;
import cn.edu.swjtu.demo.Pojo.UserViewPostExample;
import cn.edu.swjtu.demo.Service.AdminService;
import cn.edu.swjtu.demo.Utils.Utils;

@Component
public class AdminServiceImpl implements AdminService {

	@Autowired
	UserInfoMapper userInfoMapper;
	@Autowired
	UserTypeMapper userTypeMapper;
	@Autowired
	UserPermissionMapper userPermissionMapper;
	@Autowired
	TransactionViewMapper transactionViewMapper;
	@Autowired
	UserViewPostMapper userViewPostMapper;

	private boolean scheduledSwitch = false;

	@Override
	public List<UserInfo> getAllUsers() {
		try {
			UserInfoExample example = new UserInfoExample();
			example.or();
			List<UserInfo> result = userInfoMapper.selectByExample(example);
			if (result.size() != 0) {
				return result;
			}
			return new ArrayList<UserInfo>();
		} catch (Exception e) {
			System.err.println(e);
			return null;
		}
	}

	@Override
	public UserInfo getUserInfo(String cookieid) {
		try {
			UserInfoExample example = new UserInfoExample();
			example.or().andCookieidEqualTo(cookieid);
			List<UserInfo> result = userInfoMapper.selectByExample(example);
			if (result.size() != 0) {
				return result.get(0);
			}
			return new UserInfo();
		} catch (Exception e) {
			System.err.println(e);
			return null;
		}
	}

	@Override
	public List<UserType> getAllUserType() {
		try {
			UserTypeExample example = new UserTypeExample();
			example.or();
			List<UserType> result = userTypeMapper.selectByExample(example);
			if (result.size() != 0) {
				return result;
			}
			return new ArrayList<UserType>();
		} catch (Exception e) {
			System.err.println(e);
			return null;
		}
	}

	@Override
	public List<UserPermission> getAllUserPermission() {
		try {
			UserPermissionExample example = new UserPermissionExample();
			example.or();
			List<UserPermission> result = userPermissionMapper.selectByExample(example);
			if (result.size() != 0) {
				return result;
			}
			return new ArrayList<UserPermission>();
		} catch (Exception e) {
			System.err.println(e);
			return null;
		}
	}

	@Override
	public int updateUserType(String cookieid, Long userTypeId) {
		try {
			UserInfoExample example = new UserInfoExample();
			example.or().andCookieidEqualTo(cookieid);
			List<UserInfo> users = userInfoMapper.selectByExample(example);
			if (users.size() != 0) {
				UserInfo userInfo = users.get(0);
				userInfo.setUserTypeId(userTypeId);
				userInfoMapper.updateByExample(userInfo, example);
				return 1;
			}
			return 0;
		} catch (Exception e) {
			System.err.println(e);
			return 0;
		}
	}

	@Override
	public int updateUserPermission(String cookieid, Long userPermissionId) {
		try {
			UserInfoExample example = new UserInfoExample();
			example.or().andCookieidEqualTo(cookieid);
			List<UserInfo> users = userInfoMapper.selectByExample(example);
			if (users.size() != 0) {
				UserInfo userInfo = users.get(0);
				userInfo.setUserPermissionId(userPermissionId);
				userInfoMapper.updateByExample(userInfo, example);
				return 1;
			}
			return 0;
		} catch (Exception e) {
			System.err.println(e);
			return 0;
		}
	}

	@Override
	public List<TransactionView> getTransactionRecords(Integer transactionType) {
		List<TransactionView> resultList = new ArrayList<TransactionView>();
		TransactionViewExample transactionViewExample = new TransactionViewExample();
		transactionViewExample.or().andTransactionTypeEqualTo(transactionType);
		try {
			resultList = transactionViewMapper.selectByExample(transactionViewExample);
			return resultList;
		} catch (Exception e) {
			System.err.println(e);
			return resultList;
		}
	}

	@Override
	public double getRecommendClickRate() {
		try {
			UserViewPostExample userViewPostExample = new UserViewPostExample();
			userViewPostExample.or().andViewTypeEqualTo(1);
			double recommendClickTimes = userViewPostMapper.countByExample(userViewPostExample);
			userViewPostExample.clear();
			userViewPostExample.or();
			double clickTimes = userViewPostMapper.countByExample(userViewPostExample);
			return recommendClickTimes / clickTimes;
		} catch (Exception e) {
			System.err.println(e);
			return -1;
		}
	}

	@Override
	public String updateRecommendOnHand() {
		return Utils.cmdCall("python", "");
	}

	@Override
	public String setTimer() {
		// return Utils.cmdCall("python", "");
		if (scheduledSwitch == false) {
			scheduledSwitch = true;
			return "已开启定时任务";
		}
		scheduledSwitch = false;
		return "已关闭定时任务";
	}

	@Override
	public String trainModel() {
		return Utils.cmdCall("python", "F:\\QMDownload\\58RecommendationRank\\trainer.py");
	}

	// 1000 * n = n秒调度间隔, 次数表示30min调度一次
	@Scheduled(fixedRate = 1000 * 60 * 30)
	private void scheduledTask() {
		if (scheduledSwitch == true) {
			Utils.cmdCall("python", "F:\\QMDownload\\58RecommendationRank\\trainer.py");
		}
	}

}
