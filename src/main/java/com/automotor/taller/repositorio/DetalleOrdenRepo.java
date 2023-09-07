package com.automotor.taller.repositorio;

import com.automotor.taller.modelos.DetalleOrden;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetalleOrdenRepo extends JpaRepository<DetalleOrden, Long> {
}
