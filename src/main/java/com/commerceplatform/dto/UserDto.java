package com.commerceplatform.dto;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class UserDto {

  private String username;
  private String email;
  private String password;
  private LocalDate dateOfBirth;
}
