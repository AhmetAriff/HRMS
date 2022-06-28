package com.example.hrms.Service.Impl;

import com.example.hrms.Dtos.UserDto;
import com.example.hrms.Entities.User;
import com.example.hrms.Repo.UserRepository;
import com.example.hrms.Service.Services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public User addUser(UserDto userDto) {
        User user = new User();
        user.setMail(userDto.getMail());
        user.setPassword(userDto.getPassword());
        user.setEmailEnabled(true);
        user.setVerificationCode((int) Math.floor(Math.random()*100000));

        return  this.userRepository.save(user);

    }

    @Override
    public boolean isMailExist(String mail) {
        return this.userRepository.existsUsersByMail(mail); //true or false

    }

    @Override
    public boolean isMailEnable(UserDto userDto) {
        return userDto.isEmailEnabled();

    }

    @Override
    public UserDto convertUserDto(User user) {

        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setMail(user.getMail());
        userDto.setPassword(user.getPassword());
        userDto.setEmailEnabled(user.isEmailEnabled());
        userDto.setVerificationCode(user.getVerificationCode());

        return userDto;
    }


}
