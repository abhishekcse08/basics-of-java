package com.magnus.basics.abstraction;

public class UPIPayment implements Payment{
    @Override
    public void pay() {
        System.out.println("UPI Payment");
    }

    @Override
    public void stopPayment() {
        System.out.println("Stopping UPI payment ...");
    }
}
