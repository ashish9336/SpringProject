package com.lcwd.todo.controllers;

import com.lcwd.todo.exceptions.ExceptionResponse;
import com.lcwd.todo.exceptions.ResourceNotFoundException;
import com.lcwd.todo.models.Todo;
import com.lcwd.todo.services.TodoService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/todos")
public class TodoController {
    private static final Logger logger = LoggerFactory.getLogger(TodoController.class);
    @Autowired
    private TodoService todoService;
    private final Random random = new Random();

    @PostMapping
    public ResponseEntity<Todo> createTodoHandler(@RequestBody Todo todo) {
        int id = random.nextInt(9999999);
        todo.setId(id);
        Date currentDate = new Date();
        logger.info("Current date: {}", currentDate);
        logger.info("Todo date: {}", todo.getToDoDate());
        todo.setAddedDate(currentDate);

        logger.info("Create Todo");
        Todo createdTodo = todoService.createTodo(todo);
        return new ResponseEntity<>(createdTodo, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Todo>> getAllTodoHandler() {
        List<Todo> allTodos = todoService.getAllTodos();
        return new ResponseEntity<>(allTodos, HttpStatus.OK);
    }

    @GetMapping("/{todoId}")
    public ResponseEntity<Todo> getSingleTodoHandler(@PathVariable int todoId) {
        Todo todo = todoService.getTodo(todoId);
        return ResponseEntity.ok(todo);
    }

    @PutMapping("/{todoId}")
    public ResponseEntity<Todo> updateTodoHandler(@RequestBody Todo todoWithNewDetails, @PathVariable int todoId) {
        Todo updatedTodo = todoService.updateTodo(todoId, todoWithNewDetails);
        return ResponseEntity.ok(updatedTodo);
    }

    @DeleteMapping("/{todoId}")
    public ResponseEntity<String> deleteTodo(@PathVariable int todoId) {
        todoService.deleteTodo(todoId);
        return ResponseEntity.ok("Todo Successfully deleted");
    }

    @ExceptionHandler(NullPointerException.class)
    public ResponseEntity<String> nullPointerExceptionHandler(NullPointerException ex) {
        logger.error("Null pointer exception generated", ex);
        return new ResponseEntity<>("Null Pointer Exception generated: " + ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(NumberFormatException.class)
    public ResponseEntity<String> numberFormatExceptionHandler(NumberFormatException ex) {
        logger.error("Number format exception generated", ex);
        return new ResponseEntity<>("Number Format Exception generated: " + ex.getMessage(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ExceptionResponse> handlerResourceNotFoundException(ResourceNotFoundException ex) {
        logger.info("Error: {}", ex.getMessage());
        ExceptionResponse response = new ExceptionResponse();
        response.setMessage(ex.getMessage());
        response.setStatus(HttpStatus.NOT_FOUND);
        response.setSuccess(false);
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
    }
}
