package org.example;

import java.util.Scanner;

public class Flat {
    int default_square = 50;
    int default_quanity = 2;

    private int square;
    private int quantity;

    public Flat(){
        this.default_square = default_square;
        this.default_quanity = default_quanity;
    };
    public Flat(int square){
        this.square = square;
        this.default_quanity = default_quanity;
    }
    public Flat(int square, int quantity){
        this.square = square;
        this.quantity = quantity;
    }

    public void getSquare(){
        System.out.println("Площадь квартиры: " + square);
    };
    public void setSquare(){
        this.square = square;
    }
    public void getQuantity(){
        System.out.println("Количество комнат: " + quantity);
    }
    public void setQuantity(){
        this.quantity = quantity;
    }



    /*public static void constructor_1() {
        Flat apartments_1 = new Flat(50, 2);
        System.out.println("Конструктор 1 имеет значения:" +"\n" + "Объем:" + apartments_1.square +"m2" + "\n" +"Количество комнат: " + apartments_1.quanity);
    }
    public static void constructor_2(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите площадь квартиры: ");
        int sqOut = scanner.nextInt();

        Flat apartments_2 = new Flat(sqOut, 2);
        System.out.println("Площадь: " + apartments_2.square + "m2");
        System.out.println("Количество комнат: " + apartments_2.quanity);
    }

    public static void constructor_3(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите площадь квартиры: ");
        int sqOut = scanner.nextInt();

        System.out.println("Введите Количество комнат: ");
        int quOut = scanner.nextInt();
        Flat apartments_2 = new Flat(sqOut, quOut);
        System.out.println("Площадь: " + apartments_2.square + "m2");
        System.out.println("Количество комнат: " + apartments_2.quanity);
    }*/






    /*public static void main(String[] args) {
        constructor_1();

        System.out.println("------------------");

        constructor_2();

        System.out.println("------------------");

        constructor_3();
    }*/
}