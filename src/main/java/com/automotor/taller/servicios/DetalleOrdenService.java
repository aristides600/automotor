package com.automotor.taller.servicios;

import com.automotor.taller.repositorio.DetalleOrdenRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetalleOrdenService {
    @Autowired
    private DetalleOrdenRepo detalleOrdenRepo;
}
