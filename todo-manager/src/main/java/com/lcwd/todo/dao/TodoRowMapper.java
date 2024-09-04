package com.lcwd.todo.dao;

import com.lcwd.todo.helper.Helper;
import com.lcwd.todo.models.Todo;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TodoRowMapper implements RowMapper<Todo> {

    @Override
    public Todo mapRow(ResultSet rs, int rowNum) throws SQLException {
        Todo t = new Todo();
        t.setId(rs.getInt("id"));
        t.setTitle(rs.getString("title"));
        t.setContent(rs.getString("content"));
        t.setStatus(rs.getString("status"));
        t.setAddedDate(Helper.parseDate(rs.getTimestamp("addedDate").toLocalDateTime()));
        t.setToDoDate(Helper.parseDate(rs.getTimestamp("toDoDate").toLocalDateTime()));
        return t;
    }
}
