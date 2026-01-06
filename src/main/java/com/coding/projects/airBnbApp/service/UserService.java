package com.coding.projects.airBnbApp.service;

import com.coding.projects.airBnbApp.dto.ProfileUpdateRequestDto;
import com.coding.projects.airBnbApp.dto.UserDto;
import com.coding.projects.airBnbApp.entity.User;

public interface UserService {

    User getUserById(Long id);
    void updateProfile(ProfileUpdateRequestDto profileUpdateRequestDto);

    UserDto getMyProfile();

}
