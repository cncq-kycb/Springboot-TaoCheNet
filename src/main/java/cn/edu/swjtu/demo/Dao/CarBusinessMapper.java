package cn.edu.swjtu.demo.Dao;

import cn.edu.swjtu.demo.Pojo.CarBusiness;
import cn.edu.swjtu.demo.Pojo.CarBusinessExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CarBusinessMapper {
    long countByExample(CarBusinessExample example);

    int deleteByExample(CarBusinessExample example);

    int insert(CarBusiness record);

    int insertSelective(CarBusiness record);

    List<CarBusiness> selectByExampleWithBLOBs(CarBusinessExample example);

    List<CarBusiness> selectByExample(CarBusinessExample example);

    int updateByExampleSelective(@Param("record") CarBusiness record, @Param("example") CarBusinessExample example);

    int updateByExampleWithBLOBs(@Param("record") CarBusiness record, @Param("example") CarBusinessExample example);

    int updateByExample(@Param("record") CarBusiness record, @Param("example") CarBusinessExample example);
}