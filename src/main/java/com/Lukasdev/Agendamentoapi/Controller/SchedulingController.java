package com.Lukasdev.Agendamentoapi.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Lukasdev.Agendamentoapi.Entities.Scheduling;
import com.Lukasdev.Agendamentoapi.Service.SchedulingService;

@RestController
@RequestMapping("/scheduling")
public class SchedulingController {

	@Autowired
	private SchedulingService service;

	@PostMapping
	public Scheduling create(@RequestBody Scheduling scheduling) {
		return service.Creat(scheduling);
	}

	@GetMapping
	public java.util.List<Scheduling> findAll() {
          return service.list();
	}
	
	@GetMapping("/{id}")
	public Scheduling searchById(@PathVariable Long id) {
		return service.findById(id);	}

}
