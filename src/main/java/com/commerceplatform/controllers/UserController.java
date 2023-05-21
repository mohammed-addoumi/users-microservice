package com.commerceplatform.controllers;

import com.commerceplatform.dto.UserDto;
import com.commerceplatform.services.UserService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/users")
@Slf4j
@RequiredArgsConstructor
public class UserController {

  private final UserService userService;

  @GetMapping
  public List<UserDto> getAllUsers() {
    log.info("{} :  fetching all users ", getClass().getSimpleName());
    return userService.getAllUsers();
  }
}
