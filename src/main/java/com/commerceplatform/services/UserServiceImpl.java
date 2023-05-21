package com.commerceplatform.services;

import com.commerceplatform.model.User;
import com.commerceplatform.repositories.UserRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

  private final UserRepository userRepository;

  @Override
  public List<User> getAllUsers() {
    log.info("{} :  fetching all users ", getClass().getSimpleName());
    List<User> users = userRepository.findAll();
    return users;
  }
}
