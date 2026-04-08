package com.Lukasdev.Agendamentoapi.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Lukasdev.Agendamentoapi.Entities.EmploymentContract;
import com.Lukasdev.Agendamentoapi.Service.EmploymentService;

@RestController
@RequestMapping("/employment")
public class EmploymenController {

		@Autowired
		private EmploymentService service;

		@PostMapping
		public EmploymentContract create(@RequestBody EmploymentContract employment) {
			return service.Create(employment);
		}

		@GetMapping
		public List<EmploymentContract> findAll() {
			return service.List();
		}

		@GetMapping("/{id}")
		public EmploymentContract searchById(@PathVariable Long id) {
			return service.findById(id);
		}

	}


