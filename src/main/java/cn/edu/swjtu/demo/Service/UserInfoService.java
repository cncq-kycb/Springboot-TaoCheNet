package cn.edu.swjtu.demo.Service;

import org.springframework.stereotype.Service;

import cn.edu.swjtu.demo.Pojo.UserInfo;

@Service
public interface UserInfoService {

	// 修改密码
	boolean changePsw(String cookieid, String oldPsw, String newPsw);

	// 修改个人信息
	void changeUserInfo(String cookieid, UserInfo userInfo);

}
