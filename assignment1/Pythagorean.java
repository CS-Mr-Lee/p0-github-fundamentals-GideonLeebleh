/**
*   Author name: Gideon Lee
*   Date: Nov 18 2021
*   Program name: Pythagorean
*   Program purpose: This is a program that first prompts the user for a positive integer and then finds and prints 
*                    all Pythagorean triplets whose largest member is less than or equal to that integer.

package com.company;
import java.util.*;

public class Pythagorean {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int num;
        int a = 3;
        int b = 4;
        int c = 5;
        int m = 2; 
        int n = 1;
        // m and n are varibales that make up a, b, and c with their sum, difference, and product.

        //input

        System.out.print("Input a number: ");
        num = sc.nextInt();


        //calculations

        //loops program to find pythagorean triples
        while (num >= c)
        {
            //loop prints out triples
            for (int i = m - 1; i >= n;)
            {
                a = (m * m) - (n * n);
                b = m * n * 2;
                c = (m * m) + (n * n);
                System.out.println();
                n++;

                if (a <= num && b <= num && c <= num)
                {
                    System.out.println("m = " + m + ", n = " + n +", a = " + a + ", b = " + b + ", c = " + c);
                }
            }
            n = 1;  //resets n
            m++;    //increases m
        }

    }
}
