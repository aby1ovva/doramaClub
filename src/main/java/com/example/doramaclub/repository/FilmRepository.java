package com.example.doramaclub.repository;

import com.example.doramaclub.entity.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface FilmRepository extends JpaRepository<Film, Long> {
    Optional<Film> findByVideoPath(String videoPath);
}
