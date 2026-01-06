package com.coding.projects.airBnbApp.dto;

import com.coding.projects.airBnbApp.entity.User;
import com.coding.projects.airBnbApp.entity.enums.Gender;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
public class GuestDto {
    private Long id;
    private User user;
    private String name;
    private Gender gender;
    private Integer age;
    private LocalDate dateOfBirth;
}
