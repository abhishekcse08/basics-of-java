package com.magnus.basics.exceptions;

public class UserUtils {

    public static void main(String[] args) {

        try {
            searchUser(100);
        } catch (UserNotFoundException e) {
            System.out.println( e.getCause());
           // System.out.println(e.getMessage());
        }
    }

    public static void searchUser(int id){
        if(id==100){
            throw new UserNotFoundException("User is not found in Records",new Throwable("I don't know"));
        }
        else {
            System.out.println("User Found");
        }
    }
}
