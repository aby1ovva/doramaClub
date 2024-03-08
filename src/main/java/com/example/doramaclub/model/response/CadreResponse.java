package com.example.doramaclub.model.response;


import com.example.doramaclub.entity.Film;
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
public class CadreResponse {
    Long id;


    Film film;
}
