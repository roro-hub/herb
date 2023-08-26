package com.herb.service;

import com.herb.mbg.model.Processing;

import java.util.List;

public interface ProcessingService {

    void add(Processing processing);

    void update(Processing processing);

    void delete(Long id);

    Processing get(Long id);

    List<Processing> list(String name, String type, Long herbId, String herbName, Integer pageSize, Integer pageNum);
}
