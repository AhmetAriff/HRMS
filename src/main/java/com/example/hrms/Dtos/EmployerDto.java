package com.example.hrms.Dtos;

import com.example.hrms.Entities.User;
import lombok.Data;

import javax.persistence.*;
@Data
public class EmployerDto{


        public int employerId;



        public String companyName;



        public String website;



        public String telNum;


        public UserDto userDto;

}