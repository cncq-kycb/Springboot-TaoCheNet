package cn.edu.swjtu.demo.Dao;

import cn.edu.swjtu.demo.Pojo.RecommendBusiness;
import cn.edu.swjtu.demo.Pojo.RecommendBusinessExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface RecommendBusinessMapper {
	long countByExample(RecommendBusinessExample example);

	int deleteByExample(RecommendBusinessExample example);

	int insert(RecommendBusiness record);

	int insertSelective(RecommendBusiness record);

	List<RecommendBusiness> selectByExampleWithBLOBs(RecommendBusinessExample example);

	List<RecommendBusiness> selectByExample(RecommendBusinessExample example);

	int updateByExampleSelective(@Param("record") RecommendBusiness record,
			@Param("example") RecommendBusinessExample example);

	int updateByExampleWithBLOBs(@Param("record") RecommendBusiness record,
			@Param("example") RecommendBusinessExample example);

	int updateByExample(@Param("record") RecommendBusiness record, @Param("example") RecommendBusinessExample example);
}