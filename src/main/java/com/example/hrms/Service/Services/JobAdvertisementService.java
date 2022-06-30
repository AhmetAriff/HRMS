package com.example.hrms.Service.Services;

import com.example.hrms.Dtos.JobAdvertisementDto;
import com.example.hrms.core.Utilities.Results.Result;

public interface JobAdvertisementService {

    Result addJobAdvertisement(JobAdvertisementDto jobAdvertisementDto);
}
