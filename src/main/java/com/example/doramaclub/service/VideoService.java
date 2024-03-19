package com.example.doramaclub.service;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Path;

public interface VideoService {
    String saveVideo(MultipartFile video) throws IOException;
    Path getVideoPath(String videoPath);
    Resource loadVideoAsResource(Path videoPath) throws MalformedURLException;
}
