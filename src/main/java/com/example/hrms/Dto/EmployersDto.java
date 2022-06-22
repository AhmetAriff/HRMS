package com.example.hrms.Dto;

import lombok.Data;

import java.security.PublicKey;
@Data
public class EmployersDto extends UsersDto {

    public int employerId;

    public String companyName;

    public String website;

    public String telNum;


}
