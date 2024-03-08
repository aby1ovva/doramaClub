package com.example.doramaclub.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Table(name = "rating")
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Rating {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @OneToOne
    @JoinColumn(name = "user_id")
    User user;

    double rating;
}
