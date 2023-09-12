package com.automotor.taller.servicios;

import com.automotor.taller.modelos.BajaOrden;
import com.automotor.taller.repositorio.BajaOrdenRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BajaOrdenService {
    @Autowired
    private BajaOrdenRepo bajaOrdenRepo;
    public List<BajaOrden> listarBajaOrdenes(){
        return bajaOrdenRepo.findAll();
    }
    //crear BajaOrden
    public BajaOrden crearBajaOrden(BajaOrden bajaOrden){
        return bajaOrdenRepo.save(bajaOrden);
    }
    //modificar BajaOrden manda por ID
    public BajaOrden modificarBajaOrden(BajaOrden bajaOrden){
        return bajaOrdenRepo.save(bajaOrden);
    }
    //eliminar BajaOrden
    public void eliminarBajaOrden(Long id){
        bajaOrdenRepo.deleteById(id);
    }
}
