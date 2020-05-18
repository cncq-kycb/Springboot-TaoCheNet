package cn.edu.swjtu.demo.Service;

import org.springframework.stereotype.Service;

import cn.edu.swjtu.demo.Pojo.UserInfo;
import cn.edu.swjtu.demo.Pojo.UserPrefer;

@Service
public interface UserInfoService {

	// 修改密码
	boolean changePsw(String cookieid, String oldPsw, String newPsw);

	// 修改个人信息
	void changeUserInfo(String cookieid, UserInfo userInfo, UserPrefer userPrefer);

	// 注册新用户
	int signup(String username, String password, String name, String tel, String location, Integer age);

}
