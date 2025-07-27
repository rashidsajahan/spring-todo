package com.rashid.helloword;

import com.rashid.helloword.models.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/todo")
public class TodoController {
    @Autowired
    private TodoService todoService;

//    @GetMapping("/get")
//    String getTodo() {
//        return "Todo";
//    }


    //Path variable
    @GetMapping("/{id}")
    ResponseEntity<Todo> getTodoById(@PathVariable long id) {
        try {
            Todo getTodoById = todoService.getTodoById(id);
            return new ResponseEntity<>(getTodoById, HttpStatus.OK);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping
    ResponseEntity<List<Todo>> getTodos(){
        return  new ResponseEntity<List<Todo>>(todoService.getTodos(), HttpStatus.OK);
    }


    //Request param
//    @GetMapping
//    String getTodoByIdParam(@RequestParam("todoId") long id) {
//        return "Todo with ID: " + id;
//    }

    //Request body
    @PostMapping("/create")
    ResponseEntity<Todo> createTodo(@RequestBody Todo todo) {
        Todo createTodo = todoService.createTodo(todo);
        return new ResponseEntity<>(createTodo, HttpStatus.CREATED);
    }

    //Path variable
    @PutMapping
    ResponseEntity<Todo> updateTodo( @RequestBody Todo todo) {
        return new ResponseEntity<>(todoService.updateTodo(todo), HttpStatus.CREATED);
    }

    //Path variable
    @DeleteMapping("/{id}")
    void deleteTodo(@PathVariable long id) {
        todoService.deleteTodoById(id);
    }
}
