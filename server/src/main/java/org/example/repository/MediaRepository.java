package org.example.repository;

import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import reactor.core.publisher.Flux;

import org.example.entity.*;

public interface MediaRepository extends R2dbcRepository<Media, Long> {

    @Query("SELECT * FROM pet WHERE owner_id =$1")
    public Flux<Media> findByUserId(Long id);

    @Query("SELECT owner.id, owner.name, COUNT(pet.id) AS pet_count FROM owner LEFT JOIN pet ON owner.id = pet.owner_id GROUP BY owner.id, owner.name ORDER BY pet_count DESC;")
    public Flux<UserMediaCount> getMediaCount();
}