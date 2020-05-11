package cn.edu.swjtu.demo.Dao;

import cn.edu.swjtu.demo.Pojo.TransactionRecord;
import cn.edu.swjtu.demo.Pojo.TransactionRecordExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TransactionRecordMapper {
	long countByExample(TransactionRecordExample example);

	int deleteByExample(TransactionRecordExample example);

	int insert(TransactionRecord record);

	int insertSelective(TransactionRecord record);

	List<TransactionRecord> selectByExample(TransactionRecordExample example);

	int updateByExampleSelective(@Param("record") TransactionRecord record,
			@Param("example") TransactionRecordExample example);

	int updateByExample(@Param("record") TransactionRecord record, @Param("example") TransactionRecordExample example);
}