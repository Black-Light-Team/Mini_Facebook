package com.example.logintest.Repo;

import com.example.logintest.Entity.Poste;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PosteRepository extends MongoRepository<Poste, String> {
}
