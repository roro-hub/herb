package com.herb.mbg.mapper;

import com.herb.mbg.model.Price;
import com.herb.mbg.model.PriceExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PriceMapper {
    long countByExample(PriceExample example);

    int deleteByExample(PriceExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Price record);

    int insertSelective(Price record);

    List<Price> selectByExample(PriceExample example);

    Price selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Price record, @Param("example") PriceExample example);

    int updateByExample(@Param("record") Price record, @Param("example") PriceExample example);

    int updateByPrimaryKeySelective(Price record);

    int updateByPrimaryKey(Price record);
}