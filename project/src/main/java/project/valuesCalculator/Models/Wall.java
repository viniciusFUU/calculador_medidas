package project.valuesCalculator.Models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Wall {
    private double serviceMeasureSide;
    private double serviceMeasureHeigth;
    private double serviceMeasureBase;
    private double meterValue;

    public Wall(double serviceMeasureSide, double serviceMeasureHeigth, double serviceMeasureBase){
        this.serviceMeasureSide = serviceMeasureSide;
        this.serviceMeasureHeigth = serviceMeasureHeigth;
        this.serviceMeasureBase = serviceMeasureBase;
    }

    public double calcService(Wall wall, double meterValue){
        double side = wall.getServiceMeasureSide();
        double heigth = wall.getServiceMeasureHeigth();
        double width = wall.getServiceMeasureBase();
        
        return 2*(side*heigth)+2*(width*heigth);
    }
}