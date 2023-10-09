package com.example.prueba.Persistencia;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;


@MappedSuperclass
public abstract class Persistente {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Setter @Getter
  private Long id;
}
