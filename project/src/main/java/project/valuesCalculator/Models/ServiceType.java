package project.valuesCalculator.Models;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum ServiceType {
    FLOOR,
    WALL;

    @JsonCreator
    public static ServiceType fromString(String value) {
        return ServiceType.valueOf(value.toUpperCase());
    }
}
