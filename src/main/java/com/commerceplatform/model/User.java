package com.commerceplatform.model;

import java.time.LocalDate;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "commerce_platform_users")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "users_seq_generator")
  @SequenceGenerator(
      name = "users_seq_generator",
      sequenceName = "users_sequence",
      allocationSize = 1)
  private Long id;

  private String username;
  private String email;
  private String password;
  private LocalDate dateOfBirth;
}
