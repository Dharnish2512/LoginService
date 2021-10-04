package com.dharn.loginservice.controller;

import com.dharn.loginservice.entity.LoginModel;
import com.dharn.loginservice.entity.User;
import com.dharn.loginservice.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping("/get")
    public List<User> getLoginData(@RequestBody final LoginModel loginModel)
    {
        List<User> users = loginService.checkUser(loginModel);
        System.out.println("Hello");
        return users;
    }
}
