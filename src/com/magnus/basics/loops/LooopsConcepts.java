package com.magnus.basics.loops;

import com.magnus.basics.conditions.Employee;

import java.util.Arrays;
import java.util.List;

public class LooopsConcepts {

    public static void main(String[] args) {
        System.out.println("\n in For Loop");
        int i=0;
        for( ;i<10;i++){
            System.out.print(i+" ");
        }

        System.out.println("\n in while Loop");
        while(i>=0){

            System.out.print(i+" ");
            i--;
        }

        System.out.println("\n in do while Loop");
        do{
            System.out.print(i+" ");
            i++;
        }
        while (i<=10);

        System.out.println("\nEnhanced For Loop");

        Employee e1 = new Employee(1001,"Kavitha","Hyderabad",1000);
        Employee e2 = new Employee(1002,"Kavitha","Hyderabad",1000);

        List<Employee> empList = Arrays.asList(e1,e2);

        int[] num = {10,20,30,40,50,60,70,80,90};
        for(int n:num){
            System.out.print(n+",");
        }

        System.out.println("\nEnhanced For Loop for Employee");
        for(Employee e : empList){
            System.out.print(e.getEmpId()+" ");
        }
    }
}
