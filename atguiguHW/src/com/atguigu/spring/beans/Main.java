package com.atguigu.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        //HelloWorld helloWorld=new HelloWorld();
        //helloWorld.setName("atguigu");//以上交给Spring完成
        //1.创建Spring的IOC容器对象
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        //2.从IOC容器中获取Bean实例
        HelloWorld helloWorld=(HelloWorld) ctx.getBean("helloWorld");
        //3.调用hello方法
        helloWorld.hello();

        Car car=ctx.getBean(Car.class);
        System.out.println(car);

        Person person =(Person)ctx.getBean("person2");
        System.out.println(person);
    }
}
