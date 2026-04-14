package com.Lukasdev.Agendamentoapi.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Lukasdev.Agendamentoapi.Entities.Servico;
import com.Lukasdev.Agendamentoapi.Repositories.ServicoRepository;

@Service
public class ServicoService {

	ServicoService(ServicoRepository repository) {
		this.repository = repository;
	}

	private final ServicoRepository repository;

	public Servico Create(Servico contract) {
		if (contract.getName() == null) {
			throw new RuntimeException("O serviço deve ser informado!!");
		}
		
		boolean existe = repository.existsByName(contract.getName());
		
		if (contract.getName() == null) {
			throw new RuntimeException("O serviço deve ser informado !!");
		}
		if (contract.getPrice() == null || contract.getPrice() <= 0) {
			throw new RuntimeException("O valor deve ser a cima desse número");
		}

		return repository.save(contract);

	}	

	public List<Servico> List() {
		return repository.findAll();
	}

	public Servico findById(long id) {
		return repository.findById(id).orElseThrow(() -> new RuntimeException("informe o id do serviço "));

	}

}
