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
@RequestMapping("/api/jobadvertisement")
@RequiredArgsConstructor
public class JobAdvertisementController {

    private final JobAdvertisementService jobAdvertisementService;
    @PostMapping("/add")
    public ResponseEntity<?> addJobAdvertisement(@Valid @RequestBody JobAdvertisementDto jobAdvertisementDto)
    {
       return ResponseEntity.ok(this.jobAdvertisementService.addJobAdvertisement(jobAdvertisementDto));
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
    @GetMapping("/get_by_deadline")
    public DataResult<List<JobAdvertisementDto>> getAllJobAdvertisementOrderByDeadlineAsc()
    {
        return this.jobAdvertisementService.getAllJobAdvertisementOrderByDeadlineAsc();
    }
    @PutMapping("/change_to_unactive")
    public Result changeToUnActive(@RequestParam int id)
    {
        return this.jobAdvertisementService.changeToUnActive(id);
    }

    @PutMapping("/change_to_active")
    public Result changeToActive(@RequestParam int id)
    {
        return this.jobAdvertisementService.changeToActive(id);
    }

}
