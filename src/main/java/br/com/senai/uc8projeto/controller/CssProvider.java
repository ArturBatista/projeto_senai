package br.com.senai.uc8projeto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CssProvider {

	//CSS's
	@RequestMapping(value="/css/principalcss")
	public String principalCss() {
		return "css/principal.css";
	}
	
	@RequestMapping(value="/css/ajudacss")
	public String ajudaCss() {
		return "css/ajuda.css";
	}
	 
	@RequestMapping(value={"/css/emprestimocss", "*/css/emprestimocss"})
	public String esmprestimoCss() {
		return "css/emprestimo.css";
	}
	
	@RequestMapping(value={"/css/maquinacss","*/css/maquinacss"})
	public String maquinaCss() {
		return "css/maquina.css";
	}
	
	@RequestMapping(value="/css/resetcss")
	public String resetCss() {
		return "css/reset.css";
	}

	@RequestMapping(value={"/css/todoconteudocss", "*/css/todoconteudocss"})
	public String todoConteudoMaquinaCss() {
		return "css/todo-conteudo.css";
	}
}
