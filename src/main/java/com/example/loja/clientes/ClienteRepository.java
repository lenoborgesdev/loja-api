package com.example.loja.clientes;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;
import java.util.UUID;

public interface ClienteRepository extends JpaRepository<Cliente, UUID> {

    public ArrayList<Cliente> findAll();
}

