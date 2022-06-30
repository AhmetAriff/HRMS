package com.example.hrms.Controller;

import com.example.hrms.Entities.JobAdvertisement;
import com.example.hrms.Service.Services.JobAdvertisementService;
import com.example.hrms.core.Utilities.Results.Result;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/jobadvertisement")
@RequiredArgsConstructor
public class JobAdvertisementController {

    private final JobAdvertisementService jobAdvertisementService;
    @PostMapping("/add")
    public Result addJobAdvertisement(JobAdvertisement jobAdvertisement)
    {
       return jobAdvertisementService.addJobAdvertisement(jobAdvertisement);
    }

}
