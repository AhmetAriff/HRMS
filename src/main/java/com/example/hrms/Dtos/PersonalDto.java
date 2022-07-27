package com.example.hrms.Dtos;


import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


@Data
public class PersonalDto {


    private int personalId;


    @NotBlank
    @NotNull
    private String personalFirstName;


    @NotBlank
    @NotNull
    private String personalLastName;


    private UserDto userDto;
}
