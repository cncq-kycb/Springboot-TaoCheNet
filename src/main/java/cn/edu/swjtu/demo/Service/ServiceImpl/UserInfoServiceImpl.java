package cn.edu.swjtu.demo.Service.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cn.edu.swjtu.demo.Dao.UserInfoMapper;
import cn.edu.swjtu.demo.Dao.UserPreferMapper;
import cn.edu.swjtu.demo.Pojo.UserInfo;
import cn.edu.swjtu.demo.Pojo.UserInfoExample;
import cn.edu.swjtu.demo.Pojo.UserPrefer;
import cn.edu.swjtu.demo.Pojo.UserPreferExample;
import cn.edu.swjtu.demo.Service.UserInfoService;
import cn.edu.swjtu.demo.Utils.Utils;

@Component
public class UserInfoServiceImpl implements UserInfoService {

	@Autowired
	UserInfoMapper userInfoMapper;
	@Autowired
	UserPreferMapper userPreferMapper;

	@Override
	public boolean changePsw(String cookieid, String oldPsw, String newPsw) {
		try {
			UserInfoExample example = new UserInfoExample();
			example.or().andCookieidEqualTo(cookieid);
			List<UserInfo> userInfos = userInfoMapper.selectByExample(example);
			if (userInfos.size() == 0) {
				System.err.println("no user_info column for cookieid=" + cookieid);
				return false;
			}
			UserInfo userInfo = userInfos.get(0);
			String password = userInfo.getPassword();
			if (!password.equals(oldPsw)) {
				System.err.println("old password not match");
				return false;
			}
			userInfo.setPassword(newPsw);
			userInfoMapper.updateByExample(userInfo, example);
			return true;
		} catch (Exception e) {
			System.err.println(e);
			return false;
		}
	}

	@Override
	public void changeUserInfo(String cookieid, UserInfo userInfo, UserPrefer userPrefer) {
		try {
			UserInfoExample userInfoExample = new UserInfoExample();
			userInfoExample.or().andCookieidEqualTo(cookieid);
			userInfoMapper.updateByExample(userInfo, userInfoExample);

			UserPreferExample userPreferExample = new UserPreferExample();
			userPreferExample.or().andCookieidEqualTo(cookieid);
			userPreferMapper.updateByExample(userPrefer, userPreferExample);
		} catch (Exception e) {
			System.err.println(e);
		}
	}

	@Override
	public int signup(String username, String password, String name, String tel, String location, Integer age) {
		try {
			UserInfoExample example = new UserInfoExample();
			example.or().andUsernameEqualTo(username);
			List<UserInfo> result = userInfoMapper.selectByExample(example);
			if (result.size() != 0) {
				return 2;
			}
			UserInfo record = new UserInfo();
			record.setUsername(username);
			record.setPassword(password);
			record.setName(name);
			record.setTel(tel);
			record.setLocation(location);
			record.setAge(age);
			record.setUserTypeId((long) 3);
			record.setUserPermissionId((long) 1);
			String cookieid = Utils.getRandomCookieid();
			example.or().andCookieidEqualTo(cookieid);
			result = userInfoMapper.selectByExample(example);
			while (result.size() != 0) {
				cookieid = Utils.getRandomCookieid();
				example.or().andCookieidEqualTo(cookieid);
				result = userInfoMapper.selectByExample(example);
			}
			record.setCookieid(cookieid);
			userInfoMapper.insert(record);
			return 1;
		} catch (Exception e) {
			System.err.println(e);
			return 3;
		}
	}

}
