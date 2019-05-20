package com.bolsadeideas.springboot.web.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping("/")
 public String Home() {
	// return "redirect:/app/index"; ruta cambia
		//return "redirect:https://www.google.com";
		return "forward:/app/index"; //ruta no cambia
 }
}
