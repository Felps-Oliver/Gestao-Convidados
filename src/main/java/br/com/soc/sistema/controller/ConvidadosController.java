package br.com.soc.sistema.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ConvidadosController {
	
	@GetMapping(path = "/convidados")
	public String listar() {
		return "ListaConvidados";
	}

}
