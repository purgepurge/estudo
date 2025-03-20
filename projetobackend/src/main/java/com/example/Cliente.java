package com.example;

public class Cliente {
    private String nomeDoCliente;

    public Cliente (String nomeDoCliente) {
        this.nomeDoCliente = nomeDoCliente;
    }
    
    public String getNomeDoCliente() {
        return nomeDoCliente;
    }
}