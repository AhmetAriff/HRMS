package com.example.hrms.Service.Services;



import com.example.hrms.Dtos.PersonalDto;
import com.example.hrms.Entities.SystemPersonal;
import com.example.hrms.core.Utilities.Results.Result;


public interface SystemPersonalService {

    Result addPersonal(PersonalDto personalDto);

    void deletePersonal(SystemPersonal systemPersonal);

    void updatePersonal(SystemPersonal systemPersonal);
}
