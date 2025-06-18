package com.example.todo.list.data.Repositories;

import com.example.todo.list.data.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo extends MongoRepository<User, String> {

    Optional<User> findByEmail(String Email);

    boolean existsByUsername(String username);

    User findByUsername(String username);
}
