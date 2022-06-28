package com.example.hrms.Dtos;


import lombok.Data;


@Data
public class CandidateDto {


    public int candidatesId;


    public String firstName;


    public String lastName;


    public String identityNumber;


    public String birthDate;


    public UserDto userDto;

}
