package com.example.hrms.Dtos;

import com.example.hrms.Entities.*;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
public class CvDto {


    private int CvId;


    private SocialMediaDto socialMediaDto;


    private ImageDto imageDto;


    private String CoverLetter;
}
