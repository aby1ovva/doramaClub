package com.example.doramaclub.controller;

import com.example.doramaclub.entity.Film;
import com.example.doramaclub.model.request.FilmRequest;
import com.example.doramaclub.service.FilmService;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/films")
public class FilmController {

    private final FilmService filmService;

    public FilmController(FilmService filmService) {
        this.filmService = filmService;
    }


    @GetMapping
    public List<Film> getAllFilms() {
        return filmService.getAllFilms();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Film> getFilmById(@PathVariable Long id) {
        Film film = filmService.getFilmById(id);
        if (film != null) {
            return ResponseEntity.ok(film);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<Film> createFilm(@RequestBody FilmRequest filmRequest) {
        Film createdFilm = filmService.createFilm(filmRequest);
        return ResponseEntity.ok(createdFilm);
    }

    @GetMapping("/{id}/video")
    public ResponseEntity<Resource> getFilmVideoById(@PathVariable Long id) {
        Resource videoResource = filmService.getFilmVideoById(id);
        if (videoResource != null) {
            return ResponseEntity.ok(videoResource);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
