package com.automotor.taller.controlador;
import com.automotor.taller.modelos.Orden;
import com.automotor.taller.servicios.OrdenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ordenes")
public class OrdenControlador {
    @Autowired
    private OrdenService ordenService;
    //get
    @GetMapping
    public List<Orden> listarOrdenes(){
        return ordenService.listarOrdenes();
    }
    //post
    @PostMapping
    public Orden crearOrden(@RequestBody Orden orden){
        return ordenService.crearOrden(orden);
    }
    //put
    @PostMapping("/modificar/{id}")
    public Orden modificarCliente(@RequestBody Orden orden, @PathVariable Long id){
        orden.setOrd_id(id);
        return ordenService.modificarOrden(orden);
    }
    //delete
    @DeleteMapping("/eliminar/{id}")
    public void eliminarOrden(@PathVariable Long id){
        ordenService.eliminarOrden(id);

    }
}
