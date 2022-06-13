package com.fl.mapper;

import com.fl.model.DmBscEquityquote;
import com.fl.model.DmBscEquityquoteExample;
import com.fl.model.DmBscEquityquoteKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DmBscEquityquoteMapper {
    long countByExample(DmBscEquityquoteExample example);

    int deleteByExample(DmBscEquityquoteExample example);

    int deleteByPrimaryKey(DmBscEquityquoteKey key);

    int insert(DmBscEquityquote record);

    int insertSelective(DmBscEquityquote record);

    List<DmBscEquityquote> selectByExample(DmBscEquityquoteExample example);

    DmBscEquityquote selectByPrimaryKey(DmBscEquityquoteKey key);

    int updateByExampleSelective(@Param("record") DmBscEquityquote record, @Param("example") DmBscEquityquoteExample example);

    int updateByExample(@Param("record") DmBscEquityquote record, @Param("example") DmBscEquityquoteExample example);

    int updateByPrimaryKeySelective(DmBscEquityquote record);

    int updateByPrimaryKey(DmBscEquityquote record);
}