package cn.edu.swjtu.demo.Dao;

import cn.edu.swjtu.demo.Pojo.CarColor;
import cn.edu.swjtu.demo.Pojo.CarColorExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CarColorMapper {
	long countByExample(CarColorExample example);

	int deleteByExample(CarColorExample example);

	int insert(CarColor record);

	int insertSelective(CarColor record);

	List<CarColor> selectByExample(CarColorExample example);

	int updateByExampleSelective(@Param("record") CarColor record, @Param("example") CarColorExample example);

	int updateByExample(@Param("record") CarColor record, @Param("example") CarColorExample example);
}