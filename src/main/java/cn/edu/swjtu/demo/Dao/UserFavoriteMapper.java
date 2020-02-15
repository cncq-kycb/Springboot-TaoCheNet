package cn.edu.swjtu.demo.Dao;

import cn.edu.swjtu.demo.Pojo.UserFavorite;
import cn.edu.swjtu.demo.Pojo.UserFavoriteExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserFavoriteMapper {
    long countByExample(UserFavoriteExample example);

    int deleteByExample(UserFavoriteExample example);

    int insert(UserFavorite record);

    int insertSelective(UserFavorite record);

    List<UserFavorite> selectByExample(UserFavoriteExample example);

    int updateByExampleSelective(@Param("record") UserFavorite record, @Param("example") UserFavoriteExample example);

    int updateByExample(@Param("record") UserFavorite record, @Param("example") UserFavoriteExample example);
}