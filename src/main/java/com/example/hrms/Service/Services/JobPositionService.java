package com.example.hrms.Service.Services;


import com.example.hrms.Dtos.JobPositionDto;
import com.example.hrms.core.Utilities.Results.DataResult;
import com.example.hrms.core.Utilities.Results.Result;

import java.util.List;

public interface JobPositionService {
    Result addJobPosition(JobPositionDto jobPositionDto);

    DataResult<List<JobPositionDto>> getAllJobPositions();


}
