package cn.edu.swjtu.demo.Dao;

import cn.edu.swjtu.demo.Pojo.UserDrive;
import cn.edu.swjtu.demo.Pojo.UserDriveExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserDriveMapper {
    long countByExample(UserDriveExample example);

    int deleteByExample(UserDriveExample example);

    int insert(UserDrive record);

    int insertSelective(UserDrive record);

    List<UserDrive> selectByExample(UserDriveExample example);

    int updateByExampleSelective(@Param("record") UserDrive record, @Param("example") UserDriveExample example);

    int updateByExample(@Param("record") UserDrive record, @Param("example") UserDriveExample example);
}