package com.example.hrms.Service.Impl;

import com.example.hrms.Dtos.JobAdvertisementDto;
import com.example.hrms.Entities.JobAdvertisement;
import com.example.hrms.Repo.JobAdvertisementRepository;
import com.example.hrms.Repo.JobPositionRepository;
import com.example.hrms.Service.Services.JobAdvertisementService;
import com.example.hrms.core.Utilities.Results.Result;
import com.example.hrms.core.Utilities.Results.SuccessResult;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.PrimitiveIterator;

@Service
@RequiredArgsConstructor
public class JobAdvertisementServiceImpl implements JobAdvertisementService {

    private final JobAdvertisementRepository jobAdvertisementRepository;
    @Override
    public Result addJobAdvertisement(JobAdvertisement jobAdvertisement) {
       this.jobAdvertisementRepository.save(jobAdvertisement);
       return new SuccessResult("added to db");

    }
}
