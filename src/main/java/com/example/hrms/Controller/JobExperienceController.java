package com.example.hrms.Controller;

import com.example.hrms.Dtos.ForeignLanguageDto;
import com.example.hrms.Dtos.JobExperienceDto;
import com.example.hrms.Service.Services.ForeignLanguageService;
import com.example.hrms.Service.Services.JobExperienceService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/job-experiences")
@RequiredArgsConstructor
public class JobExperienceController {

    private final JobExperienceService jobExperienceService;

    @PostMapping
    public ResponseEntity<?> addJobExperience(@RequestBody JobExperienceDto jobExperienceDto) {
        return ResponseEntity.ok(this.jobExperienceService.addJobExperience(jobExperienceDto));
    }
}
