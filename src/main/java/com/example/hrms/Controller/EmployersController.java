package com.example.hrms.Controller;
import com.example.hrms.Dtos.EmployerDto;
import com.example.hrms.Service.Services.EmployersService;
import com.example.hrms.core.Utilities.Results.Result;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api/employers")
@RequiredArgsConstructor


public class EmployersController {
    private final EmployersService employersService;

    @PostMapping("/add")
    public Result addEmployers(@RequestBody EmployerDto employerDto) {
        return this.employersService.addEmployer(employerDto);
    }


}
