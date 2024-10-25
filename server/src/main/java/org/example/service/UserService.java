package org.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import org.example.entity.User;
import org.example.repository.UserRepository;

public class UserService {

    /* @Autowired
    private UserRepository useRep;

    public Mono<User> saveUser(User user){
        return userRep.save(user);
    }

    public Flux<User> getAllUsers(){
        return userRep.findAll();
    }

    public Mono<User> getUserById(Long id){
        return userRep.findById(id);
    }

    public Mono<Void> deleteUser(Long id){
        return userRep.deleteById(id);
    } */
}