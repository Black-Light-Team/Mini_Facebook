package com.example.logintest.Service;

import com.example.logintest.Dto.UserDto;

import java.util.List;

public interface UserService {
    UserDto saveUser(UserDto userDto);
    UserDto getUser (String id);
    UserDto updateUser(String userId, UserDto userDto);
    void deleteUser(String id);
    boolean authenticateUser(String email, String password);
    List<UserDto> allUsers();
}
