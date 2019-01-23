package com.example.appengine.demos.springboot;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Task {
	
	 @PostMapping("/worker")
	  public void worker() {
		  System.out.println("worker task");
	  }

}
