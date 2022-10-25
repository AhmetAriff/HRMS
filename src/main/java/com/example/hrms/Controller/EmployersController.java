package com.example.hrms.Controller;
import com.example.hrms.Dtos.EmployerDto;
import com.example.hrms.Service.Services.EmployersService;
import com.example.hrms.core.Utilities.Results.DataResult;
import com.example.hrms.core.Utilities.Results.ErrorDataResult;
import com.example.hrms.core.Utilities.Results.Result;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/employers")
@RequiredArgsConstructor


public class EmployersController {
    private final EmployersService employersService;

    @PostMapping
    public ResponseEntity<?> addEmployers(@Valid @RequestBody EmployerDto employerDto) {
        return ResponseEntity.ok(this.employersService.addEmployer(employerDto));
    }

    @GetMapping
    public DataResult<List<EmployerDto>> getAllEmployers(){

        return this.employersService.getAllEmployers();
    }





}
