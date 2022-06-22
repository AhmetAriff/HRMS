package com.example.hrms.Service.Services;

import com.example.hrms.Dto.EmployersDto;
import com.example.hrms.Dto.SystemPersonalDto;

public interface SystemPersonalService {

    void addPersonal(SystemPersonalDto systemPersonalDto);

    void deletePersonal(SystemPersonalDto systemPersonalDto);

    void updatePersonal(SystemPersonalDto systemPersonalDto);
}
