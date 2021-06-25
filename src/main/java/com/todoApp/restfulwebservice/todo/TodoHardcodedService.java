package com.todoApp.restfulwebservice.todo;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class TodoHardcodedService {
	
	private static List<Todo> todos = new ArrayList<Todo>();
	private static long idCounter = 0;
	
	static {
		todos.add(new Todo(++idCounter, "gracelyun", "learn to Dance", new Date(), false));
		todos.add(new Todo(++idCounter, "gracelyun", "learn about Microservices 2", new Date(), false));
		todos.add(new Todo(++idCounter, "gracelyun", "learn about Angular", new Date(), false));
	}
	
	public List<Todo> findAll(){
		return todos;
	}
	
	public Todo deleteByID(long id) {
		Todo todo = findById(id);
		if(todo == null) {
			return null;
		}
		if(todos.remove(todo)) {
			return todo;
		}
		
		return null;
				
	}
	
	public Todo add(Todo todo) {
		if(todo.getId() == -1 || todo.getId() == 0) {
			todo.setId(++idCounter);
			todos.add(todo);
		}else {
			deleteByID(todo.getId());
			todos.add(todo);
		}
		return todo;
	}

	public Todo findById(long id) {
		for(Todo todo: todos) {
			if(todo.getId() == id) {
				return todo;
			}
		}
		return null;
	}

}
