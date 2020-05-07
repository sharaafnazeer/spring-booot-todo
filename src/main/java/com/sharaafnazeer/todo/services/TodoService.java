package com.sharaafnazeer.todo.services;

import com.sharaafnazeer.todo.model.Todo;

import java.util.List;

public interface TodoService {

    List<Todo> getTodoList();

    Todo getTodo(int id);

    Todo storeTodo(Todo todo);

    boolean deleteTodo(int id);
}
