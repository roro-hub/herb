package com.herb.service;


import com.herb.bo.LoginBO;
import com.herb.mbg.model.User;

public interface UserService {

    User login(LoginBO bo);

}
