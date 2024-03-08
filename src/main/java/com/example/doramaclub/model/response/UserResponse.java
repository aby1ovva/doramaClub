package com.example.doramaclub.model.response;


import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

public class UserResponse {
    Long id;

    String firstName;

    String lastName;

    String username;

    String password;

    String email;
}
