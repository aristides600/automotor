package com.automotor.taller.servicios;

import com.automotor.taller.modelos.Provincia;
import com.automotor.taller.repositorio.ProvinciaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProvinciaService {
    @Autowired
    private ProvinciaRepo provinciaRepo;

    public List<Provincia> listarProvincia(){
        return provinciaRepo.findAll();

    }
    public void crearProvincia(String pro_nombre){
        Provincia provincia = new Provincia(pro_nombre);
        provinciaRepo.save(provincia);
    }

}
