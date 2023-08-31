package com.automotor.taller.servicios;

import com.automotor.taller.modelos.Rol;
import com.automotor.taller.repositorio.RolRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolService {
    @Autowired
    private RolRepo rolRepo;

    public List<Rol> listarRol(){
        return rolRepo.findAll();
    }
    //crear
    public Rol crearRol(Rol rol){
        return rolRepo.save(rol);
    }
    //modificar  manda por ID
    public Rol modificarRol(Rol rol){
        return rolRepo.save(rol);
    }
    //eliminar
    public void eliminarRol(Long id){
        rolRepo.deleteById(id);
    }
}
