package com.automotor.taller.controlador;

import com.automotor.taller.modelos.Provincia;
import com.automotor.taller.servicios.ProvinciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/provincias")
public class ProvinciaControlador {
    @Autowired
    private ProvinciaService provinciaService;

    @GetMapping
    public List<Provincia> listarProvincia(){
        return provinciaService.listarProvincia();
    }
    @PostMapping
    public ResponseEntity<Object> crearProvincia(@RequestBody Provincia provincia){
        provinciaService.crearProvincia(provincia.getPro_nombre());
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

}
