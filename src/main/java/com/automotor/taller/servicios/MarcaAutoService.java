package com.automotor.taller.servicios;

import com.automotor.taller.modelos.MarcaAuto;
import com.automotor.taller.repositorio.MarcaAutoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MarcaAutoService {
    @Autowired
    private MarcaAutoRepo marcaAutoRepo;
    public List<MarcaAuto> listarMarcaAutos(){
        return marcaAutoRepo.findAll();
    }
    //crear
    public MarcaAuto crearMarcaAuto(MarcaAuto marcaAuto){
        return marcaAutoRepo.save(marcaAuto);
    }
    //modificar manda por ID
    public MarcaAuto modificarMarcaAuto(MarcaAuto marcaAuto){
        return marcaAutoRepo.save(marcaAuto);
    }
    //eliminar
    public void eliminarMarcaAuto(Long id){
        marcaAutoRepo.deleteById(id);
    }

}
