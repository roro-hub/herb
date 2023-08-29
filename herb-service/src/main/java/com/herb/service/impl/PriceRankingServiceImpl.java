package com.herb.service.impl;

import com.github.pagehelper.PageHelper;
import com.herb.common.util.PageUtil;
import com.herb.dao.PriceRankingDao;
import com.herb.mbg.mapper.PriceRankingMapper;
import com.herb.mbg.model.PriceRanking;
import com.herb.mbg.model.PriceRankingExample;
import com.herb.service.PriceRankingService;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class PriceRankingServiceImpl implements PriceRankingService {

    @Resource
    private PriceRankingMapper priceRankingMapper;
    @Resource
    private PriceRankingDao priceRankingDao;

    @Override
    public List<PriceRanking> latest(List<String> names, Integer pageNum, Integer pageSize, String orderBy, String sort) {
        Date latestDate = priceRankingDao.getLatestDate();
        PageHelper.startPage(pageNum, pageSize, PageUtil.getOrderBy(orderBy, sort));
        PriceRankingExample example = new PriceRankingExample();
        PriceRankingExample.Criteria criteria = example.createCriteria()
                .andNewdateEqualTo(latestDate);
        if (CollectionUtils.isNotEmpty(names)) {
            criteria.andNameIn(names);
        }
        return priceRankingMapper.selectByExample(example);
    }
}
