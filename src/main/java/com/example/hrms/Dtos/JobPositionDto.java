package com.example.hrms.Dtos;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class JobPositionDto {

    private int jobId;


    private String jobName;
}
