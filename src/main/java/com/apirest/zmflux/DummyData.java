package com.apirest.zmflux;

import java.util.UUID;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.apirest.zmflux.document.Playlist;
import com.apirest.zmflux.repository.PlaylistRepository;

import reactor.core.publisher.Flux;

//@Component
//public class DummyData implements CommandLineRunner {
//	
//	private final PlaylistRepository playlistRepository;
//	
//    DummyData(PlaylistRepository playlistRepository) {
//       this.playlistRepository = playlistRepository;
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//
//    	playlistRepository.deleteAll()
//                .thenMany(
//                        Flux.just("Relaxing", "Sports", "Studing", "Cooking time")
//                                .map(name -> new Playlist(UUID.randomUUID().toString(), name))
//                                .flatMap(playlistRepository::save))
//                .subscribe(System.out::println);
//    }
//
//}
