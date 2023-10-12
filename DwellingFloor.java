package org.example;

import java.util.Scanner;

public class DwellingFloor {
    Flat[] flats;
    public DwellingFloor(int numberOfFlats) {
        flats = new Flat[numberOfFlats];
        for (int i = 0; i < numberOfFlats; i++) {
            flats[i] = new Flat();
        }
    }
    public DwellingFloor(Flat[] flats){
        this.flats = flats;
    }
    public int getTotalFlats(){
        int total = flats.length;
        System.out.println("Количество квартир на этаже: " + total);
        return flats.length;
    }
    public int getFlatsSquare(){
        int totalSquare = 0;
        for (Flat flat : flats) {
            totalSquare = totalSquare + flat.getSquare();
        }
        return totalSquare;
    }

}
