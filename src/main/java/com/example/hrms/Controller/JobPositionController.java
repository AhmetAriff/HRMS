package com.example.hrms.Controller;

import com.example.hrms.Dtos.JobPositionDto;
import com.example.hrms.Service.Services.JobPositionService;
import com.example.hrms.core.Utilities.Results.Result;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/jobPositions")
@RequiredArgsConstructor
public class JobPositionController {

    private final JobPositionService jobPositionService;

    @PostMapping("/add")
    public Result addJobPosition(JobPositionDto jobPositionDto)
    {
        return this.jobPositionService.addJobPosition(jobPositionDto);
    }

}
