package com.automotor.taller.repositorio;

import com.automotor.taller.modelos.BajaOrden;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BajaOrdenRepo extends JpaRepository<BajaOrden, Long> {
}
