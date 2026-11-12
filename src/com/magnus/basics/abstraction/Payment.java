package com.magnus.basics.abstraction;

public interface Payment {

    void pay();

    static void display(){
        System.out.println("Initiating Payment ....");
    }

    default void stopPayment(){
        System.out.println("Stopping payment .....");
    }

}
