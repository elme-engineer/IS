package org.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;

import org.example.entity.*;

@RestController
@RequestMapping("/media")
public class MediaController {


    @GetMapping
    private Flux<Media> getAllMedia(){

        return Flux.just(
            new Media("1", "The Godfather", "date", 9.2, false),
            new Media("2", "The Dark Night", "date", 9, false)
        );
    }
}
