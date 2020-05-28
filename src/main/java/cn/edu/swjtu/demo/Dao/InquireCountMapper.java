package cn.edu.swjtu.demo.Dao;

import cn.edu.swjtu.demo.Pojo.InquireCount;
import cn.edu.swjtu.demo.Pojo.InquireCountExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface InquireCountMapper {
	long countByExample(InquireCountExample example);

	int deleteByExample(InquireCountExample example);

	int insert(InquireCount record);

	int insertSelective(InquireCount record);

	List<InquireCount> selectByExample(InquireCountExample example);

	int updateByExampleSelective(@Param("record") InquireCount record, @Param("example") InquireCountExample example);

	int updateByExample(@Param("record") InquireCount record, @Param("example") InquireCountExample example);
}