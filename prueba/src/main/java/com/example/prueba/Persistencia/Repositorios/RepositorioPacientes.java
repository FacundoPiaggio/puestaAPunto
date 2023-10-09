package com.example.prueba.Persistencia.Repositorios;

import com.example.prueba.model.personas.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioPacientes extends JpaRepository<Paciente, Long> {



}
