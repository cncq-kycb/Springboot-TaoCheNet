package cn.edu.swjtu.demo.Dao;

import cn.edu.swjtu.demo.Pojo.CarSeries;
import cn.edu.swjtu.demo.Pojo.CarSeriesExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CarSeriesMapper {
    long countByExample(CarSeriesExample example);

    int deleteByExample(CarSeriesExample example);

    int insert(CarSeries record);

    int insertSelective(CarSeries record);

    List<CarSeries> selectByExample(CarSeriesExample example);

    int updateByExampleSelective(@Param("record") CarSeries record, @Param("example") CarSeriesExample example);

    int updateByExample(@Param("record") CarSeries record, @Param("example") CarSeriesExample example);
}