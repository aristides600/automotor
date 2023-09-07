package com.automotor.taller.repositorio;

import com.automotor.taller.modelos.Orden;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdenRepo extends JpaRepository<Orden, Long> {
}
