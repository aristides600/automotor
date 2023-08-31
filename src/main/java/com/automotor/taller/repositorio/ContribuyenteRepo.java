package com.automotor.taller.repositorio;

import com.automotor.taller.modelos.Contribuyente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContribuyenteRepo extends JpaRepository<Contribuyente, Long> {
}
