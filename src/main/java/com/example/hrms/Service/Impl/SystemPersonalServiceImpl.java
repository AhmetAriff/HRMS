package com.example.hrms.Service.Impl;


import com.example.hrms.Dtos.PersonalDto;
import com.example.hrms.Entities.SystemPersonal;
import com.example.hrms.Entities.User;
import com.example.hrms.Repo.PersonalRepository;
import com.example.hrms.Service.Services.SystemPersonalService;
import com.example.hrms.Service.Services.UserService;
import com.example.hrms.core.Utilities.Results.ErrorResult;
import com.example.hrms.core.Utilities.Results.Result;
import com.example.hrms.core.Utilities.Results.SuccessResult;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SystemPersonalServiceImpl  implements SystemPersonalService {

    private final PersonalRepository personalRepository;
    private  final UserService userService;

    @Override
    public Result addPersonal(PersonalDto personalDto) {

        if(this.userService.isMailExist(personalDto.getUserDto().getMail())) {
            return new ErrorResult("Mail already exist");}

        else if (!this.userService.isMailEnable(personalDto.getUserDto())) {
            return new ErrorResult("Mail is not enabled");}
        else {

            SystemPersonal systemPersonal = new SystemPersonal();
            systemPersonal.setPersonalFirstName(personalDto.getPersonalFirstName());
            systemPersonal.setPersonalLastName(personalDto.getPersonalLastName());

            User user = userService.addUser(personalDto.getUserDto());
            systemPersonal.setUser(user);

            personalRepository.save(systemPersonal);

            return new SuccessResult("personal added to DB");

        }



    }

    @Override
    public void deletePersonal(SystemPersonal systemPersonal) {

    }

    @Override
    public void updatePersonal(SystemPersonal systemPersonal) {

    }
}
