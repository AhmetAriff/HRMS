package com.example.hrms.Dto;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Data
public class UsersDto {


    public int userId;

    public String mail;

    public String password;

}
