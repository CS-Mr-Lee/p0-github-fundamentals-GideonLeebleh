
/**
 *   Author name: Gideon Lee
 *   Date: Nov 9 2021
 *   Program name: TwoDArray
 *   Program purpose: This is a program that uses a 2D array to represent the marks of a set of tests for a class of students and follow the instructions on Brightspace.
*/
package com.company;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class TwoDArray {

    public static void main(String[] args) {

        //Setup

        Scanner in = new Scanner(System.in);
        int numOfT;
        int numOfS;
        double max = 0; //The highest grade value.
        int smartyPants = 0; //Which student holds the max grade value.
        double classAvg = 0;


        //Input

        System.out.print("How many students are there: ");
        numOfS = in.nextInt();

        System.out.print("How many tests are there: ");
        numOfT = in.nextInt();

        System.out.println(); //space

        System.out.println("Please enter the test marks for each student");
        double [][] marks = new double[numOfS] [numOfT];
        for (int i = 0; i <= numOfS - 1; i++)
        {
            for (int j = 0; j <= numOfT - 1; j++)
            {
                System.out.print("Student " + (i + 1) + "'s test number " + (j + 1) + " mark is: ");
                marks[i][j] = in.nextInt();
            }
            System.out.println(); //space
        }


        //Calculations

        //finds the average of each student
        double [] avg = new double[numOfS];

        for (int i = 0; i <= numOfS - 1; i++)
        {

            for (int j = 0; j <= numOfT - 1; j++)
            {
                avg[i] = avg[i] + marks[i][j];
            }
            avg[i] = avg[i] / numOfT;
            System.out.println("Student " + (i+1) + "'s average is: " + avg[i]);

            System.out.println(); //space
        }

        //Finds the student with the highest grade value.
        for (int i = 0; i <= numOfS - 1; i++)
        {
            if (max < avg[i])
            {
                max = avg[i];
                smartyPants = i;
            }
        }

        //finds the class average
        for (int i = 0; i <= numOfS - 1; i++)
        {
            classAvg = classAvg + avg[i];
        }
        classAvg = classAvg / numOfS;

        //finds which students are above the class average
        double [] smartKids = new double[numOfS];
        for (int i = 0; i <= numOfS - 1; i++)
        {
            if (avg[i] >= classAvg)
            {
                smartKids[i] = i + 1;
            }
        }

        System.out.println("The highest average is " + max + ", and it belongs to student " + (smartyPants + 1));
        System.out.println("The class average is " + classAvg);
        for (int i = 0; i <= numOfS - 1; i++)
            {
                if (smartKids[i] != 0)
                {
                    System.out.println("Student " + smartKids[i] + " is above the class average");
                }
            }

    }
}
