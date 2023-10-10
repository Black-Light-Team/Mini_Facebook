package com.example.logintest.Repo;

import com.example.logintest.Entity.Commentaire;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentaireRepository extends MongoRepository<Commentaire, String> {
}
