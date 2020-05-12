package cn.edu.swjtu.demo.Dao;

import cn.edu.swjtu.demo.Pojo.TransactionView;
import cn.edu.swjtu.demo.Pojo.TransactionViewExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TransactionViewMapper {
	long countByExample(TransactionViewExample example);

	int deleteByExample(TransactionViewExample example);

	int insert(TransactionView record);

	int insertSelective(TransactionView record);

	List<TransactionView> selectByExample(TransactionViewExample example);

	int updateByExampleSelective(@Param("record") TransactionView record,
			@Param("example") TransactionViewExample example);

	int updateByExample(@Param("record") TransactionView record, @Param("example") TransactionViewExample example);
}