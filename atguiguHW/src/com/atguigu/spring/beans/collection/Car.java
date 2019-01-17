package com.atguigu.spring.beans.collection;

public class Car {
    private String brand;
    private String corp;
    private int price;
    private int maxSpeed;
    public Car(String brand, String corp, int price){
        super();
        this.brand=brand;
        this.corp=corp;
        this.price=price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car[brand="+brand+",corp="+corp+",price="+price+",maxSpeed="+maxSpeed+"]";
    }
}
