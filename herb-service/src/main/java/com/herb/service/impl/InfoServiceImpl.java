package com.herb.service.impl;

import com.github.pagehelper.PageHelper;
import com.herb.mbg.mapper.InfoMapper;
import com.herb.mbg.model.Info;
import com.herb.mbg.model.InfoExample;
import com.herb.service.InfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class InfoServiceImpl implements InfoService {

    @Resource
    private InfoMapper infoMapper;

    @Override
    public void add(Info info) {
        infoMapper.insert(info);
    }

    @Override
    public void update(Info info) {
        infoMapper.updateByPrimaryKey(info);
    }

    @Override
    public List<Info> list(String type, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        InfoExample infoExample = new InfoExample();
        infoExample.createCriteria().andTypeEqualTo(type);
        return infoMapper.selectByExample(infoExample);
    }
}
