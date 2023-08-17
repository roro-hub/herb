package com.herb.service;

import com.herb.mbg.model.HerbInfo;

import java.util.List;

public interface HerbInfoService {

    void add(HerbInfo herbInfo);

    void update(HerbInfo herbInfo);

    List<HerbInfo> list(String type, Integer pageSize, Integer pageNum);
}
