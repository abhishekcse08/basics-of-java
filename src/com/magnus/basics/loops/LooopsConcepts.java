package com.magnus.basics.loops;

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

        int[] num = {10,20,30,40,50,60,70,80,90};
        for(int n:num){
            System.out.print(n+",");
        }
    }
}
