package br.com.senai.uc8projeto.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Principal {

	@GetMapping(value="/")
	public String findById(){
		return "Retorno";
		//return ResponseEntity.ok().build();
	}
	
}
