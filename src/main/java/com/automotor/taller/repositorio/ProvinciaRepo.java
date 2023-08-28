package com.automotor.taller.repositorio;

import com.automotor.taller.modelos.Provincia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProvinciaRepo extends JpaRepository<Provincia, Long> {
    Provincia findById(long provincia_id);
}
