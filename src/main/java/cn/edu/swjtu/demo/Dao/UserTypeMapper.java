package cn.edu.swjtu.demo.Dao;

import cn.edu.swjtu.demo.Pojo.UserType;
import cn.edu.swjtu.demo.Pojo.UserTypeExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserTypeMapper {
    long countByExample(UserTypeExample example);

    int deleteByExample(UserTypeExample example);

    int insert(UserType record);

    int insertSelective(UserType record);

    List<UserType> selectByExample(UserTypeExample example);

    int updateByExampleSelective(@Param("record") UserType record, @Param("example") UserTypeExample example);

    int updateByExample(@Param("record") UserType record, @Param("example") UserTypeExample example);
}