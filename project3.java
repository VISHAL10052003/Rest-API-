package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class project3 {
@GetMapping("/")
public String handleMethod2(@RequestParam String color) {
	return "My favorite color is"+color;
}
}
