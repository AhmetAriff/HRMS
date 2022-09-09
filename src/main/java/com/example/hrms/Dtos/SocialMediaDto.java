package com.example.hrms.Dtos;

import lombok.Data;

import javax.persistence.*;
@Data
public class SocialMediaDto {


    private int socialMediaId;


    private String githubUrl;


    private String linkednUrl;
}
