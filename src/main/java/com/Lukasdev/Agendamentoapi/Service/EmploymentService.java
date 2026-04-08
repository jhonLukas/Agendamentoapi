package com.Lukasdev.Agendamentoapi.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Lukasdev.Agendamentoapi.Entities.EmploymentContract;
import com.Lukasdev.Agendamentoapi.Repositories.EmploymentContractRepository;

@Service
public class EmploymentService {

	EmploymentService(EmploymentContractRepository repository) {
		this.repository = repository;
	}

	private final EmploymentContractRepository repository;

	public EmploymentContract Create(EmploymentContract contract) {
		if (contract.getName() == null || contract.getName().isBlank()) {
			throw new RuntimeException("O nome do serviço não pode estar em branco!!");
		}
		if (contract.getPrice() == null || contract.getPrice() == "0") {
			throw new RuntimeException("esse valor não esta permitido");
		}

		return repository.save(contract);

	}

	public List<EmploymentContract> List() {
		return repository.findAll();
	}

	public EmploymentContract findById(long id) {
		return repository.findById(id).orElseThrow(() -> new RuntimeException("informe o id do serviço "));

	}

}
