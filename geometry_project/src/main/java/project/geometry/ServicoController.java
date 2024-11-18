package project.geometry;

import java.util.ArrayList;
import java.util.List;

public class ServicoController {
    List<Servico> listaDeServicos = new ArrayList<>();
    
    public void addServico(String nome, double valorMetroQuadrado, double comprimento, double largura, double altura){
        ClienteController cct = new ClienteController();
        Cliente cliente = cct.buscaCliente(nome);
        ParalelepipedoController ppd = new ParalelepipedoController();
        String valorTrabalho = ppd.valorDoTrabalho(valorMetroQuadrado, comprimento, largura, altura);
        
        Servico servico = new Servico(cliente, valorTrabalho);

        listaDeServicos.add(servico);
    } 
}
