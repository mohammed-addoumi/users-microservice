package com.commerceplatform.services;

import com.commerceplatform.dto.UserDto;
import java.util.List;

public interface UserService {

  List<UserDto> getAllUsers();
}
