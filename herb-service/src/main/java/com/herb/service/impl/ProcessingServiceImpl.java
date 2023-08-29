package com.herb.service.impl;

import com.github.pagehelper.PageHelper;
import com.herb.common.exception.Asserts;
import com.herb.mbg.mapper.ProcessingMapper;
import com.herb.mbg.model.Processing;
import com.herb.mbg.model.ProcessingExample;
import com.herb.service.ProcessingService;
import io.micrometer.core.instrument.util.StringUtils;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class ProcessingServiceImpl implements ProcessingService {

    @Resource
    private ProcessingMapper processingMapper;

    @Override
    public void add(Processing processing) {
        // 校验药材名称不可重复
        ProcessingExample processingExample = new ProcessingExample();
        processingExample.createCriteria()
                .andTypeEqualTo(processing.getType())
                .andHerbNameEqualTo(processing.getHerbName());
        List<Processing> processings = processingMapper.selectByExample(processingExample);
        if (CollectionUtils.isNotEmpty(processings)) {
            if ("processing".equals(processing.getType())) {
                Asserts.fail("药材不可重复录入");
            } else if ("diet".equals(processing.getType())) {
                Asserts.fail("药膳不可重复录入");
            }
        }
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

    @Override
    public Set<String> getHerbList(String type) {
        ProcessingExample processingExample = new ProcessingExample();
        processingExample.createCriteria().andTypeEqualTo(type);
        List<Processing> processings = processingMapper.selectByExample(processingExample);
        return processings.stream().map(Processing::getHerbName).collect(Collectors.toSet());
    }
}
