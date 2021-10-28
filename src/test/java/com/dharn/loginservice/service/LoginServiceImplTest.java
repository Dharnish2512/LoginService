package com.dharn.loginservice.service;

import com.dharn.loginservice.entity.LoginModel;
import com.dharn.loginservice.entity.User;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class LoginServiceImplTest {

    private LoginService loginService = Mockito.mock(LoginService.class);
    private User user = new User();
    private LoginModel loginModel = new LoginModel();
    @BeforeEach
    void setUp() {
        user.setName("Gokul");
        user.setEmail("gokul@gmail.com");
        user.setPassword("Gokul@123");
        user.setPhoneNo("1234567890");
        user.setDoorNo_StreetName("asdfgh");
        loginModel.setEmail("kavin@gmail.com");
        loginModel.setPassword("Kavin@123");
    }


    @Test
    void checkLogin()
    {
        Mockito.when(loginService.checkUser(loginModel)).thenReturn(user);
        Assert.assertEquals(loginService.checkUser(loginModel),user);

    }
}