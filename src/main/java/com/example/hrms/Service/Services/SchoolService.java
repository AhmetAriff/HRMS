package com.example.hrms.Service.Services;

import com.example.hrms.Dtos.CvDto;
import com.example.hrms.Dtos.SchoolDto;
import com.example.hrms.Entities.Cv;
import com.example.hrms.Entities.Schools;
import com.example.hrms.core.Utilities.Results.Result;

public interface SchoolService {
    Schools addSchoolToDb(SchoolDto schoolDto);


}
