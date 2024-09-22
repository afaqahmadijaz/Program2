//********************************************************************
//
//  Author:       Afaq Ahmad
//
//  Program #:    2
//
//  File Name:    Program2.java
//
//  Course:       ITSE 2321 Object-Oriented Programming
//
//  Due Date:     September 20th
//
//  Instructor:   Prof. Fred Kumi
//
//  Chapter:      Chapter 2: Introduction to Java Applications
//
//  Description:    This program calculates property taxes based on the
////                actual value of a property and a tax rate entered by
////                the user. It displays the actual value, assessed value,
////                tax rate, and calculated property tax.
//
//********************************************************************

import java.util.Scanner;

public class Program2
{
    //***************************************************************
    //
    //  Method:       main
    //
    //  Description:  The main method of the program
    //
    //  Parameters:   String array
    //
    //  Returns:      N/A
    //
    //**************************************************************
    public static void main(String[] args)
    {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Variables for property value and tax rate
        double propertyValue;
        double taxRate;

        developerInfo(); // Call to developer information

        // Get user input for property value and tax rate
        System.out.print("Enter the actual value of the property: ");
        propertyValue = input.nextDouble();

        System.out.print("Enter the tax rate per $100 of assessed value: ");
        taxRate = input.nextDouble();

        // Calculate the assessed value (60% of actual value)
        double assessedValue = propertyValue * 0.60;

        // Calculate property tax (tax rate for each $100 of assessed value)
        double propertyTax = (assessedValue / 100) * taxRate;

        // Display the results with two decimal places
        System.out.printf("The Actual Value is: $%.2f%n", propertyValue);
        System.out.printf("The Assessed Value is: $%.2f%n", assessedValue);
        System.out.printf("The Tax Rate is: %.2f per $100 of assessed value%n", taxRate);
        System.out.printf("The Property Tax is: $%.2f%n", propertyTax);

    } // End of the main method

    //***************************************************************
    //
    //  Method:       developerInfo
    //
    //  Description:  The developer information method of the program
    //
    //  Parameters:   None
    //
    //  Returns:      N/A
    //
    //**************************************************************
    public static void developerInfo()
    {
        System.out.println("Name:     Afaq Ahmad");
        System.out.println("Course:   ITSE 2321 Object-Oriented Programming");
        System.out.println("Program:  Two");
        System.out.println("Due Date: September 20th\n");
    } // End of the developerInfo method
}