package com.dharn.loginservice.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class User {

    @Id
    @GeneratedValue
    private int userId;
    private String name;
    private String email;
    private String password;
    private double phoneNo;
    //  Date dateOfBirth;
    private String doorNo_StreetName;
    private String district;
    private String state;
    private int pincode;
    private String country;

}
