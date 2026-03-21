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
import com.Lukasdev.Agendamentoapi.Repositories.CustomerRepository;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerRepository repository;

	@PostMapping
	public Customer create(@RequestBody Customer customer) {
		return repository.save(customer);
	}

	@GetMapping
	public List<Customer> findAll() {
		return repository.findAll();
	}

	@GetMapping("/{id}")
	public Customer searchById(@PathVariable Long id) {
		return repository.findById(id).orElse(null);
	}

}
