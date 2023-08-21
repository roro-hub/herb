package com.herb.service;

import com.herb.mbg.model.HerbType;

import java.util.List;

public interface HerbTypeService {

    void add(HerbType herbType);

    void update(HerbType herbType);

    void delete(Long id);

    List<HerbType> list(String name, Integer pageSize, Integer pageNum);
}
