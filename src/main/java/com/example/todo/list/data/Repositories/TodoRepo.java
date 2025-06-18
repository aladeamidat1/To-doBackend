package com.example.todo.list.data.Repositories;

import com.example.todo.list.data.models.Todo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepo extends MongoRepository <Todo, String> {
    List<Todo> findByUserId(String userId);
    Todo findByTask(String tasks);
}
