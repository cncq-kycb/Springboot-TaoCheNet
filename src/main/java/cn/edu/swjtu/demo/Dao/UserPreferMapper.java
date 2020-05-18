package cn.edu.swjtu.demo.Dao;

import cn.edu.swjtu.demo.Pojo.UserPrefer;
import cn.edu.swjtu.demo.Pojo.UserPreferExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserPreferMapper {
	long countByExample(UserPreferExample example);

	int deleteByExample(UserPreferExample example);

	int insert(UserPrefer record);

	int insertSelective(UserPrefer record);

	List<UserPrefer> selectByExample(UserPreferExample example);

	int updateByExampleSelective(@Param("record") UserPrefer record, @Param("example") UserPreferExample example);

	int updateByExample(@Param("record") UserPrefer record, @Param("example") UserPreferExample example);
}