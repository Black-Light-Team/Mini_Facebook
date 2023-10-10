package com.example.logintest.Repo;

import com.example.logintest.Entity.Profile;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface profileRepository extends MongoRepository<Profile, String> {
}
