package com.example.hrms.Dtos;

import com.example.hrms.Entities.City;
import com.example.hrms.Entities.Employers;
import com.example.hrms.Entities.JobPositions;
import lombok.Data;

import javax.persistence.*;
@Data
public class JobAdvertisementDto {


    public int id;


    public Employers employers;


    public JobPositions jobPositions;


    public String description;


    public String minSalary;


    public String maxSalary;


    public int openPositions;


    public String deadline;


    public City city;
}
