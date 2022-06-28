package com.example.hrms.Controller;

import com.example.hrms.Dtos.PersonalDto;
import com.example.hrms.Service.Services.SystemPersonalService;
import com.example.hrms.core.Utilities.Results.Result;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/personals")

public class PersonalController {
    private final SystemPersonalService systemPersonalService;

    @PostMapping("/add")
    public Result addPersonal(@RequestBody PersonalDto personalDto){

      return  this.systemPersonalService.addPersonal(personalDto);

    }
}
