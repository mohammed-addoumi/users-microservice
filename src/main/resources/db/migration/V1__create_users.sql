CREATE SEQUENCE users_sequence START WITH 1 INCREMENT BY 1;

CREATE TABLE commerce_platform_users (
  id BIGINT NOT NULL,
  username VARCHAR(255) NOT NULL,
  email VARCHAR(255) NOT NULL,
  password VARCHAR(255) NOT NULL,
  date_of_birth DATE NOT NULL,
  PRIMARY KEY (id)
);
