package cn.edu.swjtu.demo.Dao;

import cn.edu.swjtu.demo.Pojo.UserInfo;
import cn.edu.swjtu.demo.Pojo.UserInfoExample;
import cn.edu.swjtu.demo.Pojo.UserInfoKey;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserInfoMapper {
	long countByExample(UserInfoExample example);

	int deleteByExample(UserInfoExample example);

	int deleteByPrimaryKey(UserInfoKey key);

	int insert(UserInfo record);

	int insertSelective(UserInfo record);

	List<UserInfo> selectByExample(UserInfoExample example);

	UserInfo selectByPrimaryKey(UserInfoKey key);

	int updateByExampleSelective(@Param("record") UserInfo record, @Param("example") UserInfoExample example);

	int updateByExample(@Param("record") UserInfo record, @Param("example") UserInfoExample example);

	int updateByPrimaryKeySelective(UserInfo record);

	int updateByPrimaryKey(UserInfo record);
}