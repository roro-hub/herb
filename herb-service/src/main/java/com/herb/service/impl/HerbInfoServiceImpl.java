package com.herb.service.impl;

import com.github.pagehelper.PageHelper;
import com.herb.mbg.mapper.HerbInfoMapper;
import com.herb.mbg.model.HerbInfo;
import com.herb.mbg.model.HerbInfoExample;
import com.herb.service.HerbInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class HerbInfoServiceImpl implements HerbInfoService {

    @Resource
    private HerbInfoMapper herbInfoMapper;

    @Override
    public void add(HerbInfo herbInfo) {
        herbInfoMapper.insert(herbInfo);
    }

    @Override
    public void update(HerbInfo herbInfo) {
        herbInfoMapper.updateByPrimaryKey(herbInfo);
    }

    @Override
    public List<HerbInfo> list(String type, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        HerbInfoExample herbInfoExample = new HerbInfoExample();
        herbInfoExample.createCriteria().andTypeEqualTo(type);
        return herbInfoMapper.selectByExample(herbInfoExample);
    }
}
