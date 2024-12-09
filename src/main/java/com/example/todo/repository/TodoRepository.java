package com.example.todo.repository;

import com.example.todo.model.Todo;
import java.util.*;

public interface TodoRepository {
    List<Todo> getTodos();

    Todo getTodosById(int todoId);

    Todo addTodo(Todo todo);

    Todo updateTodo(int todoId, Todo todo);

    void deleteTodo(int todoId);
}