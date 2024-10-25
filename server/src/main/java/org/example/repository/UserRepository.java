package org.example.repository;

import org.springframework.data.r2dbc.repository.R2dbcRepository;

import org.example.entity.User;

public interface UserRepository extends R2dbcRepository<User, Long>{

}