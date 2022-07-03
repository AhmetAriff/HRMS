package com.example.hrms.Controller;

import com.example.hrms.Dtos.JobAdvertisementDto;
import com.example.hrms.Service.Services.JobAdvertisementService;
import com.example.hrms.core.Utilities.Results.DataResult;
import com.example.hrms.core.Utilities.Results.Result;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jobadvertisement")
@RequiredArgsConstructor
public class JobAdvertisementController {

    private final JobAdvertisementService jobAdvertisementService;
    @PostMapping("/add")
    public Result addJobAdvertisement(@RequestBody JobAdvertisementDto jobAdvertisementDto)
    {
       return jobAdvertisementService.addJobAdvertisement(jobAdvertisementDto);
    }

    @GetMapping("/get")
    public DataResult<List<JobAdvertisementDto>> getAllJobAdvertisement()
    {
        return this.jobAdvertisementService.getAllJobAdvertisement();
    }
    @GetMapping("/get_by_employer_name")
    DataResult<List<JobAdvertisementDto>> getAllJobAdvertisementByEmployerName(@RequestParam String employerName)
    {
        return this.jobAdvertisementService.getAllJobAdvertisementByEmployerName(employerName);
    }

}
