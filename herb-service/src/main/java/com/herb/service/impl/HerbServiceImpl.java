package com.herb.service.impl;

import com.github.pagehelper.PageHelper;
import com.herb.mbg.mapper.HerbMapper;
import com.herb.mbg.model.Herb;
import com.herb.mbg.model.HerbExample;
import com.herb.service.HerbService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class HerbServiceImpl implements HerbService {

    @Resource
    private HerbMapper herbMapper;

    @Override
    public void add(Herb Herb) {
        herbMapper.insert(Herb);
    }

    @Override
    public void update(Herb Herb) {
        herbMapper.updateByPrimaryKey(Herb);
    }

    @Override
    public List<Herb> list(String name, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        HerbExample herbExample = new HerbExample();
        herbExample.createCriteria().andNameLike(name);
        return herbMapper.selectByExample(herbExample);
    }
}
