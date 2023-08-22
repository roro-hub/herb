package com.herb.service;

import com.herb.mbg.model.Info;

import java.util.List;

public interface InfoService {

    void add(Info info);

    void update(Info bo);

    void delete(Long id);

    Info get(String type);

    List<Info> list(List<String> types);
}
