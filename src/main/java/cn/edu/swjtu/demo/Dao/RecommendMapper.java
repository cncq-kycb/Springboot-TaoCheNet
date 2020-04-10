package cn.edu.swjtu.demo.Dao;

import cn.edu.swjtu.demo.Pojo.Recommend;
import cn.edu.swjtu.demo.Pojo.RecommendExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RecommendMapper {
    long countByExample(RecommendExample example);

    int deleteByExample(RecommendExample example);

    int insert(Recommend record);

    int insertSelective(Recommend record);

    List<Recommend> selectByExampleWithBLOBs(RecommendExample example);

    List<Recommend> selectByExample(RecommendExample example);

    int updateByExampleSelective(@Param("record") Recommend record, @Param("example") RecommendExample example);

    int updateByExampleWithBLOBs(@Param("record") Recommend record, @Param("example") RecommendExample example);

    int updateByExample(@Param("record") Recommend record, @Param("example") RecommendExample example);
}