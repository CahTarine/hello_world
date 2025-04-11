package com.generation.atividade1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "atv1-spring", produces = "text/plain")
public class Atividade01Controller {
	
	@GetMapping
	public String helloworld() {
		return "Hello World!";
	}
	
	@GetMapping("/listabsm")
	public String listaBSM() {
		return "As BSM's da Generation incluem:\n\n"
				+ "Mentalidade do Crescimento\n"
				+ "Responsabilidade Pessoal\n"
				+ "Orientacao ao Futuro\n"
				+ "Comunicacao\n"
				+ "Trabalho em Equipe\n"
				+ "Proatividade\n"
				+ "Orientacao ao Detalhe";
	}
	
	@GetMapping("/objetivos-da-semana")
	public String objetivosSemana() {
		return "Os principais objetivos de aprendizagem desta semana foram:\n\n"
				+ "Aprender a mexer com banco de dados MySQL\n"
				+ "Aprender sobre protocolos e APIs\n"
				+ "Aprender a mexer no Spring\n"
				+ "Aprender melhores formas de procurar vagas de emprego\n"
				+ "Aprender mais sobre inteligencia emocional e sua importancia";
	}
}
