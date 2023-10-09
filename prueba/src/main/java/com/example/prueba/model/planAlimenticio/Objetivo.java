package com.example.prueba.model.planAlimenticio;

import com.example.prueba.Persistencia.Persistente;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter @Getter
@Table(name = "objetivo")
public class Objetivo extends Persistente {

  @Column(name = "descripcion")
  private String descripcion;

  @Column(name = "cumplido")
  private Boolean cumplido;

  @ManyToOne
  @JoinColumn(name = "plan_alimenticio_id", referencedColumnName = "id")
  private PlanAlimenticio planAlimenticio;

  public Objetivo(){}
}
