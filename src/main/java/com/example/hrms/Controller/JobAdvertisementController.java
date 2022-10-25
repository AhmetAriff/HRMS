package com.example.hrms.Controller;

import com.example.hrms.Dtos.JobAdvertisementDto;
import com.example.hrms.Service.Services.JobAdvertisementService;
import com.example.hrms.core.Utilities.Results.DataResult;
import com.example.hrms.core.Utilities.Results.Result;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/job-advertisements")
@RequiredArgsConstructor
public class JobAdvertisementController {

    private final JobAdvertisementService jobAdvertisementService;
    @PostMapping
    public ResponseEntity<?> addJobAdvertisement(@Valid @RequestBody JobAdvertisementDto jobAdvertisementDto)
    {
       return ResponseEntity.ok(this.jobAdvertisementService.addJobAdvertisement(jobAdvertisementDto));
    }

    @GetMapping
    public DataResult<List<JobAdvertisementDto>> getAllJobAdvertisement()
    {
        return this.jobAdvertisementService.getAllJobAdvertisement();
    }
    @GetMapping("/get-job-advertisements")
    DataResult<List<JobAdvertisementDto>> getAllJobAdvertisementByEmployerName(@RequestParam String employerName)
    {
        return this.jobAdvertisementService.getAllJobAdvertisementByEmployerName(employerName);
    }
    @GetMapping("/get-job-advertisements-order-by-deadline")
    public DataResult<List<JobAdvertisementDto>> getAllJobAdvertisementOrderByDeadlineAsc()
    {
        return this.jobAdvertisementService.getAllJobAdvertisementOrderByDeadlineAsc();
    }
    @PatchMapping("/change-to-unactive/{id}")
    public Result changeToUnActive(@PathVariable int id)
    {
        return this.jobAdvertisementService.changeToUnActive(id);
    }

    @PatchMapping("/change-to-active/{id}")
    public Result changeToActive(@PathVariable int id)
    {
        return this.jobAdvertisementService.changeToActive(id);
    }

}
