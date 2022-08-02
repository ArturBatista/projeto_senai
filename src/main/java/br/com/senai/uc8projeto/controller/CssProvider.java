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
	 
	@RequestMapping(value="/css/emprestimocss")
	public String esmprestimoCss() {
		return "css/emprestimo.css";
	}
	
	@RequestMapping(value="/emprestimo/css/emprestimocss")
	public String esmprestimoOptCss() {
		return "css/emprestimo.css";
	}
	
	@RequestMapping(value="/emprestimo/editar/css/emprestimocss")
	public String esmprestimoEditarCss() {
		return "css/emprestimo.css";
	}
	
	@RequestMapping(value="emprestimo/cadastrar/css/emprestimocss")
	public String esmprestimoCadastrarCss() {
		return "css/emprestimo.css";
	}
	
	@RequestMapping(value="/css/maquinacss")
	public String maquinaCss() {
		return "css/maquina.css";
	}
	
	@RequestMapping(value="/maquina/css/maquinacss")
	public String maquinaOptsCss() {
		return "css/maquina.css";
	}
	
	@RequestMapping(value="/css/resetcss")
	public String resetCss() {
		return "css/reset.css";
	}
	
	@RequestMapping(value="/css/todoconteudocss")
	public String todoConteudoCss() {
		return "css/todo-conteudo.css";
	}
	
	@RequestMapping(value="/maquina/css/todoconteudocss")
	public String todoConteudoMaquinaCss() {
		return "css/todo-conteudo.css";
	}
	
	@RequestMapping(value="/maquina/editar/css/todoconteudocss")
	public String todoConteudoMaquinaEditCss() {
		return "css/todo-conteudo.css";
	}
	
	@RequestMapping(value="/solicitante/css/todoconteudocss")
	public String todoConteudoSolicitanteCss() {
		return "css/todo-conteudo.css";
	}
	
	@RequestMapping(value="/solicitante/editar/css/todoconteudocss")
	public String todoConteudoSolicitanteEditCss() {
		return "css/todo-conteudo.css";
	}
	
	@RequestMapping(value="/emprestimo/css/todoconteudocss")
	public String todoConteudoEmprestimoCss() {
		return "css/todo-conteudo.css";
	}
	
	@RequestMapping(value="/emprestimo/cadastrar/css/todoconteudocss")
	public String todoConteudoEmprestimoCadastrarCss() {
		return "css/todo-conteudo.css";
	}
	
	@RequestMapping(value="/emprestimo/editar/css/todoconteudocss")
	public String todoConteudoEmprestimoEditarCss() {
		return "css/todo-conteudo.css";
	}
}
