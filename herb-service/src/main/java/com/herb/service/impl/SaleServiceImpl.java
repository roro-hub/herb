package com.herb.service.impl;

import com.github.pagehelper.PageHelper;
import com.herb.bo.SaleBO;
import com.herb.mbg.mapper.SaleMapper;
import com.herb.mbg.model.Sale;
import com.herb.mbg.model.SaleExample;
import com.herb.service.SaleService;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SaleServiceImpl implements SaleService {

    @Resource
    private SaleMapper saleMapper;

    @Override
    public void add(Sale sale) {
        saleMapper.insert(sale);
    }

    @Override
    public void update(Sale sale) {
        saleMapper.updateByPrimaryKey(sale);
    }

    @Override
    public void delete(Long id) {
        saleMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Sale get(Long id) {
        return saleMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Sale> list(String name, String recordMonth, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        SaleExample saleExample = new SaleExample();
        SaleExample.Criteria criteria = saleExample.createCriteria();
        if (StringUtils.isNotBlank(name)) {
            criteria.andNameLike("%" + name + "%");
        }
        if (StringUtils.isNotBlank(recordMonth)) {
            criteria.andRecordMonthEqualTo(recordMonth);
        }
        return saleMapper.selectByExample(saleExample);
    }

    @Override
    public List<SaleBO> charts(List<String> names) {
//        SaleExample saleExample = new SaleExample();
//        Calendar calendar = Calendar.getInstance();
//        SaleExample.Criteria criteria = saleExample.createCriteria()
//                .andRecordMonthLike(calendar.get(Calendar.YEAR) + "%");
//        if (CollectionUtils.isNotEmpty(names)) {
//            criteria.andNameIn(names);
//        }
//        List<Sale> sales = saleMapper.selectByExample(saleExample);
//        Map<String, List<SaleBO>> result = new HashMap<>();
//        for (Sale sale : sales) {
//            List<SaleBO> saleBOList = result.get(sale.getName());
//            if (CollectionUtils.isNotEmpty(saleBOList)) {
//                saleBOList.add();
//                result.put(sale.getName(), saleBOList);
//            }
//        }
        return null;
    }
}
