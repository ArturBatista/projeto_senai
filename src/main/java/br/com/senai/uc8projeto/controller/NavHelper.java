package br.com.senai.uc8projeto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NavHelper {
	@RequestMapping(value="/")
	public String index(){
		return "pages/index.html";
		//return ResponseEntity.ok().build();
	}
	
	@RequestMapping(value="/index.html")
	public String home(){
		return "pages/index.html";
		//return ResponseEntity.ok().build();
	}
	
	@RequestMapping(value="/ajuda.html")
	public String ajuda(){
		return "pages/ajuda.html";
		
	}
	
	@RequestMapping(value="/emprestimo.html")
	public String emprestimo(){
		return "pages/emprestimo.html";
		
	}
	
	@RequestMapping(value="/localizacao.html")
	public String localizacao(){
		return "pages/localizacao.html";
		
	}
	
	@RequestMapping(value="/maquina.html")
	public String maquina(){
		return "pages/maquina.html";
		
	}
	
	@RequestMapping(value="/solicitante.html")
	public String solicitante(){
		return "pages/solicitante.html";
		
	}
	
	@RequestMapping(value="/usuario.html")
	public String usuario(){
		return "pages/usuario.html";
		
	}
	
	@RequestMapping(value="/scripts/script") 
	public String js(){
		return "scripts/script.js";
		
	}
}
