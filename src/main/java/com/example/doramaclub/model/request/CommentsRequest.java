package com.example.doramaclub.model.request;


import com.example.doramaclub.entity.User;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CommentsRequest {
    User user;

    String comment;
}
