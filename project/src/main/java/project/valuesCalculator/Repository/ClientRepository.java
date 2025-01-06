package project.valuesCalculator.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import project.valuesCalculator.Models.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer>{
    Client findByClientName(String clientName);
}
