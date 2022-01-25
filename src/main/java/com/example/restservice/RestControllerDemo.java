package com.example.restservice;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
// import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.json.JSONObject;


@RestController
public class RestControllerDemo {

    private static final String template = "Hello, this is %s! Welcome to my Jenkins course!!!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/hello")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
	
}
