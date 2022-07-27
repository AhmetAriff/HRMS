package com.example.hrms.Dtos;



import lombok.Data;


import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
public class JobAdvertisementDto {


    private int id;

    @NotBlank
    @NotNull
    private String employerName;

    @NotBlank
    @NotNull
    private String jobPosition;


    private String description;

    @NotBlank
    @NotNull
    private String minSalary;

    @NotBlank
    @NotNull
    private String maxSalary;

    @NotBlank
    @NotNull
    private int openPositions;

    @NotBlank
    @NotNull
    private Date deadline;


    private Date releaseDate;

    @NotBlank
    @NotNull
    private String cityName;
}
