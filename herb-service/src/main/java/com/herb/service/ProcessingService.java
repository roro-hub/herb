package com.herb.service;

import com.herb.mbg.model.Processing;

import java.util.List;

public interface ProcessingService {

    void add(Processing processing);

    void update(Processing processing);

    void delete(Long id);

    List<Processing> list(Long herbId, Integer pageSize, Integer pageNum);
}
