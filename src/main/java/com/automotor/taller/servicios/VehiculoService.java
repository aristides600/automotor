package com.automotor.taller.servicios;

import com.automotor.taller.repositorio.VehiculoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehiculoService {
    @Autowired
    private VehiculoRepo vehiculoRepo;
}
