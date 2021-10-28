package com.dharn.loginservice.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Data
public class User {

    @Id
    @GeneratedValue
    private int userId;
    private String name;
    private String email;
    private String password;
    private String phoneNo;
    private String doorNo_StreetName;
    private String district;
    private String state;
    private int pincode;
    private String country;
    private Date lastLogin;
    private Timestamp time;

}
