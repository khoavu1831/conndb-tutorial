package com.mysong.music_app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mysong.music_app.entity.Artist;
import com.mysong.music_app.service.ArtistService;

@RestController
@RequestMapping("api/artists")
public class ArtistController {
    @Autowired
    private ArtistService artistService;

    @GetMapping
    public List<Artist> getAllArtists() {
        return artistService.getAllArtists();
    }

    @PostMapping
    public Artist createArtist(@RequestBody Artist artist) {
        return artistService.sasveArtist(artist);
    }
}
