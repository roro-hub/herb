package com.herb.service.impl;

import com.github.pagehelper.PageHelper;
import com.herb.mbg.mapper.HerbTypeMapper;
import com.herb.mbg.model.HerbType;
import com.herb.mbg.model.HerbTypeExample;
import com.herb.service.HerbTypeService;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class HerbTypeServiceImpl implements HerbTypeService {

    @Resource
    private HerbTypeMapper herbTypeMapper;

    @Override
    public void add(HerbType HerbType) {
        herbTypeMapper.insert(HerbType);
    }

    @Override
    public void update(HerbType HerbType) {
        herbTypeMapper.updateByPrimaryKey(HerbType);
    }

    @Override
    public void delete(Long id) {
        herbTypeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public HerbType get(Long id) {
        return herbTypeMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<HerbType> list(String name, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        HerbTypeExample herbTypeExample = new HerbTypeExample();
        if (StringUtils.isNotBlank(name)) {
            herbTypeExample.createCriteria().andNameLike(name);
        }
        return herbTypeMapper.selectByExample(herbTypeExample);
    }
}
