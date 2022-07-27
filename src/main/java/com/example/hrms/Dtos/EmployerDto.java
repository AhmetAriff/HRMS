package com.example.hrms.Dtos;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


@Data
public class EmployerDto{


        private int employerId;


        @NotNull
        @NotBlank
        private String companyName;


        @NotNull
        @NotBlank
        private String website;


        @NotNull
        @NotBlank
        private String telNum;


        private UserDto userDto;

}