package com.example.hrms.Service.Services;

import com.example.hrms.Dtos.SchoolDto;
import com.example.hrms.Entities.Schools;
import com.example.hrms.core.Utilities.Results.Result;

public interface SchoolService {
    Schools addSchool(SchoolDto schoolDto);
}
