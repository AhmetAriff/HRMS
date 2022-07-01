package com.example.hrms.Service.Impl;

import com.example.hrms.Dtos.JobAdvertisementDto;
import com.example.hrms.Entities.JobAdvertisement;
import com.example.hrms.Repo.CityRepository;
import com.example.hrms.Repo.EmployerRepository;
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

    private final JobPositionRepository jobPositionRepository;

    private final EmployerRepository employerRepository;

    private final CityRepository cityRepository;
    @Override
    public Result addJobAdvertisement(JobAdvertisementDto jobAdvertisementDto) {

        JobAdvertisement jobAdvertisement = new JobAdvertisement();

        jobAdvertisement.setJobPositions(this.jobPositionRepository.findJobPositionsByJobName(jobAdvertisementDto.getJobPosition()));

        jobAdvertisement.setEmployers(this.employerRepository.findEmployersByCompanyName(jobAdvertisementDto.getEmployerName()));

        jobAdvertisement.setCity(this.cityRepository.findCitiesByCityName(jobAdvertisementDto.getCityName()));

        jobAdvertisement.setDeadline(jobAdvertisementDto.getDeadline());
        jobAdvertisement.setDescription(jobAdvertisementDto.getDescription());
        jobAdvertisement.setMaxSalary(jobAdvertisementDto.getMaxSalary());
        jobAdvertisement.setMinSalary(jobAdvertisementDto.getMinSalary());
        jobAdvertisement.setOpenPositions(jobAdvertisementDto.getOpenPositions());

        this.jobAdvertisementRepository.save(jobAdvertisement);
        return new SuccessResult("added to db");

    }
}
