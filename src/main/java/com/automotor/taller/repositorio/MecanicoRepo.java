package com.automotor.taller.repositorio;

import com.automotor.taller.modelos.Mecanico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MecanicoRepo extends JpaRepository<Mecanico, Long> {
}
