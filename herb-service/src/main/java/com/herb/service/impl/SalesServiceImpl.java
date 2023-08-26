package com.herb.service.impl;

import com.github.pagehelper.PageHelper;
import com.herb.mbg.mapper.SalesMapper;
import com.herb.mbg.model.Sales;
import com.herb.mbg.model.SalesExample;
import com.herb.service.SalesService;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.MapUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.time.DateFormatUtils;
import org.apache.commons.lang.time.DateUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.*;

@Service
public class SalesServiceImpl implements SalesService {

    @Resource
    private SalesMapper salesMapper;

    @Override
    public void add(Sales sales) {
        salesMapper.insert(sales);
    }

    @Override
    public void update(Sales sales) {
        salesMapper.updateByPrimaryKey(sales);
    }

    @Override
    public void delete(Long id) {
        salesMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Sales get(Long id) {
        return salesMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Sales> list(String name,
                            String type,
                            Long herbId,
                            String recordMonth,
                            Integer pageSize,
                            Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        SalesExample salesExample = new SalesExample();
        SalesExample.Criteria criteria = salesExample.createCriteria();
        if (StringUtils.isNotBlank(name)) {
            criteria.andNameLike("%" + name + "%");
        }
        if (herbId != null && herbId > 0) {
            criteria.andHerbIdEqualTo(herbId);
        }
        if (StringUtils.isNotBlank(type)) {
            criteria.andTypeEqualTo(type);
        }
        if (StringUtils.isNotBlank(recordMonth)) {
            criteria.andRecordMonthEqualTo(recordMonth);
        }
        return salesMapper.selectByExample(salesExample);
    }

    @Override
    public Map<String, Map<String, BigDecimal>> recently(List<String> names, Integer month, String type) {
        SalesExample salesExample = new SalesExample();
        SalesExample.Criteria criteria = salesExample.createCriteria()
                .andTypeEqualTo(type);;

        if (month != null && month > 0) {
            String startDate = DateFormatUtils.format(DateUtils.addMonths(new Date(), -month), "yyyy-MM");
            String endDate = DateFormatUtils.format(new Date(), "yyyy-MM");
            criteria.andRecordMonthGreaterThan(startDate);
            criteria.andRecordMonthLessThanOrEqualTo(endDate);
        }
        if (CollectionUtils.isNotEmpty(names)) {
            criteria.andNameIn(names);
        }
        List<Sales> salesList = salesMapper.selectByExample(salesExample);
        Map<String, Map<String, BigDecimal>> result = new HashMap<>();
        for (Sales sales : salesList) {
            Map<String, BigDecimal> map = result.get(sales.getName());
            if (MapUtils.isEmpty(map)) {
                map = new HashMap<>();
                result.put(sales.getName(), map);
            }
            map.put(sales.getRecordMonth(), sales.getQuantity());
        }
        return result;
    }
}
