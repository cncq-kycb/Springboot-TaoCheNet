package cn.edu.swjtu.demo.Dao;

import cn.edu.swjtu.demo.Pojo.DriveCount;
import cn.edu.swjtu.demo.Pojo.DriveCountExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface DriveCountMapper {
	long countByExample(DriveCountExample example);

	int deleteByExample(DriveCountExample example);

	int insert(DriveCount record);

	int insertSelective(DriveCount record);

	List<DriveCount> selectByExample(DriveCountExample example);

	int updateByExampleSelective(@Param("record") DriveCount record, @Param("example") DriveCountExample example);

	int updateByExample(@Param("record") DriveCount record, @Param("example") DriveCountExample example);
}