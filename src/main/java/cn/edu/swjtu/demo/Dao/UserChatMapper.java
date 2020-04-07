package cn.edu.swjtu.demo.Dao;

import cn.edu.swjtu.demo.Pojo.UserChat;
import cn.edu.swjtu.demo.Pojo.UserChatExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserChatMapper {
    long countByExample(UserChatExample example);

    int deleteByExample(UserChatExample example);

    int insert(UserChat record);

    int insertSelective(UserChat record);

    List<UserChat> selectByExample(UserChatExample example);

    int updateByExampleSelective(@Param("record") UserChat record, @Param("example") UserChatExample example);

    int updateByExample(@Param("record") UserChat record, @Param("example") UserChatExample example);
}