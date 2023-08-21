package com.herb.service;

import com.herb.mbg.model.Manager;

import java.util.List;

public interface ManagerService {

    void add(Manager Manager);

    void update(Manager bo);

    void delete(Long id);

    List<Manager> list(String name, Integer pageSize, Integer pageNum);
}
