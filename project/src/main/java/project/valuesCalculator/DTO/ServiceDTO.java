package project.valuesCalculator.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ServiceDTO {
    private String clientName;
    private double meterValue; 
    private String serviceType; 
    private JobDTO jobDTO;
}
