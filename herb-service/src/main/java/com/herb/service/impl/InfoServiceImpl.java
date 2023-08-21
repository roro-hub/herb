package com.herb.service.impl;

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
    public void delete(Long id) {
        infoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Info get(String type) {
        InfoExample infoExample = new InfoExample();
        infoExample.createCriteria().andTypeEqualTo(type);
        List<Info> infos = infoMapper.selectByExample(infoExample);
        return infos.size() > 0 ? infos.get(0) : null;
    }

}
