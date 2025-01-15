package project.valuesCalculator.Models;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Component
public class Floor {
    private double front;
    private double side;

    public double calcService(double serviceValue){
        return (front*side)*serviceValue;
    }
}
