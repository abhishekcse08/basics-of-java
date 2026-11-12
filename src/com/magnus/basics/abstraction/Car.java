package com.magnus.basics.abstraction;

public class Car extends Vehicle{

    @Override
    void start() {
        System.out.println("Car start with key");
    }

    public void  myCar(){
        System.out.println("Car details");
    }
}
