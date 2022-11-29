package com.example.hrms.Controller;

import com.example.hrms.Dtos.ForeignLanguageDto;
import com.example.hrms.Dtos.SchoolDto;
import com.example.hrms.Service.Services.ForeignLanguageService;
import com.example.hrms.Service.Services.SchoolService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/schools")
@RequiredArgsConstructor
public class SchoolController {

    private final SchoolService schoolService;

    @PostMapping
    public ResponseEntity<?> addSchools(@RequestBody SchoolDto schoolDto) {
        return ResponseEntity.ok(this.schoolService.addSchool(schoolDto));
    }
}
