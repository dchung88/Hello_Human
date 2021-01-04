package com.codingdojo.hellohuman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@RequestMapping("/")
	public String hello(@RequestParam(value="name", required=false) String searchName) {
		if(searchName == null) {
			return "Hello Human!";
		} else {
			return "Hello " + searchName + "!";
		}
	}
}
