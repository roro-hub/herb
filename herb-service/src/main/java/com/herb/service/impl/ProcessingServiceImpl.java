package com.herb.service.impl;

import com.github.pagehelper.PageHelper;
import com.herb.mbg.mapper.ProcessingMapper;
import com.herb.mbg.model.Processing;
import com.herb.mbg.model.ProcessingExample;
import com.herb.service.ProcessingService;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ProcessingServiceImpl implements ProcessingService {

    @Resource
    private ProcessingMapper processingMapper;

    @Override
    public void add(Processing processing) {
        processingMapper.insert(processing);
    }

    @Override
    public void update(Processing processing) {
        processingMapper.updateByPrimaryKey(processing);
    }

    @Override
    public void delete(Long id) {
        processingMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Processing get(Long id) {
        return processingMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Processing> list(String name, String type, Long herbId, String herbName, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        ProcessingExample processingExample = new ProcessingExample();
        ProcessingExample.Criteria criteria = processingExample.createCriteria();
        if (StringUtils.isNotBlank(name)) {
            criteria.andNameEqualTo(name);
        }
        if (StringUtils.isNotBlank(type)) {
            criteria.andTypeEqualTo(type);
        }
        if (StringUtils.isNotBlank(herbName)) {
            criteria.andHerbNameEqualTo(herbName);
        }
        if (herbId != null && herbId > 0) {
            criteria.andHerbIdEqualTo(herbId);
        }
        return processingMapper.selectByExample(processingExample);
    }
}
