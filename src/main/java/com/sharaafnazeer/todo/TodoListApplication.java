package com.sharaafnazeer.todo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.sharaafnazeer.todo.repo")
@SpringBootApplication()
public class TodoListApplication {

	public static void main(String[] args) {
		System.out.println("Application started");
		SpringApplication.run(TodoListApplication.class, args);
	}

}
