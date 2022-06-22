package com.example.hrms.Dto;

import com.example.hrms.Entities.Users;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
@Data
public class CandidatesDto extends UsersDto  {

    public int candidatesId;


    public String firstName;


    public String lastName;


    public String identityNumber;


    public String birthDate;


    public Users user;
}
