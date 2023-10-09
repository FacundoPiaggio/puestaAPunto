package com.example.prueba.model.planAlimenticio;

import com.example.prueba.Persistencia.Persistente;
import com.example.prueba.model.personas.Profesional;
import com.example.prueba.model.comidas.Comida;
import com.example.prueba.model.comidas.ligeras.Bebida;
import com.example.prueba.model.comidas.ligeras.Colacion;
import com.example.prueba.model.personas.Paciente;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="plan_alimenticio")
public class PlanAlimenticio extends Persistente {

  @Setter @Getter
  @ManyToOne
  @JoinColumn(name = "profesional_id", referencedColumnName = "id")
  private Profesional profesional;

  @Setter @Getter
  @ManyToOne
  @JoinColumn(name = "paciente_id", referencedColumnName = "id")
  private Paciente paciente;

  @Setter @Getter
  @Column(name = "edad")
  private Integer edad;

  @Setter @Getter
  @Column(name = "peso")
  private Double peso;

  @Setter @Getter
  @Column(name = "medida_cintura")
  private Double medidaCintura;

  @Setter @Getter
  @Enumerated(EnumType.STRING)
  private DuracionPlan duracionPlan;

  @Getter
  @OneToMany(mappedBy = "planAlimenticio")
  private List<Objetivo> objetivos;

  @Getter
  @OneToMany(mappedBy = "planAlimenticio")
  private List<Comida> comidas;

  @Getter
  @ManyToMany
  private List<Bebida> bebidas;

  @Getter
  @ManyToMany
  private List<Colacion> colaciones;

  @Setter @Getter
  @Column(name = "cant_colaciones_permitidas")
  private Integer cantColacionesPermitidas;

  public PlanAlimenticio(){
    this.objetivos = new ArrayList<>();
    this.comidas = new ArrayList<>();
    this.bebidas = new ArrayList<>();
    this.colaciones = new ArrayList<>();
  }

  public Double obtenerCalificacion(){
    //TODO
    return null;
  }

  public Integer cantComidas(){
    return this.comidas.size();
  }

  public Integer cantComidasAC(){
    //TODO
    return null;
  }

  public Integer cantComidasDC(){
    //TODO
    return null;
  }

  public Boolean fuerteEnProteinas(){
    // TODO
    return null;
  }

  public Boolean esVerde(){
    //TODO
    return null;
  }

  public Integer cantBebidas(){
    return this.bebidas.size();
  }
}
