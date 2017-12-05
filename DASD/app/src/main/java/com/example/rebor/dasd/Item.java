package com.example.rebor.dasd;

/**
 * Created by ReBor on 2017-12-04.
 */

public class Item {
    int num;
    String name;
    int price;
    String dscrt;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDscrt() {
        return dscrt;
    }

    public void setDscrt(String dscrt) {
        this.dscrt = dscrt;
    }

    public Item(int num, String name, int price, String dscrt) {
        this.num = num;
        this.name = name;
        this.price = price;
        this.dscrt = dscrt;
    }
}
