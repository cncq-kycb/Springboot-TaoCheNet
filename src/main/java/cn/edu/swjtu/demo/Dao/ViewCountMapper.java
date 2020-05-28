package cn.edu.swjtu.demo.Dao;

import cn.edu.swjtu.demo.Pojo.ViewCount;
import cn.edu.swjtu.demo.Pojo.ViewCountExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ViewCountMapper {
	long countByExample(ViewCountExample example);

	int deleteByExample(ViewCountExample example);

	int insert(ViewCount record);

	int insertSelective(ViewCount record);

	List<ViewCount> selectByExample(ViewCountExample example);

	int updateByExampleSelective(@Param("record") ViewCount record, @Param("example") ViewCountExample example);

	int updateByExample(@Param("record") ViewCount record, @Param("example") ViewCountExample example);
}