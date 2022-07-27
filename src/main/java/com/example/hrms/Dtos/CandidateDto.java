package com.example.hrms.Dtos;


import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


@Data
public class CandidateDto {


    private int candidatesId;

    @NotBlank
    @NotNull
    private String firstName;

    @NotBlank
    @NotNull
    private String lastName;

    @NotBlank
    @NotNull
    private String identityNumber;

    @NotBlank
    @NotNull
    private String birthDate;


    private UserDto userDto;

}
