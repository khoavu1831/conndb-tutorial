package com.mysong.music_app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mysong.music_app.entity.Artist;
import com.mysong.music_app.repository.ArtistRepository;

@Service
public class ArtistService {
    @Autowired
    private ArtistRepository artistRepository;

    public List<Artist> getAllArtists() {
        return artistRepository.findAll();
    }

    public Artist sasveArtist(Artist artist) {
        return artistRepository.save(artist);
    }
}
