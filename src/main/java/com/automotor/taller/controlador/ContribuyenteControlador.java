package com.automotor.taller.controlador;

import com.automotor.taller.modelos.Contribuyente;
import com.automotor.taller.servicios.ContribuyenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/contribuyentes")
public class ContribuyenteControlador {
    @Autowired
    private ContribuyenteService contribuyenteService;
    //get
    @GetMapping
    public List<Contribuyente> listarcContribuyentes(){
        return contribuyenteService.listarContribuyente();
    }
    //post
    @PostMapping
    public Contribuyente crearContribuyente(@RequestBody Contribuyente contribuyente){
        return contribuyenteService.crearContribuyente(contribuyente);
    }
    //put
    @PostMapping("/modificar/{id}")
    public Contribuyente modificarUsuario(@RequestBody Contribuyente contribuyente, @PathVariable Long id){
        contribuyente.setCon_id(id);
        return contribuyenteService.modificarContribuyente(contribuyente);
    }
    //delete
    @DeleteMapping("/eliminar/{id}")
    public void eliminarContribuyente(@PathVariable Long id){
        contribuyenteService.eliminarContribuyente(id);

    }
}
