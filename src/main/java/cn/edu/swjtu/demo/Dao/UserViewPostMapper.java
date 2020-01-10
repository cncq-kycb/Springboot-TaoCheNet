package cn.edu.swjtu.demo.Dao;

import cn.edu.swjtu.demo.Pojo.UserViewPost;
import cn.edu.swjtu.demo.Pojo.UserViewPostExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserViewPostMapper {
    long countByExample(UserViewPostExample example);

    int deleteByExample(UserViewPostExample example);

    int insert(UserViewPost record);

    int insertSelective(UserViewPost record);

    List<UserViewPost> selectByExample(UserViewPostExample example);

    int updateByExampleSelective(@Param("record") UserViewPost record, @Param("example") UserViewPostExample example);

    int updateByExample(@Param("record") UserViewPost record, @Param("example") UserViewPostExample example);
}