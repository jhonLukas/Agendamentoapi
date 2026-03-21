package com.Lukasdev.Agendamentoapi.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Lukasdev.Agendamentoapi.Entities.Customer;
import com.Lukasdev.Agendamentoapi.Entities.Scheduling;
import com.Lukasdev.Agendamentoapi.Repositories.SchedulingRepository;

import jakarta.validation.constraints.AssertFalse.List;

@RestController
@RequestMapping("/scheduling")
public class SchedulingController {

	@Autowired
	private SchedulingRepository repository;

	@PostMapping
	public Scheduling create(@RequestBody Scheduling scheduling) {
		return repository.save(scheduling);
	}

	@GetMapping
	public java.util.List<Scheduling> findAll() {
          return repository.findAll();
	}
	
	@GetMapping("/{id}")
	public Scheduling searchById(@PathVariable Long id) {
		return repository.findById(id).orElse(null);
	}

}
