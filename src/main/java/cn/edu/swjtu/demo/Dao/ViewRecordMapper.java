package cn.edu.swjtu.demo.Dao;

import cn.edu.swjtu.demo.Pojo.ViewRecord;
import cn.edu.swjtu.demo.Pojo.ViewRecordExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ViewRecordMapper {
	long countByExample(ViewRecordExample example);

	int deleteByExample(ViewRecordExample example);

	int insert(ViewRecord record);

	int insertSelective(ViewRecord record);

	List<ViewRecord> selectByExample(ViewRecordExample example);

	int updateByExampleSelective(@Param("record") ViewRecord record, @Param("example") ViewRecordExample example);

	int updateByExample(@Param("record") ViewRecord record, @Param("example") ViewRecordExample example);
}