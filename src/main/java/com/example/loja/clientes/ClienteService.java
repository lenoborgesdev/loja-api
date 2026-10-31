package com.example.loja.clientes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ClienteService {
    @Autowired
    ClienteRepository clienteRepository;

    public void criar(Cliente c) {
        this.clienteRepository.save(c);
    }

    public ArrayList<Cliente> buscarClientes() {
        return this.clienteRepository.findAll();
    }
}
