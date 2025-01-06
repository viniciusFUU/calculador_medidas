package project.valuesCalculator.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClientDTO {
    private int idClient;
    private String clientName;
    private String clientNumber;
    private String client_state;
    private String clientCity;
    private String clientNeighborhood;
    private String clientStreet;
    private int clientHouseNumber;
    private String data;
    private String newValue;
}
