package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        inputAllBaseTypes();
    }

    public static void inputAllBaseTypes()
    {
        Scanner value = new Scanner(System.in);
        System.out.println("Enter an Integer value: ");
        while (!value.hasNextInt()){
            value.nextLine();
            System.out.println("Not an Integer");
        }
        System.out.println("Integer: " + value.nextInt());
    }
}
