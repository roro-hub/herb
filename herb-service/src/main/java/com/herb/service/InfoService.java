package com.herb.service;

import com.herb.mbg.model.Info;

import java.util.List;

public interface InfoService {

    void add(Info info);

    void update(Info bo);

    List<Info> list(String type, Integer pageSize, Integer pageNum);
}
