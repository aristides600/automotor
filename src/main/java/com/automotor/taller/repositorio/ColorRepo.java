package com.automotor.taller.repositorio;

import com.automotor.taller.modelos.Color;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ColorRepo extends JpaRepository<Color, Long> {
}
