package com.example.hrms.Dtos;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.validation.constraints.NotNull;


@Data
public class EmployerDto{


        private int employerId;


        @NotNull
        private String companyName;


        @NotNull
        private String website;


        @NotNull
        private String telNum;


        private UserDto userDto;

}