package com.automotor.taller.repositorio;

import com.automotor.taller.modelos.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepo extends JpaRepository<Cliente, Long> {
}
