package com.herb.service.impl;

import com.github.pagehelper.PageHelper;
import com.herb.mbg.mapper.ManagerMapper;
import com.herb.mbg.model.Manager;
import com.herb.mbg.model.ManagerExample;
import com.herb.service.ManagerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ManagerServiceImpl implements ManagerService {

    @Resource
    private ManagerMapper managerMapper;

    @Override
    public void add(Manager manager) {
        managerMapper.insert(manager);
    }

    @Override
    public void update(Manager manager) {
        managerMapper.updateByPrimaryKey(manager);
    }

    @Override
    public List<Manager> list(String name, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        ManagerExample managerExample = new ManagerExample();
        managerExample.createCriteria().andNameLike(name);
        return managerMapper.selectByExample(managerExample);
    }
}
