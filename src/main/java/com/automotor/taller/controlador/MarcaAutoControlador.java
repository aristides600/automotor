package com.automotor.taller.controlador;

import com.automotor.taller.modelos.MarcaAuto;
import com.automotor.taller.modelos.Usuario;
import com.automotor.taller.servicios.MarcaAutoService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/marcavehiculos")
public class MarcaAutoControlador {
    @Autowired
    private MarcaAutoService marcaAutoService;

    @GetMapping
    public List<MarcaAuto> listarMarcaAutos(){
        return marcaAutoService.listarMarcaAutos();
    }
    //post
    @PostMapping
    public MarcaAuto crearUsuario(@RequestBody MarcaAuto marcaAuto){
        return marcaAutoService.crearMarcaAuto(marcaAuto);
    }
    //put
    @PostMapping("/modificar/{id}")
    public MarcaAuto modificarUsuario(@RequestBody MarcaAuto marcaAuto, @PathVariable Long id){
        marcaAuto.setMar_id(id);
        return marcaAutoService.modificarMarcaAuto(marcaAuto);
    }
    //delete
    @DeleteMapping("/eliminar/{id}")
    public void eliminarUsuario(@PathVariable Long id){
        marcaAutoService.eliminarMarcaAuto(id);

    }
}
