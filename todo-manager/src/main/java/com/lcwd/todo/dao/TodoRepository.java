package com.lcwd.todo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.lcwd.todo.models.Todo;

public interface TodoRepository extends JpaRepository<Todo, Integer> {
}
