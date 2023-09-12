package com.automotor.taller.servicios;

import com.automotor.taller.modelos.Servicio;
import com.automotor.taller.repositorio.ServicioRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ServicioService {
    @Autowired
    private ServicioRepo servicioRepo;
    public List<Servicio> listarServicios(){
        return servicioRepo.findAll();
    }
    //crear Servicio
    public Servicio crearServicio(Servicio servicio){
        return servicioRepo.save(servicio);
    }
    //modificar Servicio manda por ID
    public Servicio modificarServicio(Servicio servicio){
        return servicioRepo.save(servicio);
    }
    //eliminar Servicio
    public void eliminarServicio(Long id){
        servicioRepo.deleteById(id);
    }

}
