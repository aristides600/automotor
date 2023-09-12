package com.automotor.taller.servicios;

import com.automotor.taller.modelos.Respuesto;
import com.automotor.taller.repositorio.RespuestoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RespuestoService {
    @Autowired
    private RespuestoRepo respuestoRepo;
    public List<Respuesto> listarRespuestos(){
        return respuestoRepo.findAll();
    }
    //crear Respuesto
    public Respuesto crearRespuesto(Respuesto respuesto){
        return respuestoRepo.save(respuesto);
    }
    //modificar Respuesto manda por ID
    public Respuesto modificarRespuesto(Respuesto respuesto){
        return respuestoRepo.save(respuesto);
    }
    //eliminar Respuesto
    public void eliminarRespuesto(Long id){
        respuestoRepo.deleteById(id);
    }
}
