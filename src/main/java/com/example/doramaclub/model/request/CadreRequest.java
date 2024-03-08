package com.example.doramaclub.model.request;


import com.example.doramaclub.entity.Film;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CadreRequest {
    Film film;
}
