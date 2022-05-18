package com.example.smart.service;

import com.example.smart.model.Cliente;
import com.example.smart.repository.IClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private IClienteRepository clienteRepository;

    public List<Cliente> obtenerClientes(){
        return clienteRepository.findAll();
    }

    public Cliente agregarCliente(Cliente cliente){
        return clienteRepository.save(cliente);
    }


    public void eliminarCliente(int id){
       clienteRepository.deleteById(id);
    }

}

