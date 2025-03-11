package com.mysong.music_app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mysong.music_app.entity.Album;
import com.mysong.music_app.service.AlbumService;

@RestController
@RequestMapping("api/albums")
public class AlbumController {
    @Autowired
    private AlbumService albumService;

    @GetMapping
    public List<Album> getAllAlbums() {
        return albumService.getAllAlbums();
    }

    @PostMapping
    public Album createAblum(@RequestBody Album album) {
        return albumService.saveAlbum(album);
    }

    
}
