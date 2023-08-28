package com.automotor.taller.controlador;

import com.automotor.taller.modelos.Localidad;
import com.automotor.taller.servicios.LocalidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/localidad")
public class LocalidadControlador {

    @Autowired
    private LocalidadService localidadService;

    @GetMapping
    public List<Localidad> listarLocalidad(){
        return localidadService.listarLocalidad();
    }

    @PostMapping("/{id}")
    public void crearLocalidad(@PathVariable long id, @RequestBody Localidad localidad){
        localidadService.crearLocalidad(id, localidad.getLoc_nombre());
    }
}
