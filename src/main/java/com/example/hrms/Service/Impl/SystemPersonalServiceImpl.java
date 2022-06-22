package com.example.hrms.Service.Impl;

import com.example.hrms.Dto.SystemPersonalDto;
import com.example.hrms.Entities.SystemPersonal;
import com.example.hrms.Service.Services.SystemPersonalService;

public class SystemPersonalServiceImpl  implements SystemPersonalService {
    @Override
    public void addPersonal(SystemPersonalDto systemPersonalDto) {

        SystemPersonal systemPersonal= new SystemPersonal();
        systemPersonal.setPersonalFirstName(systemPersonalDto.getPersonalFirstName());
        systemPersonal.setPersonalLastName(systemPersonal.getPersonalLastName());

    }

    @Override
    public void deletePersonal(SystemPersonalDto systemPersonalDto) {

    }

    @Override
    public void updatePersonal(SystemPersonalDto systemPersonalDto) {

    }
}
