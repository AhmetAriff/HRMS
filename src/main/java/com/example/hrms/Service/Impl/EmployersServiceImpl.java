package com.example.hrms.Service.Impl;


import com.example.hrms.Dtos.EmployerDto;
import com.example.hrms.Entities.Employers;
import com.example.hrms.Entities.User;
import com.example.hrms.Repo.EmployerRepository;
import com.example.hrms.Service.Services.EmployersService;
import com.example.hrms.Service.Services.UserService;
import com.example.hrms.core.Utilities.Results.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployersServiceImpl implements EmployersService {

    private final EmployerRepository employerRepository;
    private final UserService userService;


    @Override
    public Result addEmployer(EmployerDto employerDto) {

        if (this.userService.isMailExist(employerDto.getUserDto().getMail())) {
            return new ErrorResult("Mail already exist");
        } else if (!this.userService.isMailEnable(employerDto.getUserDto())) {
            return new ErrorResult("Mail is not enabled");
        } else {
            Employers employers = new Employers();
            employers.setWebsite(employerDto.getWebsite());
            employers.setTelNum(employerDto.getTelNum());
            employers.setCompanyName(employerDto.getCompanyName());

            User user = userService.addUser(employerDto.getUserDto());
            employers.setUser(user);

            this.employerRepository.save(employers);

            return new SuccessResult("Employer added to Db");

        }


    }

    @Override
    public void deleteCandidate(Employers employers) {

    }

    @Override
    public void updateCandidates(Employers employers) {

    }

    @Override
    public DataResult<List<EmployerDto>> getAllEmployers() {

        List<Employers> employers = employerRepository.findAll();

        List<EmployerDto> employerDtos = new ArrayList<>();

        employers.forEach(it -> {

            EmployerDto employerDto = new EmployerDto();

            employerDto.setEmployerId(it.getEmployerId());
            employerDto.setCompanyName(it.getCompanyName());
            employerDto.setTelNum(it.getTelNum());
            employerDto.setWebsite(it.getWebsite());
            employerDto.setUserDto(userService.convertUserDto(it.getUser()));

            employerDtos.add(employerDto);
        });

            return new SuccesDataResult<List<EmployerDto>>(employerDtos, "employers listed succesfuly");


    }
}
