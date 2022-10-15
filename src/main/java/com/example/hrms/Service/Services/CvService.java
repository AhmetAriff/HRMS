package com.example.hrms.Service.Services;

import com.example.hrms.Dtos.CvDto;
import com.example.hrms.core.Utilities.Results.Result;

public interface CvService {

    Result addCv(CvDto cvDto);
}
