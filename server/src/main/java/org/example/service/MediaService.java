package org.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import org.example.entity.*;
import org.example.repository.*;

public class MediaService{

    @Autowired
    private MediaRepository mediaRep;

    public Mono<Media> saveMedia(Media media){
        return mediaRep.save(media);
    }

    public Flux<Media> getAllMedia(){
        return mediaRep.findAll();
    }

    public Mono<Media> getMediaById(Long id){
        return mediaRep.findById(id);
    }

    public Mono<Void> deleteMedia(Long id){
        return mediaRep.deleteById(id);
    }

    public Flux<Media> getMediaByUserId(Long id){
        return mediaRep.findByUserId(id);
    }

    public Flux<UserMediaCount> getMediaCount(){
        return mediaRep.getMediaCount();
    }
}