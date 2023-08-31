package com.automotor.taller.controlador;

import com.automotor.taller.modelos.Cliente;
import com.automotor.taller.servicios.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clientes")
public class ClienteControlador {
    @Autowired
    private ClienteService clienteService;
    //get
    @GetMapping
    public List<Cliente> listarClientes(){
        return clienteService.listarClientes();
    }
    //post
    @PostMapping
    public Cliente crearCliente(@RequestBody Cliente cliente){
        return clienteService.crearCliente(cliente);
    }
    //put
    @PostMapping("/modificar/{id}")
    public Cliente modificarCliente(@RequestBody Cliente cliente, @PathVariable Long id){
        cliente.setCli_id(id);
        return clienteService.modificarCliente(cliente);
    }
    //delete
    @DeleteMapping("/eliminar/{id}")
    public void eliminarCliente(@PathVariable Long id){
        clienteService.eliminarCliente(id);

    }

}
