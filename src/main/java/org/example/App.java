/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Alexander Williams
 */

package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner Stringscan = new Scanner(System.in);
        Scanner Doublescan = new Scanner(System.in);

        System.out.println("Press C to convert from Fahrenheit to Celsius.");
        System.out.println("Press F to convert from Celsius to Fahrenheit.");
        System.out.print("Your choice: ");

        String choice = Stringscan.nextLine();

        if(choice.equals("C") || choice.equals("c"))
        {
            System.out.print("Please enter the temperature in Fahrenheit: ");
            double Fahrenheit = Doublescan.nextDouble();

            double Celsius_conversion = ((Fahrenheit - 32) * 5) / 9;

            System.out.println("The temperature in Celsius is " + String.format("%.1f", Celsius_conversion));
        }else if(choice.equals("F") || choice.equals("f"))
        {
            System.out.println("Please enter the temperature in Celsius: ");
            double Celsius = Doublescan.nextDouble();

            double Fahrenheit_conversion = ((Celsius * 9) / 5) + 32;

            System.out.print("The temperature in Fahrenheit is " + String.format("%.1f", Fahrenheit_conversion));
        }else
        {
            System.out.println("Invalid input.");
            System.exit(0);
        }
    }
}
