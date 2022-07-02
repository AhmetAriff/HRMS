package com.example.hrms.Dtos;

import lombok.Data;


@Data
public class UserDto {


    private int id;


    private String mail;


    private String password;


    private boolean emailEnabled;


    private int verificationCode;

}
