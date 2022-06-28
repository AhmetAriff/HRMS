package com.example.hrms.Dtos;

import lombok.Data;


@Data
public class UserDto {


    public int id;


    public String mail;


    public String password;


    public boolean emailEnabled;


    public int verificationCode;

}
