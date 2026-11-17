package com.magnus.basics.exceptions;

public class UncheckedException {

    public static void main(String[] args) {

        try {
            String name = null;
            System.out.println(name.length());
        }
        catch (NullPointerException e){
            System.out.println("Object is NULL");
        }

        finally {
            System.out.println("In finally block");
            show();
        }
    }


    public static void show(){
        System.out.println("This method should be executed in finally block");
    }
}
