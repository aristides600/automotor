package com.automotor.taller.servicios;

import com.automotor.taller.modelos.Orden;
import com.automotor.taller.repositorio.OrdenRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdenService {
    @Autowired
    private OrdenRepo ordenRepo;
    public List<Orden> listarOrdenes(){
        return ordenRepo.findAll();
    }
    //crear cliente
    public Orden crearOrden(Orden orden){
        return ordenRepo.save(orden);
    }
    //modificar cliente manda por ID
    public Orden modificarOrden(Orden orden){
        return ordenRepo.save(orden);
    }
    //eliminar
    public void eliminarOrden(Long id){
        ordenRepo.deleteById(id);
    }

}
