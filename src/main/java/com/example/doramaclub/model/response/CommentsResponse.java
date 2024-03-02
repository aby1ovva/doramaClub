package com.example.doramaclub.model.response;

import com.example.doramaclub.entity.User;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CommentsResponse {
    Long id;


    User user;

    String comment;
}
