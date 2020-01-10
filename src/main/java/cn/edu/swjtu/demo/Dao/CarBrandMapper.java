package cn.edu.swjtu.demo.Dao;

import cn.edu.swjtu.demo.Pojo.CarBrand;
import cn.edu.swjtu.demo.Pojo.CarBrandExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CarBrandMapper {
    long countByExample(CarBrandExample example);

    int deleteByExample(CarBrandExample example);

    int insert(CarBrand record);

    int insertSelective(CarBrand record);

    List<CarBrand> selectByExample(CarBrandExample example);

    int updateByExampleSelective(@Param("record") CarBrand record, @Param("example") CarBrandExample example);

    int updateByExample(@Param("record") CarBrand record, @Param("example") CarBrandExample example);
}