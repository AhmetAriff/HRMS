package com.example.hrms.Controller;

import com.example.hrms.Dtos.JobPositionDto;
import com.example.hrms.Service.Services.JobPositionService;
import com.example.hrms.core.Utilities.Results.DataResult;
import com.example.hrms.core.Utilities.Results.Result;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/jobPositions")
@RequiredArgsConstructor
public class JobPositionController {

    private final JobPositionService jobPositionService;

    @PostMapping("/add")
    public ResponseEntity<?> addJobPosition(@Valid @RequestBody JobPositionDto jobPositionDto)
    {
        return ResponseEntity.ok(this.jobPositionService.addJobPosition(jobPositionDto));
    }
    @GetMapping("/getAll")
    public DataResult<List<JobPositionDto>> getAllJobPositions()
    {
        return this.jobPositionService.getAllJobPositions();
    }

}
