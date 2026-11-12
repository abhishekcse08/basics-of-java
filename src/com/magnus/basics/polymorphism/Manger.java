package com.magnus.basics.polymorphism;

public class Manger extends Employee {

    @Override
    public void typeOfEmployee() {
        System.out.println("This is Manager");
    }

    public void insideManager(){
        System.out.println("This Manager class");
    }
}
