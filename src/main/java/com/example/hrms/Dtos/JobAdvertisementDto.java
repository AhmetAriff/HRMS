package com.example.hrms.Dtos;

import com.example.hrms.Entities.City;
import com.example.hrms.Entities.JobPositions;

import javax.persistence.*;

public class JobAdvertisementDto {


    public int id;


    public JobPositions jobPositions;


    public String description;


    public String minSalary;


    public String maxSalary;


    public int openPositions;


    public String deadline;


    public City city;
}
