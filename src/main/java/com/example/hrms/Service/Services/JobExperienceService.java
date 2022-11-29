package com.example.hrms.Service.Services;

import com.example.hrms.Dtos.JobExperienceDto;
import com.example.hrms.Entities.JobExperience;
import com.example.hrms.core.Utilities.Results.Result;

public interface JobExperienceService {

    Result addJobExperience(JobExperienceDto jobExperienceDto);
}
