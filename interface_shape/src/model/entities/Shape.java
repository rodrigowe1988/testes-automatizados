package model.entities;

import model.enums.Color;

public interface Shape {

    default double area() {
        return 0;
    };

}
