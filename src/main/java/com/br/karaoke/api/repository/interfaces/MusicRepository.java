package com.br.karaoke.api.repository.interfaces;

import org.springframework.data.repository.CrudRepository;

import com.br.karaoke.api.model.Music;

public interface MusicRepository extends CrudRepository<Music, Long> {

}
