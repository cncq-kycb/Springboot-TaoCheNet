package cn.edu.swjtu.demo.Service.ServiceImpl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cn.edu.swjtu.demo.Dao.CarInfoMapper;
import cn.edu.swjtu.demo.Dao.UserInfoMapper;
import cn.edu.swjtu.demo.Dao.UserInquirePostMapper;
import cn.edu.swjtu.demo.Dao.UserViewPostMapper;
import cn.edu.swjtu.demo.Pojo.CarInfoExample;
import cn.edu.swjtu.demo.Pojo.CarInfoWithBLOBs;
import cn.edu.swjtu.demo.Pojo.UserInfo;
import cn.edu.swjtu.demo.Pojo.UserInfoExample;
import cn.edu.swjtu.demo.Pojo.UserInquirePost;
import cn.edu.swjtu.demo.Pojo.UserViewPost;
import cn.edu.swjtu.demo.Service.UserService;

@Component
public class UserServiceImpl implements UserService {

	@Autowired
	UserInfoMapper userInfoMapper;
	@Autowired
	UserViewPostMapper userViewPostMapper;
	@Autowired
	UserInquirePostMapper userInquirePostMapper;
	@Autowired
	CarInfoMapper carInfoMapper;

	@Override
	public boolean login(String username, String password) {
		try {
			UserInfoExample example = new UserInfoExample();
			example.or().andUsernameEqualTo(username).andPasswordEqualTo(password);
			if (userInfoMapper.selectByExample(example).size() == 0) {
				return false;
			}
			return true;
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}
	}

	@Override
	public UserInfo getUserInfo(String username) {
		try {
			UserInfoExample example = new UserInfoExample();
			example.setDistinct(true);
			example.or().andUsernameEqualTo(username);
			List<UserInfo> result = userInfoMapper.selectByExample(example);
			if (result.size() != 0) {
				return result.get(0);
			}
			return null;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}

	@Override
	public void viewLog(String cookieid, Long pid) {
		UserViewPost record = new UserViewPost();
		record.setCookieid(cookieid);
		record.setPid(pid);
		record.setTime(new Date());
		try {
			userViewPostMapper.insert(record);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	@Override
	public void inquireLog(String cookieid, Long pid) {
		UserInquirePost record = new UserInquirePost();
		record.setCookieid(cookieid);
		record.setPid(pid);
		record.setTime(new Date());
		try {
			userInquirePostMapper.insert(record);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	@Override
	public List<CarInfoWithBLOBs> showPosts() {
		try {
			CarInfoExample example = new CarInfoExample();
			example.or().andPidEqualTo((long) 51);
			List<CarInfoWithBLOBs> result = carInfoMapper.selectByExampleWithBLOBs(example);
			if (result.size() != 0) {
				return result;
			}
			return null;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}

}
