package com.herb.mbg.mapper;

import com.herb.mbg.model.HerbType;
import com.herb.mbg.model.HerbTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HerbTypeMapper {
    long countByExample(HerbTypeExample example);

    int deleteByExample(HerbTypeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(HerbType record);

    int insertSelective(HerbType record);

    List<HerbType> selectByExample(HerbTypeExample example);

    HerbType selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") HerbType record, @Param("example") HerbTypeExample example);

    int updateByExample(@Param("record") HerbType record, @Param("example") HerbTypeExample example);

    int updateByPrimaryKeySelective(HerbType record);

    int updateByPrimaryKey(HerbType record);
}