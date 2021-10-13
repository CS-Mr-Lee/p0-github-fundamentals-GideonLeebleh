package com.company;
import java.util.Scanner;

public class leastPower {

    public static void main(String[] args) {

        //setup

            Scanner in = new Scanner(System.in);

            //variables
            int num = 0;
            double num2 = 0;
            int pow = 0;
            boolean bool = false;


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
