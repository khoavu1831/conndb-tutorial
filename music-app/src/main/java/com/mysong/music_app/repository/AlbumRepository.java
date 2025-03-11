package com.mysong.music_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mysong.music_app.entity.Album;

public interface AlbumRepository extends JpaRepository<Album, Long> {  
}
