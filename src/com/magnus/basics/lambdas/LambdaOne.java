package com.magnus.basics.lambdas;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;

public class LambdaOne {

    public static void main(String[] args) {
        // utilize function interface
        Calculator add = (a,b)->a+b;
        Calculator multiply = (a,b)->a*b;

        System.out.println(add.func(1,2));
        System.out.println(multiply.func(2,3));

        int res = apply(1, 2, (x, y) -> y - x);
        System.out.println(res);

        Comparator<String> s1 = (a,b)->a.length()-b.length();
        BinaryOperator<String> s2 = (a,b)->a.length()>b.length()?a:b;




    }

    static int apply(int a, int b, Calculator c){

        return c.func(a,b);
    }

    static void methodForException() {
        List<String> ls = Arrays.asList("NEW","OLD","FLOWER","APPLE","ANT");
        for(String s: ls){
            try {
                if (s.startsWith("A")) {
                    Thread.sleep(9000);
                }
            }
            catch (InterruptedException e){
              throw   new RuntimeException(e);
            }
        }
        ls.forEach(f->{
            try{
                Thread.sleep(800);
            }
            catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        });


    }
}


@FunctionalInterface
interface Calculator{

    public int func(int a , int b);
}