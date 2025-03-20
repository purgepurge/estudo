package com.example;

public class QuartoDeHotel {
    private int numeroDoQuarto;
    private boolean statusDeOcupacao; // False = Disponível, True = Ocupado
    private Cliente cliente;

    public QuartoDeHotel(int numeroDoQuarto) {
        this.numeroDoQuarto = numeroDoQuarto;
        this.statusDeOcupacao = false; // Inicialmente, o quarto está disponível
        this.cliente = null;// Inicialmente, o quarto não tem cliente
    }

    public void ocuparQuarto(Cliente cliente) {
        this.statusDeOcupacao = true;
        this.cliente = cliente;
    }

    public void desocuparQuarto() {
        this.statusDeOcupacao = false;
        this.cliente = null;
    }

    public Boolean getStatusDeOcupacao() {
        return statusDeOcupacao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public int getNumeroDoQuarto() {
        return numeroDoQuarto;
    }
    // Método toString para exibir informações do quarto
    @Override
    public String toString() {
        String status = statusDeOcupacao ? "Ocupado" : "Disponível";
        String clienteInfo = (cliente != null) ? cliente.getNomeDoCliente() : "Nenhum";
    
        return "Quarto " + numeroDoQuarto + " - " + status + " - Cliente: " + clienteInfo;
    }

}
