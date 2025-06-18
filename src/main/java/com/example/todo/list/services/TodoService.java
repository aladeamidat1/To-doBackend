package com.example.todo.list.services;

import com.example.todo.list.data.models.Todo;
import com.example.todo.list.dtos.requests.AddTaskRequest;
import com.example.todo.list.dtos.responses.AddTaskResponse;


import java.util.List;


public interface TodoService{

        List<AddTaskResponse> viewUndoneTask(String userId);
        List<AddTaskResponse> viewCompletedTask(String userId);

        void markTaskDone(AddTaskRequest task);
        void deleteTask(AddTaskRequest task);

        void deleteUndoneTask(String userId);
        void deleteFinishedTask(String userId);

        AddTaskResponse addTodo(AddTaskRequest taskRequest);


        List<Todo> findAllTodo(String id);

        AddTaskResponse viewTask(String userId, String taskToView);
    }

