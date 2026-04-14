package com.Lukasdev.Agendamentoapi.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Lukasdev.Agendamentoapi.Entities.Servico;
import com.Lukasdev.Agendamentoapi.Service.ServicoService;

@RestController
@RequestMapping("/employment")
public class ServicoController {

		@Autowired
		private ServicoService service;

		@PostMapping
		public Servico create(@RequestBody Servico employment) {
			return service.Create(employment);
		}

		@GetMapping
		public List<Servico> findAll() {
			return service.List();
		}

		@GetMapping("/{id}")
		public Servico searchById(@PathVariable Long id) {
			return service.findById(id);
		}

	}


