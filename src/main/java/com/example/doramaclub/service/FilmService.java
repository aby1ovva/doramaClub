package com.example.doramaclub.service;

import com.example.doramaclub.entity.Film;
import com.example.doramaclub.model.request.FilmRequest;
import org.springframework.core.io.Resource;

import java.util.List;
public interface FilmService {
    List<Film> getAllFilms();
    Film getFilmById(Long id);
    Film createFilm(FilmRequest filmRequest);
    Resource getFilmVideoById(Long id);
}
