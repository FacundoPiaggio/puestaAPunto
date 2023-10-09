package com.example.prueba.model.personas;

import com.example.prueba.Persistencia.Persistente;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "disciplina")
@Setter @Getter
public class Disciplina extends Persistente {

  @Column(name = "nombre")
  private String nombre;

  public Disciplina(){}
}
