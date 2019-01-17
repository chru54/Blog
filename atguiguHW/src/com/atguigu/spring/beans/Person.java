package com.atguigu.spring.beans;

public class Person {
    private String name;
    private int age;
    private Car car;

    public Person(String name,int age,Car car){
        this.name=name;
        this.age=age;
        this.car=car;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Car getCar() {
        return car;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
    public String toString(){
        return "Person[name="+name+",age="+age+",Car="+car+"]";
    }
}
