package cn.edu.swjtu.demo.Service;

import org.springframework.stereotype.Service;

@Service
public interface UserInfoService {

	// 修改密码
	boolean changePsw(String cookieid, String oldPsw, String newPsw);

}
