package com.dharn.loginservice.service;

import com.dharn.loginservice.entity.LoginModel;
import com.dharn.loginservice.entity.User;

import java.util.List;

public interface LoginService {
    List<User> checkUser(LoginModel loginModel);
}
