package com.herb.mbg.mapper;

import com.herb.mbg.model.Processing;
import com.herb.mbg.model.ProcessingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProcessingMapper {
    long countByExample(ProcessingExample example);

    int deleteByExample(ProcessingExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Processing record);

    int insertSelective(Processing record);

    List<Processing> selectByExample(ProcessingExample example);

    Processing selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Processing record, @Param("example") ProcessingExample example);

    int updateByExample(@Param("record") Processing record, @Param("example") ProcessingExample example);

    int updateByPrimaryKeySelective(Processing record);

    int updateByPrimaryKey(Processing record);
}