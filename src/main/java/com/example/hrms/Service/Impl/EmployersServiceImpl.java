package com.example.hrms.Service.Impl;

import com.example.hrms.Dto.EmployersDto;
import com.example.hrms.Entities.Employers;
import com.example.hrms.Service.Services.EmployersService;

public class EmployersServiceImpl implements EmployersService {
    @Override
    public void addEmployer(EmployersDto employersDto) {
        Employers employers = new Employers();
        employers.setCompanyName(employersDto.getCompanyName());
        employers.setTelNum(employersDto.getTelNum());
        employers.setWebsite(employersDto.getWebsite());



    }

    @Override
    public void deleteCandidate(EmployersDto employersDto) {

    }

    @Override
    public void updateCandidates(EmployersDto employersDto) {

    }
}
