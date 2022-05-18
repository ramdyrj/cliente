package com.example.smart.controller;

import com.example.smart.model.Cliente;
import com.example.smart.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping("/clientes")
    public List<Cliente> findAll(){
        return clienteService.obtenerClientes();
    }


    @PutMapping("/agregar")
    public ResponseEntity<?> insertar(@RequestBody Cliente cliente) {
        Cliente insertado= clienteService.agregarCliente(cliente);
        return ResponseEntity.ok(insertado);
    }


    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable("id")int id){
        clienteService.eliminarCliente(id);
    }



}
