package com.magnus.basics.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OldClass {

    public static void main(String[] args) {
        List<String>  ls = Arrays.asList("NEW","OLD","FLOWER","APPLE","ANT");
        List<String> newList =  new ArrayList<>();
        for(String s:ls){
            if(s.startsWith("A")){
                newList.add(s);
            }
        }
        System.out.println(newList);

        List<String> la = ls.stream()
                .filter(n -> n.startsWith("A"))
                .toList();
        System.out.println(la);


    }



}


