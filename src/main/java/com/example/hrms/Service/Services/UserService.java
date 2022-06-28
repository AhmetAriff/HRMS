package com.example.hrms.Service.Services;


import com.example.hrms.Dtos.UserDto;
import com.example.hrms.Entities.User;
import com.example.hrms.core.Utilities.Results.Result;


public interface UserService {

    User addUser(UserDto userDto);

    boolean isMailExist(String mail );

    boolean isMailEnable(UserDto userDto);

    UserDto convertUserDto(User user);


}
