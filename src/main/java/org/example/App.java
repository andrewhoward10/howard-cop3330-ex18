/*
 *  UCF COP3330 Fall 2021 Assignment 18 Solution
 *  Copyright 2021 Andrew Howard
 */
package org.example;

import java.util.Locale;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Double userFa, UserMath,userCe, userMath2;
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Enter C to convert to celsius or F to convert to Fahrenheit: ");
        String result = keyboardInput.nextLine();
        result= result.toUpperCase();

        System.out.println("Your choice: " + result);




        if (result.equals("C")) {
            System.out.print("Please enter the temperature in Fahrenheit: ");
             userFa = keyboardInput.nextDouble();
            UserMath = (userFa - 32) * 5 / 9;

            System.out.print("The temperature in Celsius is: " + UserMath);
        }
        else if(result.equals("F")){
            System.out.print("Please enter the temperature in Celsious: ");
            userCe = keyboardInput.nextDouble();
            userMath2 = (userCe * 9 / 5) +32;

            System.out.print("The temperature in Celsius is: " + userMath2);

        }


    }
}
