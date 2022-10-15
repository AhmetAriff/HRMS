package com.example.hrms.Dtos;

import com.example.hrms.Entities.Cv;
import lombok.Data;

import javax.persistence.*;
@Data
public class SchoolDto {


    private int schoolsId;


    private String schoolName;


    private int startOfSchool;


    private int endOfSchool;


    private int CvId;
}
