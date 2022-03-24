package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class rectangleArea {
    int length;
    int width;
    int rectArea;



    public void  getData() throws IOException {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));


        System.out.println("please enter the length of the rectangle");
        length = Integer.parseInt(buff.readLine());
        System.out.println("please enter the width of the rectangle");
        width = Integer.parseInt(buff.readLine());

    }

    public void calcField(){

        rectArea = length * width;
    }

    public void dispfield(){
        System.out.println("The area of the rectangle = "+ rectArea);
    }

    public void demo() throws IOException {
        rectangleArea rect = new rectangleArea();

        rect.getData();
        rect.calcField();
        rect.dispfield();
    }


}