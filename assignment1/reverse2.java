package com.company;
import java.util.Scanner;

public class reverse2 {

    public static void main(String[] args) {

        //Setup

            Scanner in = new Scanner(System.in);
            int[] array = new int[14];

        //Input / Calculations

        System.out.println("Please input 14 numbers:");

            for (int i = 0; i <= 13; i++)
            {
                array[i] = in.nextInt();
            }


        //Output

            for (int i = 13; i >= 0; i--)
            {
                System.out.print(array[i] + " ");
            }
    }
}
