package com.example.hrms.Controller;

import com.example.hrms.Dtos.JobPositionDto;
import com.example.hrms.Service.Services.JobPositionService;
import com.example.hrms.core.Utilities.Results.DataResult;
import com.example.hrms.core.Utilities.Results.Result;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jobPositions")
@RequiredArgsConstructor
public class JobPositionController {

    private final JobPositionService jobPositionService;

    @PostMapping("/add")
    public Result addJobPosition( @RequestBody JobPositionDto jobPositionDto)
    {
        return this.jobPositionService.addJobPosition(jobPositionDto);
    }
    @GetMapping("/get")
    public DataResult<List<JobPositionDto>> getAllJobPositions()
    {
        return this.jobPositionService.getAllJobPositions();
    }

}
