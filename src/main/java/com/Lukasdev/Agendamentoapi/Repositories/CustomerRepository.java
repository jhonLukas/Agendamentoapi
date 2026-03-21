package com.Lukasdev.Agendamentoapi.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Lukasdev.Agendamentoapi.Entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
