package com.example.hrms.Dtos;

import com.example.hrms.Entities.User;
import lombok.Data;

import javax.persistence.*;
@Data
public class PersonalDto {


    public int personalId;



    public String personalFirstName;



    public String personalLastName;


    public UserDto userDto;
}
