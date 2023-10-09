package com.example.prueba.model.comidas.ligeras;

import com.example.prueba.Persistencia.Persistente;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "colacion")
public class Colacion extends Persistente {

  @Setter @Getter
  @Column(name = "nombre")
  private String nombre;
}
