package br.com.senai.uc8projeto.controller;

import br.com.senai.uc8projeto.model.Emprestimo;
import br.com.senai.uc8projeto.model.Solicitante;
import br.com.senai.uc8projeto.service.EmprestimoService;
import br.com.senai.uc8projeto.service.SolicitanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import javax.validation.Valid;

import java.net.URI;

@CrossOrigin("*")
@RestController
public class Principal {

	@Autowired
	private EmprestimoService emprestimoServiceservice;

	@Autowired
	private SolicitanteService solicitanteService;

	@GetMapping(value="/")
	public String create(){
		return "Retorno";
		//return ResponseEntity.ok().build();
	}

	@GetMapping(value="/emprestimo/{id}")
	public ResponseEntity<Emprestimo> findById(@PathVariable Integer id){
		Emprestimo obj = emprestimoServiceservice.findById(id);
		return ResponseEntity.ok().body(obj);
	}

	@PostMapping(value="/solicitante")
	public ResponseEntity<Solicitante> create(@Valid @RequestBody Solicitante obj){
		obj = solicitanteService.create(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();

		//return ResponseEntity.created(uri).body(obj);
		return ResponseEntity.created(uri).build();
	}
	
}
