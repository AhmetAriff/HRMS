package com.example.hrms.Service.Impl;

import com.example.hrms.Dtos.JobExperienceDto;
import com.example.hrms.Entities.JobExperience;
import com.example.hrms.Repo.CvRepository;
import com.example.hrms.Repo.JobExperienceRepository;
import com.example.hrms.Service.Services.JobExperienceService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class JobExperienceServiceImpl implements JobExperienceService {

    private final JobExperienceRepository jobExperienceRepository;
    private final CvRepository cvRepository;
    @Override
    public JobExperience addJobExperience(JobExperienceDto jobExperienceDto) {
       JobExperience jobExperience=new JobExperience();
       jobExperience.setEnd_of_experience(jobExperienceDto.getEnd_of_experience());
       jobExperience.setStart_of_experience(jobExperienceDto.getStart_of_experience());
       jobExperience.setExperienceName(jobExperienceDto.getExperienceName());
       jobExperience.setCv(cvRepository.findCvByCvId(jobExperienceDto.getCvId()));
       return this.jobExperienceRepository.save(jobExperience);

    }
}
