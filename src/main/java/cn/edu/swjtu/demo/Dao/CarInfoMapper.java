package cn.edu.swjtu.demo.Dao;

import cn.edu.swjtu.demo.Pojo.CarInfo;
import cn.edu.swjtu.demo.Pojo.CarInfoExample;
import cn.edu.swjtu.demo.Pojo.CarInfoWithBLOBs;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CarInfoMapper {
	long countByExample(CarInfoExample example);

	int deleteByExample(CarInfoExample example);

	int insert(CarInfoWithBLOBs record);

	int insertSelective(CarInfoWithBLOBs record);

	List<CarInfoWithBLOBs> selectByExampleWithBLOBs(CarInfoExample example);

	List<CarInfo> selectByExample(CarInfoExample example);

	int updateByExampleSelective(@Param("record") CarInfoWithBLOBs record, @Param("example") CarInfoExample example);

	int updateByExampleWithBLOBs(@Param("record") CarInfoWithBLOBs record, @Param("example") CarInfoExample example);

	int updateByExample(@Param("record") CarInfo record, @Param("example") CarInfoExample example);

	List<CarInfoWithBLOBs> selectRandom();

	List<CarInfoWithBLOBs> searchByCondition(@Param("brand_id") Integer brand_id, @Param("series_id") Integer series_id,
			@Param("classify_id") Integer classify_id, @Param("paifang") String paifang, @Param("cid") Integer cid,
			@Param("licheng") Integer licheng);
}