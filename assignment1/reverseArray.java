/**
 *   Author name: Gideon Lee
 *   Date: Nov 9 2021
 *   Program name: Pythagorean
 *   Program purpose: This is a program that first prompts the user for a positive integer and then finds and prints
 *                    all Pythagorean triplets whose largest member is less than or equal to that integer.
*/
package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class reverseArray {

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
