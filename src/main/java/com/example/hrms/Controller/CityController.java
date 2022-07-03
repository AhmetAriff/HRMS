package com.example.hrms.Controller;

import com.example.hrms.Dtos.CityDto;
import com.example.hrms.Service.Services.CityService;
import com.example.hrms.core.Utilities.Results.Result;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cities")
@RequiredArgsConstructor
public class CityController {
    private final CityService cityService;

    @PostMapping("/add")
    public Result addCity(@RequestBody CityDto cityDto)
    {
        return cityService.addCity(cityDto);
    }
}
