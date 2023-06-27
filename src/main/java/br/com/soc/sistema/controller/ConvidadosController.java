package br.com.soc.sistema.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.soc.sistema.model.Convidado;
import br.com.soc.sistema.repository.Convidados;

@Controller
public class ConvidadosController {

	@Autowired
	private Convidados convidados;

	/*
	 * Do modo abaixo, apenas retornará a View, porém sem nenhum dado passado do
	 * Controller para a View
	 */

//	@GetMapping(path = "/convidados")
//	public String listar() {
//		return "ListaConvidados";
//	}

	/*
	 * Deste modo, passam-se dados do Controller para a View, dizendo qual a página
	 * a ser renderizada
	 */
	@GetMapping(path = "/convidados")
	public ModelAndView listar() {
		ModelAndView modelAndView = new ModelAndView("ListaConvidados");
		modelAndView.addObject(new Convidado());
		modelAndView.addObject("convidados", convidados.findAll());
		return modelAndView;
	}

	@PostMapping("/convidados")
	public String salvar(Convidado convidado) {
		this.convidados.save(convidado);
		return "redirect:/convidados";
	}

}
