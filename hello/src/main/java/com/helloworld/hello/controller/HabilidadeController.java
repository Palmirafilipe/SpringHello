package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/habilidade")

public class HabilidadeController {
	
	@GetMapping
	public String habilidades() {
		return "Percistencia e Orientação ao Detalhe";
		
	}
}
