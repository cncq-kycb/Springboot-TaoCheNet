package cn.edu.swjtu.demo.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import cn.edu.swjtu.demo.Pojo.CarInfoWithBLOBs;
import cn.edu.swjtu.demo.Pojo.UserInfo;

@Service
public interface UserService {
	// 用户登录
	boolean login(String username, String password);

	// 获取用户POJO
	UserInfo getUserInfo(String username);

	// 记录用户浏览日志
	void viewLog(String cookieid, Long pid);

	// 记录用户咨询日志
	void inquireLog(String cookieid, Long pid);

	// 展示全部帖子
	List<CarInfoWithBLOBs> showPosts();

	// 记录用户搜索日志
	// void searchLog(String cookieid, Long pid);

}
