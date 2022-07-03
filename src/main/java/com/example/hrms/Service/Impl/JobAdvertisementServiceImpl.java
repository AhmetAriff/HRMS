package com.example.hrms.Service.Impl;


import com.example.hrms.Dtos.JobAdvertisementDto;
import com.example.hrms.Entities.JobAdvertisement;
import com.example.hrms.Repo.CityRepository;
import com.example.hrms.Repo.EmployerRepository;
import com.example.hrms.Repo.JobAdvertisementRepository;
import com.example.hrms.Repo.JobPositionRepository;
import com.example.hrms.Service.Services.CityService;
import com.example.hrms.Service.Services.EmployersService;
import com.example.hrms.Service.Services.JobAdvertisementService;
import com.example.hrms.Service.Services.JobPositionService;
import com.example.hrms.core.Utilities.Results.*;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Service
@RequiredArgsConstructor
@Configuration
public class JobAdvertisementServiceImpl implements JobAdvertisementService {

    private final JobAdvertisementRepository jobAdvertisementRepository;

    private final JobPositionRepository jobPositionRepository;

    private final EmployerRepository employerRepository;

    private final CityRepository cityRepository;

    private final EmployersService employersService;

    private final CityService cityService;

    private final JobPositionService jobPositionService;
    @Override
    public Result addJobAdvertisement(JobAdvertisementDto jobAdvertisementDto) {

        JobAdvertisement jobAdvertisement = new JobAdvertisement();

        jobAdvertisement.setJobPositions(this.jobPositionRepository.findJobPositionsByJobName(jobAdvertisementDto.getJobPosition()));

        jobAdvertisement.setEmployers(this.employerRepository.findEmployersByCompanyName(jobAdvertisementDto.getEmployerName()));

        jobAdvertisement.setCity(this.cityRepository.findCitiesByCityName(jobAdvertisementDto.getCityName()));

        jobAdvertisement.setReleaseDate(new Date());
        jobAdvertisement.setDeadline(jobAdvertisementDto.getDeadline());
        jobAdvertisement.setDescription(jobAdvertisementDto.getDescription());
        jobAdvertisement.setMaxSalary(jobAdvertisementDto.getMaxSalary());
        jobAdvertisement.setMinSalary(jobAdvertisementDto.getMinSalary());
        jobAdvertisement.setOpenPositions(jobAdvertisementDto.getOpenPositions());

        this.jobAdvertisementRepository.save(jobAdvertisement);
        return new SuccessResult(" Job Advertisement added to db");

    }

    @Override
    public DataResult<List<JobAdvertisementDto>> getAllJobAdvertisement() {

        List<JobAdvertisement> jobAdvertisements=jobAdvertisementRepository.findAll();

        List<JobAdvertisementDto> jobAdvertisementDtos=new ArrayList<>();

        jobAdvertisements.forEach(it -> {

            JobAdvertisementDto jobAdvertisementDto = new JobAdvertisementDto();
            jobAdvertisementDto.setDeadline(it.getDeadline());
            jobAdvertisementDto.setReleaseDate(it.getReleaseDate());
            jobAdvertisementDto.setDescription(it.getDescription());
            jobAdvertisementDto.setMaxSalary(it.getMaxSalary());
            jobAdvertisementDto.setMinSalary(it.getMinSalary());
            jobAdvertisementDto.setEmployerName(employersService.getEmployerById(it.getEmployers().getEmployerId()).getCompanyName());
            jobAdvertisementDto.setCityName(cityService.getCityById(it.getCity().getCityId()).getCityName());
            jobAdvertisementDto.setJobPosition((jobPositionService.getJobPositionById(it.getJobPositions().getJobId())).getJobName());

            jobAdvertisementDtos.add(jobAdvertisementDto);


        });

        return new SuccesDataResult<List<JobAdvertisementDto>>(jobAdvertisementDtos,"JobAdvertisements listed succesfully");


    }

    @Override
    public DataResult<List<JobAdvertisementDto>> getAllJobAdvertisementByEmployerName(String employerName) {

       if(this.employerRepository.existsEmployersByCompanyName(employerName))
       {

           List<JobAdvertisement> jobAdvertisements =jobAdvertisementRepository.findJobAdvertisementByEmployersCompanyName(employerName);
           List<JobAdvertisementDto> jobAdvertisementDtos=new ArrayList<>();

        jobAdvertisements.forEach(it -> {

            JobAdvertisementDto jobAdvertisementDto = new JobAdvertisementDto();
            jobAdvertisementDto.setDeadline(it.getDeadline());
            jobAdvertisementDto.setReleaseDate(it.getReleaseDate());
            jobAdvertisementDto.setDescription(it.getDescription());
            jobAdvertisementDto.setMaxSalary(it.getMaxSalary());
            jobAdvertisementDto.setMinSalary(it.getMinSalary());
            jobAdvertisementDto.setEmployerName(employersService.getEmployerById(it.getEmployers().getEmployerId()).getCompanyName());
            jobAdvertisementDto.setCityName(cityService.getCityById(it.getCity().getCityId()).getCityName());
            jobAdvertisementDto.setJobPosition((jobPositionService.getJobPositionById(it.getJobPositions().getJobId())).getJobName());

            jobAdvertisementDtos.add(jobAdvertisementDto);


        });

        return new SuccesDataResult<List<JobAdvertisementDto>>(jobAdvertisementDtos,"JobAdvertisements listed succesfully");

       }
       else
       {
          return new ErrorDataResult<List<JobAdvertisementDto>>(null,"this company name does not exist");
       }


    }
}
