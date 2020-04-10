package cn.edu.swjtu.demo.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import cn.edu.swjtu.demo.Pojo.UserInfo;
import cn.edu.swjtu.demo.Pojo.UserPermission;
import cn.edu.swjtu.demo.Pojo.UserType;

@Service
public interface AdminService {

	// 获取全部用户信息
	List<UserInfo> getAllUsers();

	// 按cookieid获取用户信息
	UserInfo getUserInfo(String cookieid);

	// 获取全部用户类型
	List<UserType> getAllUserType();

	// 获取全部用户权限
	List<UserPermission> getAllUserPermission();

	// 修改用户类型，1成功，0错误失败
	int updateUserType(String cookieid, Long userTypeId);

	// 修改用户权限，1成功，0错误失败
	int updateUserPermission(String cookieid, Long userPermissionId);

	// 手动修改模型，1成功，0失败，-1错误
	String updateRecommendOnHand();

	// 设置定时器，1成功，否则失败
	String setTimer();

	// 更新模型，1成功，否则失败
	String trainModel();

}
