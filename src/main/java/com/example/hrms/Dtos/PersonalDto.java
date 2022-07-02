package com.example.hrms.Dtos;

import com.example.hrms.Entities.User;
import lombok.Data;

import javax.persistence.*;
@Data
public class PersonalDto {


    private int personalId;



    private String personalFirstName;



    private String personalLastName;


    private UserDto userDto;
}
