package com.lcwd.todo;

import com.lcwd.todo.dao.TodoDao;
import com.lcwd.todo.models.Todo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class TodoManagerApplication implements CommandLineRunner {
	Logger logger = LoggerFactory.getLogger(TodoManagerApplication.class);
   @Autowired
	private TodoDao todoDao;
	public static void main(String[] args) {
		SpringApplication.run(TodoManagerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*try {
			logger.info("Application Started: ");

			// Create a new Todo object
//			Todo todo = new Todo();
//			todo.setTitle("This is testing spring jdbc");
//			todo.setContent("wow its working");
//			todo.setStatus("PENDING");
//			todo.setAddedDate(new Date());
//			todo.setToDoDate(new Date());

			// Save the Todo object
			todoDao.saveTOdo(todo);


			logger.info("Todo saved successfully.");
		} catch (Exception e) {
			logger.error("An error occurred while saving the todo.", e);
		}*/
		/*Todo todo = todoDao.getTodo(13);
		logger.info("TODO : {}",todo);*/
		/*todo.setTitle("Learn SpringBoot Course");
		todo.setContent("I have to learn springboot");
		todo.setStatus("Done");
		todo.setAddedDate(new Date());
		todo.setToDoDate(new Date());
		todoDao.updateTodo(1230,todo);
         */
		/*List<Todo> allTodos = todoDao.getAllTodos();
		logger.info("All Todos :{}",allTodos);
*/
//     todoDao.deleteTodo(123);

//		todoDao.deleteMultiple(new int[]{123,124});

	}
}