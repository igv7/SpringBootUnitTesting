package com.igor.SpringBootUnitTesting.rest;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/myController")
public class MyController {
	
	@GetMapping("/greet")
	public String greet() {
		return "Hello World!";
	}
	
	
	
	
	
	@GetMapping(value = "/json", produces = MediaType.APPLICATION_JSON_VALUE)
	public Hello json() {
		return new Hello("Greetings", "Hello World!");
		
	}
	
	private class Hello {
		
		private String title;
		private String value;
		
		public Hello(String title, String value) {
			super();
			this.title = title;
			this.value = value;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}
		

	}

}
