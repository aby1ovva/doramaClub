package com.example.doramaclub.model.request;

import com.example.doramaclub.entity.User;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class NotificationsRequest {
    User user;

    String message;

}
