package org.hackerandpainter.rest.todos;

import org.hackerandpainter.rest.todos.todo.Todo;
import org.hackerandpainter.rest.todos.todo.TodoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase {

	@Bean
    CommandLineRunner initDatabase(TodoRepository repository) {
		return args -> {
			repository.save(new Todo("todo 1"));
			repository.save(new Todo("todo 2"));
		};
	}
}
