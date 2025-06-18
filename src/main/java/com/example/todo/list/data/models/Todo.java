package com.example.todo.list.data.models;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document
@Getter
@Setter
public class Todo {
    @Id
    private String id;
    private String task;
    private boolean done = false;
    private String userId;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime dateCompleted;
}
