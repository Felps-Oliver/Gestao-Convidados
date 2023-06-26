package br.com.soc.sistema.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.soc.sistema.model.Convidado;

public interface Convidados extends JpaRepository<Convidado, Long> {
	
}
