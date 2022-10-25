package com.example.hrms.Dtos;

import com.example.hrms.Entities.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
public class CvDto {


    private int CvId;


    private SocialMediaDto socialMediaDto;


    private ImageDto imageDto;


    private SchoolDto schoolDto;


    private ProgrammingLanguageDto programmingLanguageDto;


    private JobExperienceDto jobExperienceDto;


    private ForeignLanguageDto foreignLanguageDto;


    private String CoverLetter;
}
