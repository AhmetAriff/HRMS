package com.example.hrms.Service.Impl;

import com.example.hrms.Dtos.CityDto;
import com.example.hrms.Entities.City;
import com.example.hrms.Repo.CityRepository;
import com.example.hrms.Service.Services.CityService;
import com.example.hrms.core.Utilities.Results.ErrorResult;
import com.example.hrms.core.Utilities.Results.Result;
import com.example.hrms.core.Utilities.Results.SuccessResult;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CityServiceImpl implements CityService {
  private final   CityRepository cityRepository;

    @Override
    public Result addCity(CityDto cityDto) {

        if(this.cityRepository.existsByCityName(cityDto.getCityName())) {
            return new ErrorResult("City already exist");
        }

        else{

            City city = new City();
            city.setCityName(cityDto.getCityName());
            this.cityRepository.save(city);
            return new SuccessResult("City added to DB");

        }



    }
}
