package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args)
    {
      //  inputAllBaseTypes(); //R-1.1 A method that inputs a different value for each baseType and verifies said baseType
      //  gameEntry(); //R-1.2
      //  isMultiple(); //R-1.3 returns true if one long value, n is a multiple of the other, m
      //  isEven(); //R-1.4 a method that returns 'true' if value i is an even number without using  %, / or *
    }

    public static void inputAllBaseTypes()
    {
        Scanner value = new Scanner(System.in); // calls the scanner method
        System.out.print("Enter an Integer value: ");
        while (!value.hasNextInt()){
            value.nextLine();
            System.out.print("Not an Integer\nEnter an Integer value: ");
        }
        System.out.println("Integer: " + value.nextInt());

        System.out.print("Enter an floating point value: ");
        while (!value.hasNextFloat()){
            value.nextLine();
            System.out.print("Not an Floating point\nEnter a floating point value: ");
        }
        System.out.println("Float: " + value.nextFloat());
        System.out.println("\n");
    }

    public static void gameEntry(){
        int[] A = new int[6];
        int[] B = A.clone();
        A[4] = 550;
        System.out.println("The value of B[4] is: " + B[4]);
    }

    public static void isMultiple(){
        Scanner number = new Scanner(System.in);
        System.out.print("Enter a long value, n: ");
        long n = number.nextLong();
        System.out.print("Enter another long value, m: ");
        long m = number.nextLong();
        if(n%m==0 || m%n==0)
            System.out.println("True");
        else
            System.out.println("False");
    }

    public static void isEven(){

    }
}