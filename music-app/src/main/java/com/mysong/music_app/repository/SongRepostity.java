package com.mysong.music_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mysong.music_app.entity.Song;

public interface SongRepostity extends JpaRepository<Song, Long>{
}
