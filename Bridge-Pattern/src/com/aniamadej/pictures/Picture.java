package com.aniamadej.pictures;

import com.aniamadej.shapes.Shape;

public abstract class Picture {
    private String color;
    private Shape shape;

    public Picture(String color, Shape shape) {
        this.color = color;
        this.shape = shape;
    }

    public void draw(){
        System.out.println("Taking " + color + " crayon and " + shape.draw());
        System.out.println();
    }
}
