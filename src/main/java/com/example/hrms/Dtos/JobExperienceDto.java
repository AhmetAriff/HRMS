package com.example.hrms.Dtos;

import lombok.Data;

import javax.persistence.*;
@Data
public class JobExperienceDto {


    private int jobExperience;


    private String experienceName;


    private int start_of_experience;


    private int end_of_experience;


    private int cvId;
}
