package cn.edu.swjtu.demo.Service.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cn.edu.swjtu.demo.Dao.UserInfoMapper;
import cn.edu.swjtu.demo.Pojo.UserInfo;
import cn.edu.swjtu.demo.Pojo.UserInfoExample;
import cn.edu.swjtu.demo.Service.UserInfoService;

@Component
public class UserInfoServiceImpl implements UserInfoService {

	@Autowired
	UserInfoMapper userInfoMapper;

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
	public void changeUserInfo(String cookieid, UserInfo userInfo) {
		try {
			UserInfoExample example = new UserInfoExample();
			example.or().andCookieidEqualTo(cookieid);
			userInfoMapper.updateByExample(userInfo, example);
		} catch (Exception e) {
			System.err.println(e);
		}
	}

}
