package com.automotor.taller.servicios;

import com.automotor.taller.modelos.Contribuyente;
import com.automotor.taller.repositorio.ContribuyenteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContribuyenteService {
    @Autowired
    private ContribuyenteRepo contribuyenteRepo;
    @Autowired
    private ContribuyenteRepo clienteRepo;
    //mostrar

    public List<Contribuyente> listarContribuyente(){
        return contribuyenteRepo.findAll();
    }
    //crear
    public Contribuyente crearContribuyente(Contribuyente contribuyente){
        return contribuyenteRepo.save(contribuyente);
    }
    //modificar  manda por ID
    public Contribuyente modificarContribuyente(Contribuyente contribuyente){
        return contribuyenteRepo.save(contribuyente);
    }
    //eliminar
    public void eliminarContribuyente(Long id){
        contribuyenteRepo.deleteById(id);
    }
}
