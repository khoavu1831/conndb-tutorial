package com.mysong.music_app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mysong.music_app.entity.Song;
import com.mysong.music_app.service.SongService;

@RestController
@RequestMapping("api/songs")
public class SongController {
    @Autowired
    private SongService songService;

    @GetMapping
    public List<Song> getAllSongs() {
        return songService.getAllSongs();
    }

    @PostMapping
    public Song createSong(@RequestBody Song song) {
        return songService.saveSong(song);
    }
}
