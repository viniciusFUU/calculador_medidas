package project.geometry;

import java.util.ArrayList;
import java.util.List;

public class ClienteController {
    List<Cliente> listaDeClientes = new ArrayList<>();

    public void addCliente(String nome, String cidade, String bairro, String rua, int numero){
        Cliente cliente = new Cliente(nome, cidade, bairro, rua, numero);
    
        listaDeClientes.add(cliente);
    }

    public Cliente buscaCliente(String nome){
        Cliente clienteBuscado = null;
        for(Cliente cliente : listaDeClientes){
            if (cliente.getNome().equals(nome)){
                clienteBuscado = cliente;
            }
        }

        return clienteBuscado;
    }
}
