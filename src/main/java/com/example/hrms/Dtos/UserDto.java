package com.example.hrms.Dtos;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


@Data
public class UserDto {


    private int id;

    @NotBlank
    @NotNull
    @Email
    private String mail;

    @NotBlank
    @NotNull
    private String password;


    private boolean emailEnabled;


    private int verificationCode;

}
