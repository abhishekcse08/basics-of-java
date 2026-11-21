package com.magnus.basics.collections;

import java.util.LinkedList;
import java.util.List;

public class LinkListExample {

    public static void main(String[] args) {
        LinkedList<Employee> employeeList = new LinkedList<>();
        Employee e =  new Employee(01,"Alice",5000,"NWR","803");
        Employee e1 =  new Employee(02,"BOB",500,"NW","098");
        Employee e2 =  new Employee(03,"Charlie",100,"Brekley","567");

        employeeList.add(e);
        employeeList.add(e1);
        employeeList.addFirst(e2);
        employeeList.addLast(e);

        System.out.println(employeeList);
    }
}
// LinkList-: Explore all the methods
// 2-: Try to add 10 numbers in List and retrieve only even number
// 3-: When we use LinkList
