package com.commerceplatform.controllers;

import com.commerceplatform.dto.UserDto;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/users")
@Slf4j
public class UserController {

  @GetMapping
  public List<UserDto> getAllUsers() {
    log.info("fetching all users ");
    List<UserDto> users = new ArrayList<>();
    users.add(new UserDto("user1", "user1@example.com", "password1", LocalDate.of(2000, 1, 1)));
    users.add(new UserDto("user2", "user2@example.com", "password2", LocalDate.of(2000, 2, 2)));
    users.add(new UserDto("user3", "user3@example.com", "password3", LocalDate.of(2000, 3, 3)));
    users.add(new UserDto("user4", "user4@example.com", "password4", LocalDate.of(2000, 4, 4)));
    users.add(new UserDto("user5", "user5@example.com", "password5", LocalDate.of(2000, 5, 5)));
    return users;
  }
}
