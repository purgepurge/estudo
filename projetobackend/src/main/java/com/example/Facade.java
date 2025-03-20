package com.example;

public class Facade {
    private Hotel hotel;
    // Criando o hotel
    public Facade (String nomeDoHotel) {
        this.hotel = new Hotel(nomeDoHotel);
    }
    // Inicializa o hotel com 50 clientes
    public void inicializarHotel() {
        for (int i = 1  ; i <= 50; i++) {
            Cliente cliente = new Cliente("Cliente " + i);
            hotel.adicionarCliente(cliente);
        }
        
        hotel.mostrarStatusDoHotel();

        hotel.listarQuartos();
    }

    public void adicionarCliente(String nome) {
        Cliente cliente = new Cliente(nome);
        hotel.adicionarCliente(cliente);
    }

    public void removerUltimoCliente(){
        hotel.removerCliente();
    }

    public void status(){
        hotel.mostrarStatusDoHotel();
    }

}
