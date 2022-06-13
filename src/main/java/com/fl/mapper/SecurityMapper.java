package com.fl.mapper;

import com.fl.model.Security;
import com.fl.model.SecurityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SecurityMapper {
    long countByExample(SecurityExample example);

    int deleteByExample(SecurityExample example);

    int deleteByPrimaryKey(String vcScode);

    int insert(Security record);

    int insertSelective(Security record);

    List<Security> selectByExample(SecurityExample example);

    Security selectByPrimaryKey(String vcScode);

    int updateByExampleSelective(@Param("record") Security record, @Param("example") SecurityExample example);

    int updateByExample(@Param("record") Security record, @Param("example") SecurityExample example);

    int updateByPrimaryKeySelective(Security record);

    int updateByPrimaryKey(Security record);
}