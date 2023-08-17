package com.herb.service.impl;

import com.github.pagehelper.PageHelper;
import com.herb.service.ContactService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ContactServiceImpl implements ContactService {

    @Resource
    private ContactMapper contactMapper;

    @Override
    public void add(Contact contact) {
        contactMapper.insert(contact);
    }

    @Override
    public List<Contact> list(String name, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        ContactExample contactExample = new ContactExample();
        contactExample.createCriteria().andNameLike(name);
        return contactMapper.selectByExample(contactExample);
    }
}
