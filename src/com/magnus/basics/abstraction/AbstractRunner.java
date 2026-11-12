package com.magnus.basics.abstraction;

public class AbstractRunner {

    public static void main(String[] args) {

/*        Vehicle v = new Car();
        v.start();



        Vehicle v1 = new Truck();
        v1.start();
*/
        Payment p = new CreditCarPayment();
        Payment p1= new UPIPayment();

        p.pay();
        p1.pay();

        Payment.display();
        p.stopPayment();
        p1.stopPayment();


    }
}
