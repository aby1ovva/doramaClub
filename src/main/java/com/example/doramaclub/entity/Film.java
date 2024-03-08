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
@Table(name = "film")
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String name;

    int productionYear;

    String description;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "genre_id")
    Genre genre;


}
