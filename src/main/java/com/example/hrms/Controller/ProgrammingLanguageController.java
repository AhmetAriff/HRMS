package com.example.hrms.Controller;

import com.example.hrms.Dtos.ForeignLanguageDto;
import com.example.hrms.Dtos.ProgrammingLanguageDto;
import com.example.hrms.Service.Services.ForeignLanguageService;
import com.example.hrms.Service.Services.ProgrammingLanguageService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/programming-languages")
@RequiredArgsConstructor
public class ProgrammingLanguageController {

    private final ProgrammingLanguageService programmingLanguageService;

    @PostMapping
    public ResponseEntity<?> addProgrammingLanguage(@RequestBody ProgrammingLanguageDto programmingLanguageDto) {
        return ResponseEntity.ok(this.programmingLanguageService.addProgrammingLanguage(programmingLanguageDto));
    }
}
