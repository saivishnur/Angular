package com.example.webservice.todo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.webservice.todo.Todo;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class TodoResources {
	
	@Autowired
	private TodoHardCodedService todoService;

	@GetMapping("users/{username}/todos")
	public List<Todo> getAllTodos(@PathVariable String username) {
		
		return todoService.findAll();
	}
}
