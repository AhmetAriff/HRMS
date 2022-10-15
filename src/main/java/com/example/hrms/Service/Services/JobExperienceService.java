package com.example.hrms.Service.Services;

import com.example.hrms.Dtos.JobExperienceDto;
import com.example.hrms.Entities.JobExperience;

public interface JobExperienceService {

    JobExperience addJobExperience(JobExperienceDto jobExperienceDto);
}
