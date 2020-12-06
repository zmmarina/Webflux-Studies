package com.apirest.zmflux.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.apirest.zmflux.document.Playlist;

public interface PlaylistRepository extends ReactiveMongoRepository<Playlist, String> {

}
