package com.magnus.basics.collections;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {

        List<Employee> employeeList =  new ArrayList<>();

        Employee e =  new Employee(01,"Alice",5000,"NWR","803");
        Employee e1 =  new Employee(02,"BOB",500,"NW","098");
        Employee e2 =  new Employee(03,"Charlie",100,"Brekley","567");

        employeeList.add(e);
        employeeList.add(e1);
        employeeList.add(e2);

        System.out.println(employeeList.size());


     for(Employee emp : employeeList){
         System.out.println(emp.name);
     }

    }
}

// Dynamic Array
// Fast Accessing of Element
//Allows duplicate Element and Null Values

//Assignment-
// 1-: Try to explore all the methods from Arraylist
// 2-: Try to add 10 numbers in List and retrieve only even number
// 3-: When We use ArrayList


