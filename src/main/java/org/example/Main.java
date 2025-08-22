package org.example;

import org.example.model.*;
import org.example.model.enums.LampType;
import org.example.model.enums.PaintColor;

public class Main {
    public static void main(String[] args) {
        Lamp lamp = new Lamp(LampType.NEON,true,100);
        lamp.turnOn();

        Ceiling ceiling = new Ceiling(2, PaintColor.RED);
        ceiling.create();

        Bed bed = new Bed("double",2,2,2,2);
        System.out.println(bed.toString());

        Wall northWall = new Wall("North");
        Wall eastWall = new Wall("East");
        Wall westWall = new Wall("West");
        Wall southWall = new Wall("South");

        Wall[] walls = {northWall,eastWall,westWall,southWall};

        Bedroom bedroom = new Bedroom(northWall,eastWall,southWall,westWall,ceiling,lamp,new Carpet(100,200,PaintColor.WHITE),bed,new Wardrobe(1,2,12),"bedroom1");
        System.out.println(bedroom.toString());
        bedroom.createBedroom();




    }
}