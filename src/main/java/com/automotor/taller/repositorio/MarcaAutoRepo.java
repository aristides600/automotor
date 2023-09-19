package com.automotor.taller.repositorio;

import com.automotor.taller.modelos.MarcaAuto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarcaAutoRepo extends JpaRepository<MarcaAuto, Long> {
}
