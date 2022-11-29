package com.example.hrms.Dtos;



import lombok.Data;


import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
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


    private Date releaseDate;


    private String cityName;




}
