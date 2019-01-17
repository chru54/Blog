package com.atguigu.spring.beans.collection;

import com.atguigu.spring.beans.Car;
import java.util.List;

public class Person {
    private String name;
    private int age;
    private List<Car> cars;

    public Person(String name, int age, List<Car> cars){
        this.name=name;
        this.age=age;
        this.cars=cars;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", cars=" + cars +
                '}';
    }

}
