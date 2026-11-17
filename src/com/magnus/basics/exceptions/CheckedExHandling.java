package com.magnus.basics.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExHandling {
    public static void main(String[] args)  {

        try {
            FileReader fr = new FileReader("sampleTest1.txt");
            System.out.println("File got");
        }
        catch (FileNotFoundException e){
            System.out.println(" Getting exception");
        }
    }
}

// Null Pointer Exception
// Airthematic exception
//Arra