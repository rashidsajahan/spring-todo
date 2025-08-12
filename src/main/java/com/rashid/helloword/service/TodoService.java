package com.rashid.helloword.service;

import com.rashid.helloword.models.Todo;
import com.rashid.helloword.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

//Bean - give the access to create obj automatically to string
//@Bean - this also work
@Service
public class TodoService {
    //Auto wire
    @Autowired
    private TodoRepository todoRepository;

    public Todo createTodo(Todo data) {
        return todoRepository.save(data);
    }

    public Todo getTodoById(Long id) {
        return todoRepository.findById(id).orElseThrow(() -> new RuntimeException("Todo not found."));
    }

    public List<Todo> getTodos() {
        return todoRepository.findAll();
    }

    public Page<Todo> getAllTodoPages(int page, int size){
        Pageable pageable = PageRequest.of(page, size);
        return todoRepository.findAll(pageable);
    }

    public Todo updateTodo(Todo todo) {
        return todoRepository.save(todo);
    }

    public void deleteTodoById(Long id) {
        todoRepository.delete(getTodoById(id));
    }

    public void deleteTodo(Todo todo) {
        todoRepository.delete(todo);
    }
}
