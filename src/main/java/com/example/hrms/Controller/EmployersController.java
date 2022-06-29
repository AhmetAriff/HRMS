package com.example.hrms.Controller;
import com.example.hrms.Dtos.EmployerDto;
import com.example.hrms.Service.Services.EmployersService;
import com.example.hrms.core.Utilities.Results.DataResult;
import com.example.hrms.core.Utilities.Results.Result;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employers")
@RequiredArgsConstructor


public class EmployersController {
    private final EmployersService employersService;

    @PostMapping("/add")
    public Result addEmployers(@RequestBody EmployerDto employerDto) {
        return this.employersService.addEmployer(employerDto);
    }
    @GetMapping("/get")
    public DataResult<List<EmployerDto>> getAllEmployers(){

        return this.employersService.getAllEmployers();
    }


}
