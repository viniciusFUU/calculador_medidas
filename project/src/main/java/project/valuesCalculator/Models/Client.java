package project.valuesCalculator.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "client")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_client")
    private int idClient;

    @Column(name = "client_name")
    private String clientName;

    @Column(name = "client_number")
    private String clientNumber;

    @Column(name = "client_state")
    private String client_state;

    @Column(name = "client_city")
    private String clientCity;

    @Column(name = "client_neighborhood")
    private String clientNeighborhood;

    @Column(name = "client_street")
    private String clientStreet;

    @Column(name = "client_house_number")
    private int clientHouseNumber;
}
