package com.Lukasdev.Agendamentoapi.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Lukasdev.Agendamentoapi.Entities.Customer;
import com.Lukasdev.Agendamentoapi.Entities.Servico;

public interface ServicoRepository extends JpaRepository<Servico, Long> {

	boolean existsByName(String name);

}
