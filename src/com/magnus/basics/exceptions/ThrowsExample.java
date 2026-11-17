package com.magnus.basics.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsExample {

    public static void main(String[] args) {


        try {
            checkAge(51);
            openFile();
            findLength(null);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        catch (NullPointerException e){
            System.out.println("Passed object is null");
        }
        catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Not to proceed with voting");
        }
        System.out.println(" Program Completed");
    }

    public static void checkAge(int age){
        if (age < 10) {
            throw new ArithmeticException("Not eligible for voting");
        }
        else {
            System.out.println("Child is not Minor");
        }
    }

    public static void openFile() throws FileNotFoundException {
        FileReader fr = new FileReader("sampleTest.txt");
        System.out.println("File got");
    }

    public static void findLength(String data) throws NullPointerException{

        System.out.println(data.length());
    }

}
