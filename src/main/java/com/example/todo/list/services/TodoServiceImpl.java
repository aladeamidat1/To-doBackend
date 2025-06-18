package com.example.todo.list.services;

import com.example.todo.list.data.Repositories.TodoRepo;
import com.example.todo.list.data.Repositories.UserRepo;
import com.example.todo.list.data.models.Todo;
import com.example.todo.list.dtos.requests.AddTaskRequest;
import com.example.todo.list.dtos.responses.AddTaskResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class TodoServiceImpl implements TodoService {

    @Autowired
    private TodoRepo todoRepo;

    @Autowired
    private UserRepo userRepo;

    @Override
    public List<AddTaskResponse> viewUndoneTask(String userId) {

    }

    @Override
    public List<AddTaskResponse> viewCompletedTask(String userId) {

    }

    @Override
    public void markTaskDone(AddTaskRequest task) {

    }

    @Override
    public void deleteTask(AddTaskRequest task) {

    }

    @Override
    public void deleteUndoneTask(String userId) {

    }

    @Override
    public void deleteFinishedTask(String userId) {

    }

    @Override
    public AddTaskResponse addTodo(AddTaskRequest taskRequest) {

    }

    @Override
    public List<Todo> findAllTodo(String id) {

    }

    @Override
    public AddTaskResponse viewTask(String userId, String taskToView) {

    }


}
