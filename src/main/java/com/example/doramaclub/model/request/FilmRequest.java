package com.example.doramaclub.model.request;


import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.web.multipart.MultipartFile;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class FilmRequest {

    String title;

    int productionYear;

    String description;

    Long genreId;

    MultipartFile video;

}
