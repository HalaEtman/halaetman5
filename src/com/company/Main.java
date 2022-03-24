package com.company;


import java.io.IOException;

public class Main {


    public static void main(String[] args) throws IOException {
//task 1
        rectangleArea recA = new rectangleArea();

        recA.getData();
        recA.calcField();
        recA.dispfield();

//task 2

        car carinfo = new car("TESLA", "BMW", 2022, 200000, "brown", 80);

        System.out.println("\n\n" + carinfo.toString());

        carinfo.sell(20);

        System.out.println(carinfo.getCarcolor());

        int year = carinfo.getYear();

        carinfo.setCarcolor("white");

        System.out.println(carinfo.toString());

    }
}