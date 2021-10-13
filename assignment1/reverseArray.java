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
