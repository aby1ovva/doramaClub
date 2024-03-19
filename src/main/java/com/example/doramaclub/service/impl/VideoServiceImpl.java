package com.example.doramaclub.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.*;


import com.example.doramaclub.service.VideoService;

@Service
public class VideoServiceImpl implements VideoService {


    @Value("${movie.video.dir}")
    private String videoDir;

    public String saveVideo(MultipartFile video) throws IOException {
        String videoFileName = System.currentTimeMillis() + "_" + video.getOriginalFilename();
        Path videoPath = Paths.get(videoDir, videoFileName);
        Files.copy(video.getInputStream(), videoPath, StandardCopyOption.REPLACE_EXISTING);
        return videoPath.toString();
    }

    public Path getVideoPath(String videoPath) {
        return Paths.get(videoPath);
    }

    public Resource loadVideoAsResource(Path videoPath) throws MalformedURLException {
        Resource videoResource = new UrlResource(videoPath.toUri());
        if (videoResource.exists() || videoResource.isReadable()) {
            return videoResource;
        } else {
            throw new RuntimeException("Failed to load video resource");
        }
    }
}
