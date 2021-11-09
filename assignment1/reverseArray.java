/**
 *   Author name: Gideon Lee
 *   Date: Nov 9 2021
 *   Program name: ReverseArray
 *   Program purpose: This is a program that initialized an array of size 14 with user input and then reverses the order of the values in the array using 2 arrays.
*/
package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

    public static void main(String[] args) {

        //Setup

        Scanner in = new Scanner(System.in);
        int[] array1 = new int[14];
        int[] array2 = new int[14];

        //Input / Calculations

        System.out.println("Please input 14 numbers:");

        for (int i = 0; i <= 13; i++)
        {
            array1[i] = in.nextInt();
            array2[13-i] = array1[i];
        }


       //Output

        System.out.println(Arrays.toString(array2));


    }
}
