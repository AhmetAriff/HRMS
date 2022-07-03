package com.example.hrms.Dtos;


import lombok.Data;


@Data
public class EmployerDto{


        private int employerId;



        private String companyName;



        private String website;



        private String telNum;


        private UserDto userDto;

}