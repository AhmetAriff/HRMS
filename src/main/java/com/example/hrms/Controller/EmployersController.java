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

    @PostMapping("/add")
    public ResponseEntity<?> addEmployers(@Valid @RequestBody EmployerDto employerDto) {
        return ResponseEntity.ok(this.employersService.addEmployer(employerDto));
    }
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorDataResult<Object> handleValidationException(MethodArgumentNotValidException exceptions){

        Map<String,String> validationErrors = new HashMap<String,String>();
        for(FieldError fieldError: exceptions.getBindingResult().getFieldErrors()){
            validationErrors.put(fieldError.getField(),fieldError.getDefaultMessage());
        }

        ErrorDataResult<Object> errors = new ErrorDataResult<>(validationErrors,"Doğrulama Hataları");
        return errors;

    }
    @GetMapping("/get")
    public DataResult<List<EmployerDto>> getAllEmployers(){

        return this.employersService.getAllEmployers();
    }





}
