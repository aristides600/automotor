package com.automotor.taller.controlador;

import com.automotor.taller.modelos.Vehiculo;
import com.automotor.taller.servicios.VehiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/vehiculos")
public class VehiculoControlador {
    @Autowired
    private VehiculoService vehiculoService;
    //get
    @GetMapping
    public List<Vehiculo> listarVehiculos(){
        return vehiculoService.listarVehiculos();
    }
    //post
    @PostMapping
    public Vehiculo crearVehiculo(@RequestBody Vehiculo vehiculo){
        return vehiculoService.crearVehiculo(vehiculo);
    }
    //put
    @PostMapping("/modificar/{id}")
    public Vehiculo modificarVehiculo(@RequestBody Vehiculo vehiculo, @PathVariable Long id){
        vehiculo.setVeh_id(id);
        return vehiculoService.modificarVehiculo(vehiculo);
    }
    //delete
    @DeleteMapping("/eliminar/{id}")
    public void eliminarVehiculo(@PathVariable Long id){
        vehiculoService.eliminarVehiculo(id);

    }
}
