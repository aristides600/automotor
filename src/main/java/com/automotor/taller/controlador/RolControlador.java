package com.automotor.taller.controlador;

import com.automotor.taller.modelos.Cliente;
import com.automotor.taller.modelos.Rol;
import com.automotor.taller.servicios.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/roles")
public class RolControlador {
    @Autowired
    private RolService rolService;
    //get
    @GetMapping
    public List<Rol> listarRoles(){
        return rolService.listarRol();
    }
    //post
    @PostMapping
    public Rol crearRol(@RequestBody Rol rol){
        return rolService.crearRol(rol);
    }
    //put
    @PostMapping("/modificar/{id}")
    public Rol modificarRol(@RequestBody Rol rol, @PathVariable Long id){
        rol.setRol_id(id);
        return rolService.modificarRol(rol);
    }
    //delete
    @DeleteMapping("/eliminar/{id}")
    public void eliminarRol(@PathVariable Long id){
        rolService.eliminarRol(id);

    }
}
