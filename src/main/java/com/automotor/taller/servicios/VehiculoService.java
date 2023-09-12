package com.automotor.taller.servicios;

import com.automotor.taller.modelos.Vehiculo;
import com.automotor.taller.repositorio.VehiculoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehiculoService {
    @Autowired
    private VehiculoRepo vehiculoRepo;
    public List<Vehiculo> listarVehiculos(){
        return vehiculoRepo.findAll();
    }
    //crear vehiculo
    public Vehiculo crearVehiculo(Vehiculo vehiculo){
        return vehiculoRepo.save(vehiculo);
    }
    //modificar vehiculo manda por ID
    public Vehiculo modificarVehiculo(Vehiculo vehiculo){
        return vehiculoRepo.save(vehiculo);
    }
    //eliminar vehiculo
    public void eliminarVehiculo(Long id){
        vehiculoRepo.deleteById(id);
    }
}
