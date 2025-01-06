package project.valuesCalculator.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import project.valuesCalculator.DTO.ClientDTO;
import project.valuesCalculator.Models.Client;
import project.valuesCalculator.Repository.ClientRepository;

@Service
public class ClientService {
    private final ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository){
        this.clientRepository = clientRepository;
    }

    public String createClient(ClientDTO clientDTO){
        Client client = new Client();
        client.setClientName(clientDTO.getClientName());
        client.setClientNumber(clientDTO.getClientNumber());
        client.setClient_state(clientDTO.getClient_state());
        client.setClientCity(clientDTO.getClientCity());
        client.setClientNeighborhood(clientDTO.getClientNeighborhood());
        client.setClientStreet(clientDTO.getClientStreet());
        client.setClientHouseNumber(clientDTO.getClientHouseNumber());

        clientRepository.save(client);

        return "Cliente "+client.getClientName()+" criado com sucesso";
    }

    public List<Client> getAllClient(){
        return clientRepository.findAll();
    }

    public Client getClientByName(String clientName){
        return clientRepository.findByClientName(clientName);
    }

    public String updateClientData(String data, String clientName, String newValue){
        Client client = clientRepository.findByClientName(clientName);
        String oldValue = "";

        if(client != null){
            try {
                switch (data) {
                    case "nome":
                        oldValue = client.getClientName();
                        client.setClientName(newValue);
                        break;
                    
                    case "numero":
                        oldValue = client.getClientNumber();
                        client.setClientNumber(newValue);
                        break;

                    case "estado":
                        oldValue = client.getClient_state();
                        client.setClient_state(newValue);
                        break;

                    case "city":
                        oldValue = client.getClientCity();
                        client.setClientCity(newValue);

                    case "bairro":
                        oldValue = client.getClientNeighborhood();
                        client.setClientNeighborhood(newValue);

                    case "numero da casa":
                        oldValue= String.valueOf(client.getClientHouseNumber());
                        Integer numero = Integer.parseInt(newValue); 
                        client.setClientHouseNumber(numero);
                    default:
                    break;
                }
                
                clientRepository.save(client);
                return data+" foi alterado de "+oldValue+" para "+newValue;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return "Não foi encontrado nenhum cliente com o nome "+clientName;
    }

    public String deleteClientByName(String clientName){
        Client client = clientRepository.findByClientName(clientName);
        clientRepository.delete(client);

        return client.getClientName()+" foi excluído da lista";
    }
}
