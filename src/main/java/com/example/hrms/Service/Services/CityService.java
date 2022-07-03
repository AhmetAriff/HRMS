package com.example.hrms.Service.Services;

import com.example.hrms.Dtos.CityDto;
import com.example.hrms.Entities.City;
import com.example.hrms.core.Utilities.Results.Result;

public interface CityService {

    Result addCity(CityDto cityDto);

    City getCityById(int id);

}
