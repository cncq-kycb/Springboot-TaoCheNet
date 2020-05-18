package cn.edu.swjtu.demo.Dao;

import cn.edu.swjtu.demo.Pojo.UserPreferView;
import cn.edu.swjtu.demo.Pojo.UserPreferViewExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserPreferViewMapper {
	long countByExample(UserPreferViewExample example);

	int deleteByExample(UserPreferViewExample example);

	int insert(UserPreferView record);

	int insertSelective(UserPreferView record);

	List<UserPreferView> selectByExample(UserPreferViewExample example);

	int updateByExampleSelective(@Param("record") UserPreferView record,
			@Param("example") UserPreferViewExample example);

	int updateByExample(@Param("record") UserPreferView record, @Param("example") UserPreferViewExample example);
}