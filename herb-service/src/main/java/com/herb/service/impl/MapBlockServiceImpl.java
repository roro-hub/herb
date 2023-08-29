package com.herb.service.impl;

import com.github.pagehelper.PageHelper;
import com.herb.mbg.mapper.MapBlockMapper;
import com.herb.mbg.model.MapBlock;
import com.herb.mbg.model.MapBlockExample;
import com.herb.service.MapBlockService;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MapBlockServiceImpl implements MapBlockService {

    @Resource
    private MapBlockMapper mapBlockMapper;

    @Override
    public void add(MapBlock mapBlock) {
        mapBlockMapper.insert(mapBlock);
    }

    @Override
    public void update(MapBlock mapBlock) {
        mapBlockMapper.updateByPrimaryKeyWithBLOBs(mapBlock);
    }

    @Override
    public void delete(Long id) {
        mapBlockMapper.deleteByPrimaryKey(id);
    }

    @Override
    public MapBlock get(Long id) {
        return mapBlockMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<MapBlock> list(String name, String type, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        MapBlockExample mapBlockExample = new MapBlockExample();
        MapBlockExample.Criteria criteria = mapBlockExample.createCriteria().andTypeEqualTo(type);
        if (StringUtils.isNotBlank(name)) {
            criteria.andNameLike("%" + name + "%");
        }
        return mapBlockMapper.selectByExampleWithBLOBs(mapBlockExample);
    }
}
