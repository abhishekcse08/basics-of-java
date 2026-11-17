package com.magnus.basics.exceptions;

public class FirstException {

    public static void main(String[] args) {
        try {
            int c = 10 / 0;
            System.out.println("C");
        }
        catch (ArithmeticException e){
            System.out.println("Can't divide such number by 0");
        }
        System.out.println("Completed");
    }
}
//  Object -> Throwable
 //               |
  //      Error           Exception
    //                        Runtime Exception & Compile Time Exception