package com.example.loja.clientes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    @Autowired
    ClienteService clienteService;

    @PostMapping
    public void cadastrar(@RequestBody Cliente c){
        this.clienteService.criar(c);
    }

    @GetMapping
    public ArrayList<Cliente> listarClientes(){
        return this.clienteService.buscarClientes();
    }
}
