package com.example.hrms.Service.Impl;


import com.example.hrms.Dtos.JobPositionDto;
import com.example.hrms.Entities.JobPositions;
import com.example.hrms.Repo.JobPositionRepository;
import com.example.hrms.Service.Services.JobPositionService;
import com.example.hrms.core.Utilities.Results.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@RequiredArgsConstructor
public class JobPositionServiceImpl implements JobPositionService {

    private final JobPositionRepository jobPositionRepository;

    @Override
    public Result addJobPosition(JobPositionDto jobPositionDto) {
        if (this.jobPositionRepository.existsJobPositionsByJobName(jobPositionDto.getJobName())) {

            return new ErrorResult("job position already exist");
        }

        else {
            JobPositions jobPositions = new JobPositions();
            jobPositions.setJobName(jobPositionDto.getJobName());
            jobPositionRepository.save(jobPositions);
            return new SuccessResult("job position added to DB");
        }

    }

    @Override
    public DataResult<List<JobPositionDto>> getAllJobPositions() {
        List<JobPositions> jobPositions = jobPositionRepository.findAll();
        List<JobPositionDto> jobPositionDtos = new ArrayList<>();

        jobPositions.forEach(it -> {

            JobPositionDto jobPositionDto = new JobPositionDto();
            jobPositionDto.setJobId(it.getJobId());
            jobPositionDto.setJobName(it.getJobName());

            jobPositionDtos.add(jobPositionDto);



        });

        return new SuccesDataResult<List<JobPositionDto>>(jobPositionDtos,"job positions listed succesfully");


    }

    @Override
    public JobPositions getJobPositionById(int id) {
       return jobPositionRepository.findJobPositionsByJobId(id);
    }
}
