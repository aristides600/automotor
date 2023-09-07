package com.automotor.taller.repositorio;

import com.automotor.taller.modelos.Modelo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModeloRepo extends JpaRepository<Modelo, Long> {
}
