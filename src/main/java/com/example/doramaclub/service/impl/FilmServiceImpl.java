package com.example.doramaclub.service.impl;

import com.example.doramaclub.entity.Film;
import com.example.doramaclub.model.request.FilmRequest;
import com.example.doramaclub.repository.FilmRepository;
import com.example.doramaclub.repository.GenreRepository;
import com.example.doramaclub.service.FilmService;
import com.example.doramaclub.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

@Service
public class FilmServiceImpl implements FilmService {

    private final FilmRepository filmRepository;
    private final GenreRepository genreRepository;
    private final VideoService videoService;

    @Autowired
    public FilmServiceImpl(FilmRepository filmRepository, GenreRepository genreRepository, VideoService videoService) {
        this.filmRepository = filmRepository;
        this.genreRepository = genreRepository;
        this.videoService = videoService;
    }

    public List<Film> getAllFilms() {
        return filmRepository.findAll();
    }

    public Film getFilmById(Long id) {
        return filmRepository.findById(id).orElse(null);
    }

    public Film createFilm(FilmRequest filmRequest) {
        try {
            String videoPath = videoService.saveVideo(filmRequest.getVideo());
            Film film = new Film();
            film.setTitle(filmRequest.getTitle());
            film.setDescription(filmRequest.getDescription());
            film.setGenre(genreRepository.findById(filmRequest.getGenreId()).orElse(null));
            film.setVideoPath(videoPath);
            return filmRepository.save(film);
        } catch (IOException e) {
            throw new RuntimeException("Failed to save video");
        }
    }

    public Resource getFilmVideoById(Long id) {
        Film film = getFilmById(id);
        if (film != null) {
            try {
                Path videoPath = videoService.getVideoPath(film.getVideoPath());
                return videoService.loadVideoAsResource(videoPath);
            } catch (IOException e) {
                throw new RuntimeException("Failed to load video resource");
            }
        }
        return null;
    }
}
