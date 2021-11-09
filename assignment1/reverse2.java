/**
 *   Author name: Gideon Lee
 *   Date: Nov 9 2021
 *   Program name: Reverse2
 *   Program purpose: This is a program that initialized an array of size 14 with user input and then reverses the order of the values in the array using 1 array.
*/
package com.company;
import java.util.Scanner;

public class Reverse2 {

    public static void main(String[] args) {

        //Setup

        Scanner in = new Scanner(System.in);
        int[] array = new int[14];

        //Input / Calculations

        System.out.println("Please input 14 numbers:");

        for (int i = 13; i >= 0; i--)
        {
            array[i] = in.nextInt();
        }


        //Output

        for (int i = 0; i <= 13; i++)
        {
            System.out.print(array[i] + " ");
        }
    }
}
