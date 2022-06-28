package com.example.hrms.Service.Services;


import com.example.hrms.Dtos.EmployerDto;
import com.example.hrms.Entities.Employers;
import com.example.hrms.core.Utilities.Results.Result;
import org.springframework.stereotype.Service;


public interface EmployersService {

    Result addEmployer(EmployerDto employerDto);

    void deleteCandidate(Employers employers);

    void updateCandidates(Employers employers);
}
