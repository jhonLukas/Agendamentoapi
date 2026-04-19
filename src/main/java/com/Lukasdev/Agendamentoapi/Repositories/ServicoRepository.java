package com.Lukasdev.Agendamentoapi.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Lukasdev.Agendamentoapi.Entities.Customer;
import com.Lukasdev.Agendamentoapi.Entities.Servico;

import Enums.ServicoEnum;

public interface ServicoRepository extends JpaRepository<Servico, Long> {

	boolean existsByName(ServicoEnum servicoEnum);

}
