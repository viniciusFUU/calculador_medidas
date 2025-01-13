package project.valuesCalculator.Models;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
@Component

@Getter
@Setter
public class Wall {
    private double serviceMeasureSide;
    private double serviceMeasureHeigth;
    private double serviceMeasureBase;
    private double meterValue;

    public double calcService(Wall wall, double meterValue){
        double side = wall.getServiceMeasureSide();
        double heigth = wall.getServiceMeasureHeigth();
        double width = wall.getServiceMeasureBase();
        
        return (2*(side*heigth)+2*(width*heigth))*meterValue;
    }
}