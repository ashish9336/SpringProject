package com.lcwd.todo.dao;

import com.lcwd.todo.helper.Helper;
import com.lcwd.todo.models.Todo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public class TodoDao {
    private static final Logger logger = LoggerFactory.getLogger(TodoDao.class);

    private final JdbcTemplate template;

    @Autowired
    public TodoDao(JdbcTemplate template) {
        this.template = template;
        initializeDatabase();
    }

    private void initializeDatabase() {
        String createTable = "CREATE TABLE IF NOT EXISTS todos (id INT PRIMARY KEY, title VARCHAR(100) NOT NULL, content VARCHAR(500), status VARCHAR(10) NOT NULL, addedDate DATETIME, toDoDate DATETIME)";
        template.update(createTable);
        logger.info("TODO TABLE INITIALIZED");
    }

    public Todo saveTodo(Todo todo) {
        String insertQuery = "INSERT INTO todos (id, title, content, status, addedDate, toDoDate) VALUES (?, ?, ?, ?, ?, ?)";
        int rows = template.update(insertQuery, todo.getId(), todo.getTitle(), todo.getContent(), todo.getStatus(), todo.getAddedDate(), todo.getToDoDate());
        logger.info("JDBC OPERATION: {} inserted", rows);
        return todo;
    }

    public Todo getTodo(int id) {
        String query = "SELECT * FROM todos WHERE id = ?";
        try {
            return template.queryForObject(query, new TodoRowMapper(), id);
        } catch (EmptyResultDataAccessException e) {
            logger.error("No todo found with id: {}", id);
            return null;
        }
    }

    public List<Todo> getAllTodos() {
        String query = "SELECT * FROM todos";
        return template.query(query, new TodoRowMapper());
    }

    public Todo updateTodo(int id, Todo newTodo) {
        String query = "UPDATE todos SET title = ?, content = ?, status = ?, addedDate = ?, toDoDate = ? WHERE id = ?";
        int update = template.update(query, newTodo.getTitle(), newTodo.getContent(), newTodo.getStatus(), newTodo.getAddedDate(), newTodo.getToDoDate(), id);

        if (update == 0) {
            logger.warn("No todo found with id: {}", id);
            return null;
        }

        logger.info("UPDATED {}", update);
        newTodo.setId(id);
        return newTodo;
    }

    public void deleteTodo(int id) {
        String query = "DELETE FROM todos WHERE id = ?";
        int update = template.update(query, id);
        logger.info("Deleted {}", update);
    }

    public void deleteMultiple(int[] ids) {
        String query = "DELETE FROM todos WHERE id = ?";
        template.batchUpdate(query, new BatchPreparedStatementSetter() {
            @Override
            public void setValues(PreparedStatement ps, int i) throws SQLException {
                ps.setInt(1, ids[i]);
            }

            @Override
            public int getBatchSize() {
                return ids.length;
            }
        });
        for (int id : ids) {
            logger.info("Deleted {}", id);
        }
    }


}
