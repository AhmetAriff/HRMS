package com.example.hrms.Service.Impl;

import com.example.hrms.Dtos.JobPositionDto;
import com.example.hrms.Entities.JobPositions;
import com.example.hrms.Repo.JobPositionRepository;
import com.example.hrms.Service.Services.JobPositionService;
import com.example.hrms.core.Utilities.Results.DataResult;
import com.example.hrms.core.Utilities.Results.ErrorResult;
import com.example.hrms.core.Utilities.Results.Result;
import com.example.hrms.core.Utilities.Results.SuccessResult;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

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
        return null;
    }
}
