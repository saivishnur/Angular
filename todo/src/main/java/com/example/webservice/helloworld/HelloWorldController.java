package com.example.webservice.helloworld;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;



@CrossOrigin(origins="http://localhost:4200")
@RestController
public class HelloWorldController {

	//@RequestMapping(method = RequestMethod.GET, path="/helloworld")
	@GetMapping(path="/helloworld")
	public String display() {
		return "Hello World";
	}
	
	@GetMapping(path="/helloworldbean")
	public Helloworldbean displayBean() {
		throw new RuntimeException("This module causes an error");
		//return new Helloworldbean("helloworld");
	}
	
	@GetMapping(path="/helloworldbean/pathvariable/{name}")
	public Helloworldbean displayBean(@PathVariable String name) {
		return new Helloworldbean(String.format("helloworld,%s",name));
	}
}
