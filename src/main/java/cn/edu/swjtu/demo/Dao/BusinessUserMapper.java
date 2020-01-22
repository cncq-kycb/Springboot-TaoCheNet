package cn.edu.swjtu.demo.Dao;

import cn.edu.swjtu.demo.Pojo.BusinessUser;
import cn.edu.swjtu.demo.Pojo.BusinessUserExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BusinessUserMapper {
    long countByExample(BusinessUserExample example);

    int deleteByExample(BusinessUserExample example);

    int insert(BusinessUser record);

    int insertSelective(BusinessUser record);

    List<BusinessUser> selectByExample(BusinessUserExample example);

    int updateByExampleSelective(@Param("record") BusinessUser record, @Param("example") BusinessUserExample example);

    int updateByExample(@Param("record") BusinessUser record, @Param("example") BusinessUserExample example);
}