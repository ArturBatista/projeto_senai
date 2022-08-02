package br.com.senai.uc8projeto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NavHelper {
	@RequestMapping(value="/")
	public String index(){
		return "pages/index";
		//return ResponseEntity.ok().build();
	}
	
	
	@RequestMapping(value="/index")
	public String home(){
		return "pages/index";
		//return ResponseEntity.ok().build();
	}
	
	@RequestMapping(value="/ajuda")
	public String ajuda(){
		return "pages/ajuda";
		
	}
	
	@RequestMapping(value="/emprestimo")
	public String emprestimo(){
		return "pages/emprestimo";
		
	}
	
	@RequestMapping(value="/emprestimo/voltar")
	public String emprestimoVoltar(){
		return "redirect:../";
		
	}
	
	@RequestMapping(value="/localizacao")
	public String localizacao(){
		return "pages/localizacao";
		
	}
	

	@RequestMapping(value="/maquina/voltar")
	public String maquinaVoltar(){
		return "redirect:../maquina";
		
	}
	
	@RequestMapping(value="/maquina/editar/voltar")
	public String maquinaEditVoltar(){
		return "redirect:../";
		
	}
	
	@RequestMapping(value="/solicitante/voltar")
	public String solicitante(){
		return "redirect:../solicitante";
		
	}
	
	@RequestMapping(value="/solicitante/editar/voltar")
	public String solicitanteEditVoltar(){
		return "redirect:../";
		
	}
	
	
	@RequestMapping(value="/usuario")
	public String usuario(){
		return "pages/usuario";
		
	}
	
	@RequestMapping(value="/scripts/script") 
	public String js(){
		return "scripts/script.js";
		
	}
	

	
	@RequestMapping(value="/indexN")
	public String indexN(){
		return "pages/index";
		//return ResponseEntity.ok().build();
	}
	
	@RequestMapping(value="/agendamento")
	public String agendamento(){
		return "pages/agendamento";
		//return ResponseEntity.ok().build();
	}
	
}
