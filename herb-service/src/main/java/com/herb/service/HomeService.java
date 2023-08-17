package com.herb.service;

import java.util.List;

public interface HomeService {

    void add(Contact contact);

    List<Contact> list(String name, Integer pageSize, Integer pageNum);
}
