package com.automotor.taller.servicios;

import com.automotor.taller.modelos.Localidad;

import com.automotor.taller.modelos.Provincia;
import com.automotor.taller.repositorio.LocalidadRepo;

import com.automotor.taller.repositorio.ProvinciaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LocalidadService {
    @Autowired
    private LocalidadRepo localidadRepo;
    @Autowired
    private ProvinciaRepo provinciaRepo;

    public List<Localidad> listarLocalidad(){
        return localidadRepo.findAll();

    }
    public void crearLocalidad(long provincia_id, String loc_nombre){
        Provincia provincia = provinciaRepo.findById(provincia_id);
        Localidad localidad = new Localidad(loc_nombre);

        provincia.addLocalidad(localidad);

        localidadRepo.save(localidad);
        provinciaRepo.save(provincia);
    }

}
