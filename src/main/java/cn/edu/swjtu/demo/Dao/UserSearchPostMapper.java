package cn.edu.swjtu.demo.Dao;

import cn.edu.swjtu.demo.Pojo.UserSearchPost;
import cn.edu.swjtu.demo.Pojo.UserSearchPostExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserSearchPostMapper {
    long countByExample(UserSearchPostExample example);

    int deleteByExample(UserSearchPostExample example);

    int insert(UserSearchPost record);

    int insertSelective(UserSearchPost record);

    List<UserSearchPost> selectByExample(UserSearchPostExample example);

    int updateByExampleSelective(@Param("record") UserSearchPost record, @Param("example") UserSearchPostExample example);

    int updateByExample(@Param("record") UserSearchPost record, @Param("example") UserSearchPostExample example);
}