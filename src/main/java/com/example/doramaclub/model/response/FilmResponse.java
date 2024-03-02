package com.example.doramaclub.model.response;

import com.example.doramaclub.entity.Genre;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class FilmResponse {
    Long id;

    String name;

    int productionYear;

    String description;


    Genre genre;

}
