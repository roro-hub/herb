package com.herb.service.impl;

import com.herb.bo.LoginBO;
import com.herb.mbg.constant.Constant;
import com.herb.mbg.exception.Asserts;
import com.herb.mbg.mapper.UserMapper;
import com.herb.mbg.model.User;
import com.herb.mbg.model.UserExample;
import com.herb.service.UserService;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private PasswordEncoder passwordEncoder;
    @Resource
    private UserMapper userMapper;

    @Override
    public User login(LoginBO bo) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andLoginNameLike(bo.getLoginName());
        List<User> users = userMapper.selectByExample(userExample);
        if (CollectionUtils.isEmpty(users)) {
            Asserts.fail("登录名或密码错误");
        }
        // 默认登录名唯一，取第一个
        User user = users.get(0);
        if (Constant.USER_DISABLE == user.getStatus()) {
            Asserts.fail("用户被禁用");
        }

        if(!passwordEncoder.matches(bo.getPassword(), user.getPassword())){
            Asserts.fail("密码不正确");
        }
        return user;
    }
}
