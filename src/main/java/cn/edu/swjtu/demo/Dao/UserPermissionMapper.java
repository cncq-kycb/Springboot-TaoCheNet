package cn.edu.swjtu.demo.Dao;

import cn.edu.swjtu.demo.Pojo.UserPermission;
import cn.edu.swjtu.demo.Pojo.UserPermissionExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserPermissionMapper {
    long countByExample(UserPermissionExample example);

    int deleteByExample(UserPermissionExample example);

    int insert(UserPermission record);

    int insertSelective(UserPermission record);

    List<UserPermission> selectByExample(UserPermissionExample example);

    int updateByExampleSelective(@Param("record") UserPermission record, @Param("example") UserPermissionExample example);

    int updateByExample(@Param("record") UserPermission record, @Param("example") UserPermissionExample example);
}