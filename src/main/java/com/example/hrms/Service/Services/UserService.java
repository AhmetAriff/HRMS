package com.example.hrms.Service.Services;


import com.example.hrms.Dtos.UserDto;
import com.example.hrms.Entities.User;



public interface UserService {

    User addUser(UserDto userDto);

    boolean isMailExist(String mail );

    boolean isMailEnable(UserDto userDto);

    UserDto convertUserDto(User user);


}
