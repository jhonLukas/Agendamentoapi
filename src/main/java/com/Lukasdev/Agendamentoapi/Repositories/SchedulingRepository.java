package com.Lukasdev.Agendamentoapi.Repositories;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Lukasdev.Agendamentoapi.Entities.Scheduling;

public interface SchedulingRepository extends JpaRepository<Scheduling, Long> {

	boolean existsByDateAndTime(LocalDate date, LocalTime time);

}
