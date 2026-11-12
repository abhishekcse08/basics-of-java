package com.magnus.basics.utils;

import com.magnus.basics.conditions.Employee;
import org.w3c.dom.ls.LSOutput;

public class EmployeeUtils {
    // if emp id contains M-
    public static void calculateSalaryUsingIfElse(Employee emp){
        if(emp.getEmpSal()>1000){
            System.out.println("salary is greater than 1000");
        }
        else if(emp.getEmpSal()>500) {
            System.out.println("salary is greater than 500");
        } else if (emp.getEmpSal()>100) {
            System.out.println("salary is greater than 100");
        }
        else {
            System.out.println("salary is less than 100");
        }
    }

    public static void calculateSalaryUsingTernaryOperator(Employee emp) {
        // if condition Match then perform tasks else execute block

       // boolean isTrue = emp.getEmpSal() > 1000 ? true : false;

        boolean isTrue = emp.getEmpSal() > 1000 ? emp.getEmpSal()>1200?true:false : false;

        System.out.println(isTrue);
    }

    public static void calculateSalUsingSwitchStatement(Employee emp){
        switch (emp.getEmpId()){
            case 1000:
                System.out.println("Salary is 1000");
                break;
            case 500:
                System.out.println("Salary is 500");
                break;
            default:
                System.out.println("I don't know salary");
        }
    }
}
