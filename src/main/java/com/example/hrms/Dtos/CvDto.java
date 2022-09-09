package com.example.hrms.Dtos;

import com.example.hrms.Entities.*;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
public class CvDto {


    private int CvId;


    private SocialMedia socialMedia;


    private Schools schools;


    private JobExperience  jobExperience;


    private ForeignLanguage  foreignLanguage;


    private Image image;


    private ProgrammingLanguage  programmingLanguage;


    private String CoverLetter;
}
