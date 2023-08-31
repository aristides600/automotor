package com.automotor.taller.servicios;


import com.automotor.taller.modelos.Usuario;
import com.automotor.taller.repositorio.UsuarioRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepo usuarioRepo;
    //Listar
    public List<Usuario> listarUsuario(){
        return usuarioRepo.findAll();
    }
    //crear
    public Usuario crearUsuario(Usuario usuario){
        return usuarioRepo.save(usuario);
    }
    //modificar  manda por ID
    public Usuario modificarUsuario(Usuario usuario){
        return usuarioRepo.save(usuario);
    }
    //eliminar
    public void eliminarUsuario(Long id){
        usuarioRepo.deleteById(id);
    }
}
