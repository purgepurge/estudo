package com.example;

import java.util.ArrayList;

public class Hotel {
    private String nomeDoHotel;
    private int quantidadeTotalDeQuartos = 100;
    private int quantidadeDeQuartosOcupados = 0;
    private int quantidadeDeQuartosDisponiveis = 100;
    private ArrayList<Cliente> listaDeClientes = new ArrayList<Cliente>(); // Lista de clientes que estão no hotel
    private ArrayList<QuartoDeHotel> listaDeQuartos = new ArrayList< QuartoDeHotel >(); // Lista de quartos do hotel

    public Hotel (String nomeDoHotel) {
        this.nomeDoHotel = nomeDoHotel;
        // Cria a lista de quartos do hotel
        for (int i = 1; i <= quantidadeTotalDeQuartos; i++) {
            listaDeQuartos.add(new QuartoDeHotel(i));
        }
    }

    public Boolean adicionarCliente(Cliente cliente) {
        //Verifica se a quartos disponiveis 
        for (QuartoDeHotel quarto : listaDeQuartos) {
            if (quarto.getStatusDeOcupacao() == false) {
                quarto.ocuparQuarto(cliente);
                listaDeClientes.add(0, cliente);//adiciona o cliente no inicio da lista de clientes
                quantidadeDeQuartosOcupados++;//incrementa a quantidade de quartos ocupados
                quantidadeDeQuartosDisponiveis--;//decrementa a quantidade de quartos disponiveis
                System.out.println("Cliente adicionado com sucesso");
                return true;
            }
        }
        System.out.println("Não há quartos disponíveis");
        return false;
    }

    public Boolean removerCliente() {
        if (listaDeClientes.isEmpty()) {
            //Se a lista de clientes estiver vazia, não há clientes para remover
            System.out.println("Não há clientes para remover");
            return false;
        }
        Cliente clienteParaRemover = listaDeClientes.get(listaDeClientes.size() - 1); // Pega o último cliente da lista

        for (QuartoDeHotel quarto : listaDeQuartos){
            //Verifica se o cliente está em algum quarto e desocupa o quarto
            if (quarto.getCliente() != null && quarto.getCliente().equals(clienteParaRemover)) { 
                quarto.desocuparQuarto();
                break;
            }
        }
        //Remove o cliente da lista de clientes
        listaDeClientes.remove(clienteParaRemover);
        quantidadeDeQuartosOcupados--;//decrementa a quantidade de quartos ocupados
        quantidadeDeQuartosDisponiveis++;//incrementa a quantidade de quartos disponiveis
        System.out.println("Cliente removido com sucesso");
        return true;
    }
    
    public void mostrarStatusDoHotel() {
        System.out.println("Nome do hotel: " + nomeDoHotel);
        System.out.println("Quantidade total de quartos: " + quantidadeTotalDeQuartos);
        System.out.println("Quantidade de quartos ocupados: " + quantidadeDeQuartosOcupados);
        System.out.println("Quantidade de quartos disponíveis: " + quantidadeDeQuartosDisponiveis);
    }
    
    public void listarQuartos() {
        for (QuartoDeHotel quarto : listaDeQuartos) {
            System.out.println(quarto);
        }
    }

}
