package com.example.doramaclub.model.request;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserRequest {


    String firstName;

    String lastName;

    String username;

    String password;

    String email;
}
