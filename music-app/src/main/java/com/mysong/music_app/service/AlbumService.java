package com.mysong.music_app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mysong.music_app.entity.Album;
import com.mysong.music_app.repository.AlbumRepository;

@Service
public class AlbumService {
    @Autowired
    private AlbumRepository albumRepository;

    public List<Album> getAllAlbums() {
        return albumRepository.findAll();
    }

    public Album saveAlbum(Album album) {
        return albumRepository.save(album);
    }
}
