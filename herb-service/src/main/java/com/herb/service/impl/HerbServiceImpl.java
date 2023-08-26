package com.herb.service.impl;

import com.github.pagehelper.PageHelper;
import com.herb.mbg.mapper.HerbMapper;
import com.herb.mbg.model.Herb;
import com.herb.mbg.model.HerbExample;
import com.herb.service.HerbService;
import org.apache.commons.lang.StringUtils;
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
    public void delete(Long id) {
        herbMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Herb get(Long id) {
        return herbMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Herb> list(String name, Long herbType, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        HerbExample herbExample = new HerbExample();
        HerbExample.Criteria criteria = herbExample.createCriteria();
        if (StringUtils.isNotBlank(name)) {
            criteria.andNameLike(name);
        }
        if (herbType != null && herbType > 0) {
            criteria.andHerbTypeEqualTo(herbType);
        }
        return herbMapper.selectByExample(herbExample);
    }
}
