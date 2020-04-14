package cn.edu.swjtu.demo.Dao;

import cn.edu.swjtu.demo.Pojo.RecommenderList;
import cn.edu.swjtu.demo.Pojo.RecommenderListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RecommenderListMapper {
    long countByExample(RecommenderListExample example);

    int deleteByExample(RecommenderListExample example);

    int insert(RecommenderList record);

    int insertSelective(RecommenderList record);

    List<RecommenderList> selectByExampleWithBLOBs(RecommenderListExample example);

    List<RecommenderList> selectByExample(RecommenderListExample example);

    int updateByExampleSelective(@Param("record") RecommenderList record, @Param("example") RecommenderListExample example);

    int updateByExampleWithBLOBs(@Param("record") RecommenderList record, @Param("example") RecommenderListExample example);

    int updateByExample(@Param("record") RecommenderList record, @Param("example") RecommenderListExample example);
}