package org.example;

public class Product {
    private double price;
    private int value;

    public Product(double price, int value) {
        this.price = price;
        this.value = value;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public double getPrice() {
        return this.price;
    }

    public int getValue() {
        return this.value;
    }

    public double total(Double price, int value) {
        price = this.price;
        value = this.value;
        return price * (double)value;
    }
}
