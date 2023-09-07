package com.automotor.taller.controlador;

import com.automotor.taller.servicios.DetalleOrdenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/detalleordenes")
public class DetalleOrdenControlador {
    @Autowired
    private DetalleOrdenService detalleOrdenService;
}
