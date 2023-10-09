package com.example.prueba.model.comidas;

import com.example.prueba.Persistencia.Persistente;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name= "comida_composicion")
@Setter @Getter
public class ComidaComposicion extends Persistente {

  @Enumerated(EnumType.STRING)
  private TipoComposicion tipoComposicion;

  @Column(name = "porcentaje")
  private Double porcentaje;

  @Column(name = "descripcion")
  private String descripcion;

  @ManyToOne
  @JoinColumn(name = "comida_id", referencedColumnName = "id")
  private Comida comida;
}
