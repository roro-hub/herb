package com.herb.service;

import com.herb.mbg.model.PriceRanking;

import java.util.List;

public interface PriceRankingService {

    List<PriceRanking> latest(List<String> names, Integer pageNum, Integer pageSize,
                             String orderBy, String sort);
}
