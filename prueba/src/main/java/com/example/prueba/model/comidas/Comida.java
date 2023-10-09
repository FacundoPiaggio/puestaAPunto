package com.example.prueba.model.comidas;

import com.example.prueba.Persistencia.Persistente;
import com.example.prueba.model.planAlimenticio.PlanAlimenticio;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Entity
@Table(name = "Comida")
public class Comida extends Persistente {

  @Setter @Getter
  @Enumerated(EnumType.STRING)
  private TipoDeComida tipo;

  @Setter @Getter
  @Column(name = "descripcion")
  private String descripcion;

  @Getter
  @OneToMany(mappedBy = "comida")
  private List<ComidaComposicion> composiciones;

  @Getter @Setter
  @ManyToOne
  @JoinColumn(name = "plan_alimenticio_id", referencedColumnName = "id")
  private PlanAlimenticio planAlimenticio;

  public Comida(){
    this.composiciones = new ArrayList<>();
  }

  public void agregarComposicion(ComidaComposicion... comidasCompuestas){
    Collections.addAll(this.composiciones, comidasCompuestas);
  }
}
