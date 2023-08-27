package com.herb.service;

import com.herb.mbg.model.MapBlock;

import java.util.List;

public interface MapBlockService {

    void add(MapBlock mapBlock);

    void update(MapBlock bo);

    void delete(Long id);

    MapBlock get(Long id);

    List<MapBlock> list(String name, String type, Integer pageSize, Integer pageNum);
}
