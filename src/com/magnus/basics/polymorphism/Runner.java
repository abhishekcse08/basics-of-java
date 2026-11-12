package com.magnus.basics.polymorphism;




public class Runner {

    public static void main(String[] args) {

        Employee e ;
        e = new Manger();
        e.typeOfEmployee();


        Manger m;
        m = new DeptHead();
        m.typeOfEmployee();

    }
}


