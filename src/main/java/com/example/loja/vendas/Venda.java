package com.example.loja.vendas;

import com.example.loja.clientes.Cliente;
import com.example.loja.produtos.Produto;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity
public class Venda {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private LocalDateTime dataVenda;
    @ManyToOne
    private Cliente cliente;
    @ManyToOne
    private Produto produto;

    public Venda(LocalDateTime dataVenda, Cliente cliente, Produto produto) {
        this.dataVenda = dataVenda;
        this.cliente = cliente;
        this.produto = produto;
    }

    public Venda() {

    }
}
