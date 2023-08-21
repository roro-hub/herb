package com.herb.service;

import com.herb.mbg.model.Info;

public interface InfoService {

    void add(Info info);

    void update(Info bo);

    void delete(Long id);

    Info get(String type);
}
