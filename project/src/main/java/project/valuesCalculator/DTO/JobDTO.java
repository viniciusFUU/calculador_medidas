package project.valuesCalculator.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class JobDTO {
    private String clientName;
    private String serviceDescription;    
    private double serviceMeasureSide;    
    private double serviceMeasureHeigth;    
    private double serviceMeasureBase;    
    private double meterValue;    
}
