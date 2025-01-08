package project.valuesCalculator.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "service")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ServiceM {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_service")
    private int idService;

    @ManyToOne
    @JoinColumn(name = "id_client")
    private Client idClient;

    @Column(name = "service_description")
    private ServiceType serviceType;

    @Column(name = "meter_value")
    private double meterValue;

    @Column(name = "service_value")
    private double serviceValue;
}
