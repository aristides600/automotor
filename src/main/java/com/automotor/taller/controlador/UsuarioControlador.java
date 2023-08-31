package com.automotor.taller.controlador;

import com.automotor.taller.modelos.Usuario;
import com.automotor.taller.servicios.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/usuarios")
public class UsuarioControlador {
    @Autowired
    private UsuarioService usuarioService;
    //get
    @GetMapping
    public List<Usuario> listarUsuarios(){
        return usuarioService.listarUsuario();
    }
    //post
    @PostMapping
    public Usuario crearUsuario(@RequestBody Usuario usuario){
        return usuarioService.crearUsuario(usuario);
    }
    //put
    @PostMapping("/modificar/{id}")
    public Usuario modificarUsuario(@RequestBody Usuario usuario, @PathVariable Long id){
        usuario.setUsu_id(id);
        return usuarioService.modificarUsuario(usuario);
    }
    //delete
    @DeleteMapping("/eliminar/{id}")
    public void eliminarUsuario(@PathVariable Long id){
        usuarioService.eliminarUsuario(id);

    }
}
