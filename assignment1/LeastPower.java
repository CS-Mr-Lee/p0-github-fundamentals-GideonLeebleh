/**
*   Author name: Gideon Lee
*   Date: Nov 8 2021
*   Program name: LeastPower
*   Program purpose: This is a program that reads a positive integer and then finds the smallest power of two that is greater than or equal to the number that are read.
*/

package com.company;
import java.util.Scanner;

public class LeastPower {

    public static void main(String[] args) {

        //setup

        Scanner in = new Scanner(System.in);

        //variables
        int num = 0;
        double num2 = 0;
        int pow = 0;
        boolean bool = false; //Serves as a way to find if input is less than 0 or not.


        //Input

        while (!bool)
        {
            System.out.print("Input a number ");
            num = in.nextInt();

            if (num <= 0)
            {
                System.out.println("Nope, needs to be a positive integer. Try again!");
                System.out.println();
            }
            else {bool = true;}
        }


        //Calculations

        for (int i = 0; num >= num2; i++)
        {
            num2 = Math.pow(2, i);
            pow = i;
        }


        // Output

        System.out.println( num2 + " = 2^" + pow + " is the smallest power of 2 ");
    }
}
