package org.example.model;

import org.example.model.enums.PaintColor;

public class Carpet {

    private PaintColor color;
    private int width;
    private int height;

    public Carpet( int width, int height, PaintColor color) {
        this.color = color;
        this.width = width;
        this.height = height;
    }

    public void lying(){
        System.out.println("Carpet is lying on Bedroom floor.");
    }

    public PaintColor getColor() {
        return color;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Carpet{" +
                "color=" + color +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
