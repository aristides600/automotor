package com.automotor.taller.repositorio;

import com.automotor.taller.modelos.Servicio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicioRepo extends JpaRepository<Servicio, Long> {
}
