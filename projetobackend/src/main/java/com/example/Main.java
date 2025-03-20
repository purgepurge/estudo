package com.example;

public class Main {
    public static void main(String[] args) {
        Facade facade = new Facade("Hotel California");
        facade.inicializarHotel();
        System.out.println("Adicionando cliente...");
        facade.adicionarCliente("Cliente 51");
        System.out.println("Removendo cliente...");
        facade.removerUltimoCliente();
        System.out.println("Status final do hotel:");
        facade.status();
    }
}