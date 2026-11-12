package com.magnus.basics.abstraction;

public class CreditCarPayment implements Payment {

    @Override
    public void pay() {
        System.out.println("Credit Card Payment");
    }

    @Override
    public void stopPayment() {
        System.out.println("Stopping credit card payment ...");
    }
}
