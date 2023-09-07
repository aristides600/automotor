package com.automotor.taller.repositorio;

import com.automotor.taller.modelos.Vehiculo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehiculoRepo extends JpaRepository<Vehiculo, Long> {
}
