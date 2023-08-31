package com.automotor.taller.servicios;

import com.automotor.taller.modelos.Cliente;
import com.automotor.taller.repositorio.ClienteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepo clienteRepo;
    //mostrar clientes

    public List<Cliente> listarClientes(){
        return clienteRepo.findAll();
    }
    //crear cliente
    public Cliente crearCliente(Cliente cliente){
        return clienteRepo.save(cliente);
    }
    //modificar cliente manda por ID
    public Cliente modificarCliente(Cliente cliente){
        return clienteRepo.save(cliente);
    }
    //eliminar
    public void eliminarCliente(Long id){
        clienteRepo.deleteById(id);
    }
}
