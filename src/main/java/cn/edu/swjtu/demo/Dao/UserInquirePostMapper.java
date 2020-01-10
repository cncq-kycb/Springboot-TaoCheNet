package cn.edu.swjtu.demo.Dao;

import cn.edu.swjtu.demo.Pojo.UserInquirePost;
import cn.edu.swjtu.demo.Pojo.UserInquirePostExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserInquirePostMapper {
    long countByExample(UserInquirePostExample example);

    int deleteByExample(UserInquirePostExample example);

    int insert(UserInquirePost record);

    int insertSelective(UserInquirePost record);

    List<UserInquirePost> selectByExample(UserInquirePostExample example);

    int updateByExampleSelective(@Param("record") UserInquirePost record, @Param("example") UserInquirePostExample example);

    int updateByExample(@Param("record") UserInquirePost record, @Param("example") UserInquirePostExample example);
}