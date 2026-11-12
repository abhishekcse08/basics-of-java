package com.magnus.basics.abstraction;

abstract class Vehicle {

    abstract void start();

    public void stop(){
        System.out.println("Stopping Vehicle");
    }
}
