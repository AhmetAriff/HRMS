package com.example.hrms.Service.Services;

import com.example.hrms.Dtos.JobAdvertisementDto;
import com.example.hrms.core.Utilities.Results.DataResult;
import com.example.hrms.core.Utilities.Results.Result;

import java.util.List;

public interface JobAdvertisementService {

    Result addJobAdvertisement(JobAdvertisementDto jobAdvertisementDto);

    DataResult<List<JobAdvertisementDto>> getAllJobAdvertisement ();

    DataResult<List<JobAdvertisementDto>>getAllJobAdvertisementByEmployerName(String employerName);
}
