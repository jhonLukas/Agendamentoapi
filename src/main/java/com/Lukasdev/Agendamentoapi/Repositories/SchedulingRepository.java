package com.Lukasdev.Agendamentoapi.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Lukasdev.Agendamentoapi.Entities.Scheduling;

public interface SchedulingRepository extends JpaRepository<Scheduling, Long> {

}
