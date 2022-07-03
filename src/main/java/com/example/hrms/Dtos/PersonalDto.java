package com.example.hrms.Dtos;


import lombok.Data;


@Data
public class PersonalDto {


    private int personalId;



    private String personalFirstName;



    private String personalLastName;


    private UserDto userDto;
}
