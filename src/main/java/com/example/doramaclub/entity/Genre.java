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
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "Genre")

public class Genre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    Long id;

    String genre;

}
