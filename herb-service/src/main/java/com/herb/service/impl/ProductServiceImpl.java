package com.herb.service.impl;

import com.github.pagehelper.PageHelper;
import com.herb.bo.ProductBO;
import com.herb.service.ProductService;
import com.herb.mbg.util.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Resource
    private ProductMapper productMapper;

    @Override
    public void add(Product product) {
        productMapper.insert(product);
    }

    @Override
    public void update(ProductBO bo) {
        BeanUtils.copyProperties(bo, Product.class);
        productMapper.updateByExample(bo);
    }

    @Override
    public List<Product> list(String name, Integer type, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        ContactExample contactExample = new ContactExample();
        contactExample.createCriteria().andNameLike(name);
        return productMapper.selectByExample(contactExample);
    }
}
