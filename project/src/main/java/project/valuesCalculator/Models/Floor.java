package project.valuesCalculator.Models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Floor {
    private double front;
    private double side;

    public Floor(double front, double side){
        this.front = front;
        this.side = side;
    }

    public double calcService(Floor floor, double serviceValue){
        return (floor.getFront()*floor.getSide())*serviceValue;
    }
}
