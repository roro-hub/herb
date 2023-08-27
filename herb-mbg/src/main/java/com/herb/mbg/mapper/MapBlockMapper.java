package com.herb.mbg.mapper;

import com.herb.mbg.model.MapBlock;
import com.herb.mbg.model.MapBlockExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MapBlockMapper {
    long countByExample(MapBlockExample example);

    int deleteByExample(MapBlockExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MapBlock record);

    int insertSelective(MapBlock record);

    List<MapBlock> selectByExampleWithBLOBs(MapBlockExample example);

    List<MapBlock> selectByExample(MapBlockExample example);

    MapBlock selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MapBlock record, @Param("example") MapBlockExample example);

    int updateByExampleWithBLOBs(@Param("record") MapBlock record, @Param("example") MapBlockExample example);

    int updateByExample(@Param("record") MapBlock record, @Param("example") MapBlockExample example);

    int updateByPrimaryKeySelective(MapBlock record);

    int updateByPrimaryKeyWithBLOBs(MapBlock record);

    int updateByPrimaryKey(MapBlock record);
}