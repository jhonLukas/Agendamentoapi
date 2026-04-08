package com.Lukasdev.Agendamentoapi.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Lukasdev.Agendamentoapi.Entities.Scheduling;
import com.Lukasdev.Agendamentoapi.Repositories.SchedulingRepository;

@Service
public class SchedulingService {

	public SchedulingService(SchedulingRepository repository) {
		this.repository = repository;
	}

	private final SchedulingRepository repository;

	public Scheduling Creat(Scheduling scheduling) {
		boolean ocupado = repository.existsByDateAndTime(scheduling.getDate(), scheduling.getTime());

		if (ocupado) {
			throw new RuntimeException("Horário já ocupado");
		}

		return repository.save(scheduling);
	}

	public List<Scheduling> list() {
		return repository.findAll();
	}

	public Scheduling findById(Long id) {
		return repository.findById(id).orElseThrow(() -> new RuntimeException("Agendamento não encontrado"));
	}

}
