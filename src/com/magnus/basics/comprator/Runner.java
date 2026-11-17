package com.magnus.basics.comprator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Runner {

    public static void main(String[] args) {
        Employee e1=new Employee(12,"Akila",300);
        Employee e2=new Employee(1,"Ron",30);
        Employee e3=new Employee(2,"Dan",309);
        Employee e4=new Employee(56,"Alice",400);

        List<Employee> el = Arrays.asList(e1,e2,e3,e4);

      //  Collections.sort(el,new NameComprator());

       /* for(Employee e: el){
            System.out.println(e.getId()+"::"+e.getName()+"::"+e.getSalary());
        }*/


        List<Employee> list = el.stream()
                .sorted(Comparator.comparing(Employee::getId))
                .toList();

        for (Employee e : list){
            System.out.println(e.getId()+"::"+e.getName()+"::"+e.getSalary());
        }


    }
}
