package project.valuesCalculator.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.valuesCalculator.DTO.ClientDTO;
import project.valuesCalculator.Models.Client;
import project.valuesCalculator.Service.ClientService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@RequestMapping("/calc/client")
public class ClientController {
    private final ClientService clientService;

    public ClientController (ClientService clientService){
        this.clientService = clientService;
    }

    @PostMapping
    public String createClient(@RequestBody ClientDTO entity) {        
        return clientService.createClient(entity);
    }

    @GetMapping
    public List<Client> getAllClients() {
        return clientService.getAllClient();
    }
    
    @GetMapping("/{name}")
    public Client getMethodName(@PathVariable String name) {
        return clientService.getClientByName(name);
    }

    @PutMapping
    public String updateClientsData(@RequestBody ClientDTO clientDTO) {        
        return clientService.updateClientData(clientDTO.getData(), clientDTO.getClientName(), clientDTO.getNewValue());
    }
    
    @DeleteMapping("/{name}")
    public String deleteClient(@PathVariable String name){
        return clientService.deleteClientByName(name);
    }
}
