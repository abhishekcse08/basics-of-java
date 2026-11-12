package com.magnus.basics.polymorphism;

public class DeptHead extends Manger{

    @Override
    public void typeOfEmployee(){
        System.out.println("This Dept Head ");
    }


    public void insideDeptHead(){
        System.out.println("This Manager class");
    }
}
