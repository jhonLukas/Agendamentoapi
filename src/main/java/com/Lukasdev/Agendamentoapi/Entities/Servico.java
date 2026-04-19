package com.Lukasdev.Agendamentoapi.Entities;

import Enums.ServicoEnum;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Servico {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
@Enumerated(EnumType.STRING)
private ServicoEnum name;
private Integer price;
}
