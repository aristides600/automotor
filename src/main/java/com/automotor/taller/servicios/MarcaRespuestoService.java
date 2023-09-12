package com.automotor.taller.servicios;

import com.automotor.taller.modelos.MarcaRespuesto;
import com.automotor.taller.repositorio.MarcaRespuestoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarcaRespuestoService {
    @Autowired
    private MarcaRespuestoRepo marcaRespuestoRepo;
    //Listar
    public List<MarcaRespuesto> listarMarcaRespuesto(){
        return marcaRespuestoRepo.findAll();
    }
    //crear
    public MarcaRespuesto crearMarcaRespuesto(MarcaRespuesto marcaRespuesto){
        return marcaRespuestoRepo.save(marcaRespuesto);
    }
    //modificar  manda por ID
    public MarcaRespuesto modificarMarcaRespuesto(MarcaRespuesto marcaRespuesto){
        return marcaRespuestoRepo.save(marcaRespuesto);
    }
    //eliminar
    public void eliminarMarcaRespuesto(Long id){
        marcaRespuestoRepo.deleteById(id);
    }
}
