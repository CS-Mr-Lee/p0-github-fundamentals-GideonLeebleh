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
