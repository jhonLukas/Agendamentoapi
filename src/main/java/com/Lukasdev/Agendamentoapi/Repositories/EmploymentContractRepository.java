package com.Lukasdev.Agendamentoapi.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Lukasdev.Agendamentoapi.Entities.Customer;
import com.Lukasdev.Agendamentoapi.Entities.EmploymentContract;

public interface EmploymentContractRepository extends JpaRepository<EmploymentContract, Long> {

}
