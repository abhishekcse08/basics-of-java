package com.magnus.basics.serializationNdeserialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DataDeserilze {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("employee.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Employee e = (Employee) ois.readObject();
        System.out.println("Reading Employee data from File");
        System.out.println("Employee Name :" + e.name);
        System.out.println(e.id);
        System.out.println(e.salary);

        fis.close();
        ois.close();
    }
}
