package com.mysong.music_app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mysong.music_app.entity.Song;
import com.mysong.music_app.repository.SongRepostity;

@Service
public class SongService {
    @Autowired
    private SongRepostity songRepostity;

    public List<Song> getAllSongs() {
        return songRepostity.findAll();
    }

    public Song saveSong(Song song) {
        return songRepostity.save(song);
    }
}
