package com.example.hrms.Dtos;

import com.example.hrms.Entities.User;
import lombok.Data;

import javax.persistence.*;
@Data
public class EmployerDto{


        private int employerId;



        private String companyName;



        private String website;



        private String telNum;


        private UserDto userDto;

}