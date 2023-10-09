package com.example.prueba.model.personas;

import com.example.prueba.Persistencia.Persistente;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "profesional")
@Setter @Getter
public class Profesional extends Persistente {

  @Column(name = "nombre")
  private String nombre;

  @Column(name = "apellido")
  private String apellido;

  @Column(name = "matricula")
  private String matricula;

  @ManyToOne
  @JoinColumn(name = "especialidad_id", referencedColumnName = "id")
  private Especialidad especialidad;

  public Profesional(){}
}
