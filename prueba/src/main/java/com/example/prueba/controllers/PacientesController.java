package com.example.prueba.controllers;


import com.example.prueba.Persistencia.Repositorios.RepositorioPacientes;
import com.example.prueba.model.personas.Paciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class PacientesController {

  @Autowired
  private RepositorioPacientes repositorioPacientes;

  @GetMapping("/pacientes")
  public List<Paciente> getPacientes() {
    List<Paciente> pacientes = repositorioPacientes.findAll();

    for(Paciente paciente : pacientes){
      System.out.println(paciente.getNombre());
    }

    return repositorioPacientes.findAll();

  }
}
