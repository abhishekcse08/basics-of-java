package com.magnus.basics.serializationNdeserialization;

import java.io.*;

public class DataSerialize {

    // Serialization = Java Object -> Byte Stream
    // Deseralization  = Byte Stream -> Java Object

    public static void main(String[] args) throws IOException {
        Employee e = new Employee(101,"Kranthi",5000,"TEST");

        FileOutputStream fileOutputStream = new FileOutputStream("employee.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);



   objectOutputStream.writeObject(e);
   objectOutputStream.close();
   fileOutputStream.close();
        System.out.println("Serialization process completed");
    }
}
