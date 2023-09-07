package com.automotor.taller.controlador;

import com.automotor.taller.servicios.BajaOrdenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/bajaordenes")
public class BajaOrdenControlador {
    @Autowired
    private BajaOrdenService bajaOrdenService;
}
