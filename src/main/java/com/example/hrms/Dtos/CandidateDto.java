package com.example.hrms.Dtos;


import lombok.Data;


@Data
public class CandidateDto {


    private int candidatesId;


    private String firstName;


    private String lastName;


    private String identityNumber;


    private String birthDate;


    private UserDto userDto;

}
