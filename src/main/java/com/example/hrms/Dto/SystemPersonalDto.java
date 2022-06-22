package com.example.hrms.Dto;

import lombok.Data;

@Data
public class SystemPersonalDto extends UsersDto {

    public int personalId;

    public String personalFirstName;

    public String personalLastName;

}
