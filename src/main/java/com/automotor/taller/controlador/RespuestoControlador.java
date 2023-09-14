package com.automotor.taller.controlador;

import com.automotor.taller.modelos.Respuesto;
import com.automotor.taller.servicios.RespuestoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/respuestos")
public class RespuestoControlador {
    @Autowired
    private RespuestoService respuestoService;
    //get
    @GetMapping
    public List<Respuesto> listarRespuestos(){
        return respuestoService.listarRespuestos();
    }
    //post
    @PostMapping
    public Respuesto crearRespuesto(@RequestBody Respuesto respuesto){
        return respuestoService.crearRespuesto(respuesto);
    }
    //put
    @PostMapping("/modificar/{id}")
    public Respuesto modificarRespuesto(@RequestBody Respuesto respuesto, @PathVariable Long id){
        respuesto.setRes_id(id);
        return respuestoService.modificarRespuesto(respuesto);
    }
    //delete
    @DeleteMapping("/eliminar/{id}")
    public void eliminarRespuesto(@PathVariable Long id){
        respuestoService.eliminarRespuesto(id);

    }
}
