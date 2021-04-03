package br.com.study.cadastrousuario.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping
	public String home() {
		return "Hello Jessy, Talon Passou por aqui!";
	}
}
