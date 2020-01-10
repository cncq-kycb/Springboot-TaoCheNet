package cn.edu.swjtu.demo.Dao;

import cn.edu.swjtu.demo.Pojo.CarClassify;
import cn.edu.swjtu.demo.Pojo.CarClassifyExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CarClassifyMapper {
    long countByExample(CarClassifyExample example);

    int deleteByExample(CarClassifyExample example);

    int insert(CarClassify record);

    int insertSelective(CarClassify record);

    List<CarClassify> selectByExample(CarClassifyExample example);

    int updateByExampleSelective(@Param("record") CarClassify record, @Param("example") CarClassifyExample example);

    int updateByExample(@Param("record") CarClassify record, @Param("example") CarClassifyExample example);
}