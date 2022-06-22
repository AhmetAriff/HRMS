package com.example.hrms.Service.Services;

import com.example.hrms.Dto.CandidatesDto;
import com.example.hrms.Dto.EmployersDto;

public interface EmployersService {

    void addEmployer(EmployersDto employersDto);

    void deleteCandidate(EmployersDto employersDto);

    void updateCandidates(EmployersDto employersDto);
}
