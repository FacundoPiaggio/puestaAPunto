package com.example.prueba.model.personas;

import com.example.prueba.Persistencia.Persistente;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "paciente")
@Getter @Setter
public class Paciente extends Persistente {

  @Column(name = "nombre")
  private String nombre;

  @Column(name = "apellido")
  private String apellido;

  @Column(name = "fecha_nacimiento")
  private Date fechaNacimiento;

  @ManyToOne
  @JoinColumn(name = "disciplina_id", referencedColumnName = "id")
  private Disciplina disciplina;

  @Enumerated(EnumType.STRING)
  private Sexo sexo;

  public Paciente(){}
}
