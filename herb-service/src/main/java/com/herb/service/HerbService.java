package com.herb.service;

import com.herb.mbg.model.Herb;

import java.util.List;

public interface HerbService {

    void add(Herb herb);

    void update(Herb herb);

    void delete(Long id);

    Herb get(Long id);

    List<Herb> list(String name, Long herbType, Integer pageSize, Integer pageNum);
}
