package com.Lukasdev.Agendamentoapi.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Lukasdev.Agendamentoapi.Entities.Customer;
import com.Lukasdev.Agendamentoapi.Repositories.CustomerRepository;
import com.Lukasdev.Agendamentoapi.Repositories.SchedulingRepository;

@Service
public class CustomerService {

	private final CustomerRepository repository;

	//private final CustomerRepository repository = null;
	public CustomerService(CustomerRepository repository) {
		this.repository = repository;
	}

	
	public Customer Create(Customer customer) {

		if (customer.getName() == null || customer.getName().isBlank()) {
			throw new RuntimeException("O nome do Cliente não deve estar em branco!");
		}

		boolean exist = repository.existsByTell(customer.getTell());

		if (exist) {

			throw new RuntimeException("Esse número já está sendo usado por outro cliente ! ");
		}

		return repository.save(customer);

	}

	public List<Customer> List() {

		return repository.findAll();
	}
	
	public Customer findById(Long id) {
		return repository.findById(id).orElseThrow(() ->
		new RuntimeException("Deve informar um id para buscar o cliente"));
	}
	
	public void  Delete(Long id){
		 repository.deleteById(id);
		 throw new RuntimeException ("deletado com sucesso!!");
	}
}
