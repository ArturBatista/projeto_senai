package br.com.senai.uc8projeto.controller;

import br.com.senai.uc8projeto.model.Emprestimo;
import br.com.senai.uc8projeto.model.Solicitante;
import br.com.senai.uc8projeto.service.EmprestimoService;
import br.com.senai.uc8projeto.service.SolicitanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import javax.validation.Valid;

import java.net.URI;

@CrossOrigin("*")
@Controller
public class Principal {

	@Autowired
	private EmprestimoService emprestimoServiceservice;

	@GetMapping(value="/emprestimo/{id}")
	public ResponseEntity<Emprestimo> findById(@PathVariable Integer id){
		Emprestimo obj = emprestimoServiceservice.findById(id);
		return ResponseEntity.ok().body(obj);
	}

	
}
