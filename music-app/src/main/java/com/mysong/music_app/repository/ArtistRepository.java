package com.mysong.music_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mysong.music_app.entity.Artist;

public interface ArtistRepository extends JpaRepository<Artist, Long>{
}
