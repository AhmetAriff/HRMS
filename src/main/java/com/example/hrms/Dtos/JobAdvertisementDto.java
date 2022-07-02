package com.example.hrms.Dtos;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class JobAdvertisementDto {


    private int id;


    private String employerName;


    private String jobPosition;


    private String description;


    private String minSalary;


    private String maxSalary;


    private int openPositions;


    private Date deadline;


    private String cityName;
}
