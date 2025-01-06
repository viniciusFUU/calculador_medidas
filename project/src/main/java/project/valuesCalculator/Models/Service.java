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
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_service")
    private int idService;

    @ManyToOne
    @JoinColumn(name = "id_client")
    private Client idClient;

    @Column(name = "service_description")
    private String serviceDescription;

    @Column(name = "service_measure_side")
    private double serviceMeasureSide;

    @Column(name = "service_measure_heigth")
    private double serviceMeasureHeigth;

    @Column(name = "service_measure_base")
    private double serviceMeasureBase;

    @Column(name = "meter_value")
    private double meterValue;

    @Column(name = "service_value")
    private double serviceValue;
}
