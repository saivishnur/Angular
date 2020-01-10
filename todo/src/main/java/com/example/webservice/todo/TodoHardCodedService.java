package com.example.webservice.todo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class TodoHardCodedService {
	
	// they act as local database in this case
	private static List<Todo> todos = new ArrayList<Todo>();
	private static int idCounter=0;
	static {
		todos.add(new Todo(++idCounter,"JavaScript",true,new Date()));
		todos.add(new Todo(++idCounter,"TypeScript",false,new Date()));
		todos.add(new Todo(++idCounter,"Angular",true,new Date()));
		todos.add(new Todo(++idCounter,"React",false,new Date()));
		todos.add(new Todo(++idCounter,"Node",true,new Date()));

		
	}
	
	public List<Todo> findAll() {
		return todos;
	}
}
