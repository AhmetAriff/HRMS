package com.example.hrms.Controller;

import com.example.hrms.Dtos.CandidateDto;
import com.example.hrms.Dtos.ForeignLanguageDto;
import com.example.hrms.Service.Services.ForeignLanguageService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/foreign-languages")
@RequiredArgsConstructor

public class ForeignLanguageController {

    private final ForeignLanguageService foreignLanguageService;

    @PostMapping
    public ResponseEntity<?> addForeignLanguage(@RequestBody ForeignLanguageDto foreignLanguageDto) {
        return ResponseEntity.ok(this.foreignLanguageService.addForeignLanguage(foreignLanguageDto));
    }



}
