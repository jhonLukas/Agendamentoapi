package com.Lukasdev.Agendamentoapi.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Lukasdev.Agendamentoapi.Entities.Customer;
import com.Lukasdev.Agendamentoapi.Entities.EmploymentContract;
import com.Lukasdev.Agendamentoapi.Repositories.CustomerRepository;
import com.Lukasdev.Agendamentoapi.Repositories.EmploymentContractRepository;

@RestController
@RequestMapping("/employment")
public class employmenController {

		@Autowired
		private EmploymentContractRepository repository;

		@PostMapping
		public EmploymentContract create(@RequestBody EmploymentContract employment) {
			return repository.save(employment);
		}

		@GetMapping
		public List<EmploymentContract> findAll() {
			return repository.findAll();
		}

		@GetMapping("/{id}")
		public EmploymentContract searchById(@PathVariable Long id) {
			return repository.findById(id).orElse(null);
		}

	}


