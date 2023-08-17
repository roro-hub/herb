package com.herb.mbg.mapper;

import com.herb.mbg.model.Weather;
import com.herb.mbg.model.WeatherExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WeatherMapper {
    long countByExample(WeatherExample example);

    int deleteByExample(WeatherExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Weather record);

    int insertSelective(Weather record);

    List<Weather> selectByExample(WeatherExample example);

    Weather selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Weather record, @Param("example") WeatherExample example);

    int updateByExample(@Param("record") Weather record, @Param("example") WeatherExample example);

    int updateByPrimaryKeySelective(Weather record);

    int updateByPrimaryKey(Weather record);

    /**
     * 获取最新的天气信息
     */
    Weather getLately();
}