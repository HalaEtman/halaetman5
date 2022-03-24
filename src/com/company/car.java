package com.company;

public class car {

    private String carmod;
    private String carbrand;
    private int year;
    private double carprice;
    private String carcolor;
    private int amount;

    public car(String carmod, String carbrand, int year, double carprice, String carcolor, int amount){

        this.carmod = carmod;
        this.carbrand = carbrand;
        this.year = year;
        this.carprice = carprice;
        this.carcolor = carcolor;
        this.amount = amount;
    }

    public String getCarmod() {
        return carmod;
    }

    public void setCarmod(String carmod) {
        this.carmod = carmod;
    }

    public String getCarbrand() {
        return carbrand;
    }

    public void setCarbrand(String carbrand) {
        this.carbrand = carbrand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getCarprice() {
        return carprice;
    }

    public void setCarprice(double carprice) {
        this.carprice = carprice;
    }

    public String getCarcolor() {
        return carcolor;
    }

    public void setCarcolor(String carcolor) {
        this.carcolor = carcolor;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void delivery(int n){
        amount -= n;
    }

    public void sell(int n){
        amount -= n;
    }

    @Override
    public String toString() {
        return "car{" +
                "  carmodel='" + carmod + '\'' +
                ", carbrand='" + carbrand + '\'' +
                ", year=" + year +
                ", carprice=" + carprice +
                ", carcolor='" + carcolor + '\'' +
                ", amount=" + amount +
                '}';
    }


}