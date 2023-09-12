package com.automotor.taller.servicios;

import com.automotor.taller.modelos.DetalleOrden;
import com.automotor.taller.repositorio.DetalleOrdenRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetalleOrdenService {
    @Autowired
    private DetalleOrdenRepo detalleOrdenRepo;
    public List<DetalleOrden> listarDetalleOrdenes(){
        return detalleOrdenRepo.findAll();
    }
    //crear detalleOrden
    public DetalleOrden crearDetalleOrden(DetalleOrden detalleOrden){
        return detalleOrdenRepo.save(detalleOrden);
    }
    //modificar detalleOrden manda por ID
    public DetalleOrden modificarDetalleOrden(DetalleOrden detalleOrden){
        return detalleOrdenRepo.save(detalleOrden);
    }
    //eliminar detalleOrden
    public void eliminarDetalleOrden(Long id){
        detalleOrdenRepo.deleteById(id);
    }
}
