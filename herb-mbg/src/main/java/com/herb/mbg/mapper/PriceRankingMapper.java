package com.herb.mbg.mapper;

import com.herb.mbg.model.PriceRanking;
import com.herb.mbg.model.PriceRankingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PriceRankingMapper {
    long countByExample(PriceRankingExample example);

    int deleteByExample(PriceRankingExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PriceRanking record);

    int insertSelective(PriceRanking record);

    List<PriceRanking> selectByExample(PriceRankingExample example);

    PriceRanking selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PriceRanking record, @Param("example") PriceRankingExample example);

    int updateByExample(@Param("record") PriceRanking record, @Param("example") PriceRankingExample example);

    int updateByPrimaryKeySelective(PriceRanking record);

    int updateByPrimaryKey(PriceRanking record);
}