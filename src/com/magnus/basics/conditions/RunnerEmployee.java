package com.magnus.basics.conditions;

import com.magnus.basics.utils.EmployeeUtils;

public class RunnerEmployee {

    public static void main(String[] args) {

        Employee e = new Employee(1001,"Kavitha","Hyderabad",1000);
       // EmployeeUtils.calculateSalaryUsingIfElse(e);
      //  EmployeeUtils.calculateSalaryUsingTernaryOperator(e);

        EmployeeUtils.calculateSalUsingSwitchStatement(e);
    }
}
