package com.example.hrms.Dtos;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


@Data
public class CityDto {

    private int cityId;

    @NotBlank
    @NotNull
    private String cityName;
}
