package com.magnus.basics.lambdas;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class InbuiltFunctionss {

    public static void main(String[] args) {

        Predicate<String> isLong = s1->s1.length()>5;
        System.out.println(isLong.test("This is My data"));

        Function<String,String> length = s2->s2.;
        System.out.println(length.apply("TRAGET"));

    }
}




// Predicate  boolean test(t)

// Function<T,R>
