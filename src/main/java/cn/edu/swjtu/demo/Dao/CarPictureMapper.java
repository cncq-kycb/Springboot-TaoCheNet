package cn.edu.swjtu.demo.Dao;

import cn.edu.swjtu.demo.Pojo.CarPicture;
import cn.edu.swjtu.demo.Pojo.CarPictureExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CarPictureMapper {
	long countByExample(CarPictureExample example);

	int deleteByExample(CarPictureExample example);

	int insert(CarPicture record);

	int insertSelective(CarPicture record);

	List<CarPicture> selectByExample(CarPictureExample example);

	int updateByExampleSelective(@Param("record") CarPicture record, @Param("example") CarPictureExample example);

	int updateByExample(@Param("record") CarPicture record, @Param("example") CarPictureExample example);
}