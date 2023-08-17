package com.herb.mbg.mapper;

import com.herb.mbg.model.Herb;
import com.herb.mbg.model.HerbExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HerbMapper {
    long countByExample(HerbExample example);

    int deleteByExample(HerbExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Herb record);

    int insertSelective(Herb record);

    List<Herb> selectByExample(HerbExample example);

    Herb selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Herb record, @Param("example") HerbExample example);

    int updateByExample(@Param("record") Herb record, @Param("example") HerbExample example);

    int updateByPrimaryKeySelective(Herb record);

    int updateByPrimaryKey(Herb record);
}