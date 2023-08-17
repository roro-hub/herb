package com.herb.mbg.mapper;

import com.herb.mbg.model.HerbInfo;
import com.herb.mbg.model.HerbInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HerbInfoMapper {
    long countByExample(HerbInfoExample example);

    int deleteByExample(HerbInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(HerbInfo record);

    int insertSelective(HerbInfo record);

    List<HerbInfo> selectByExample(HerbInfoExample example);

    HerbInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") HerbInfo record, @Param("example") HerbInfoExample example);

    int updateByExample(@Param("record") HerbInfo record, @Param("example") HerbInfoExample example);

    int updateByPrimaryKeySelective(HerbInfo record);

    int updateByPrimaryKey(HerbInfo record);
}