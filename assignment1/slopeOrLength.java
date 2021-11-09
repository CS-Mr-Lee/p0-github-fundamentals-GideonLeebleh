/**
 *   Author name: Gideon Lee
 *   Date: Nov 9 2021
 *   Program name: SlopeOrLength
 *   Program purpose: This is a program that contains 2 methods, one that takes the coordinates of a line segement and returns the length of the line to the user and
 *                    a method that takes the coordinates of a line segment and returns the slope.
*/
package com.company;
import  java.util.Scanner;

public class SlopeOrLength {

    //length method
    public static double length(double x1, double x2, double y1, double y2)
    {
        double num = Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2);
        num = Math.sqrt(num);

        return(num);
    }

    //slope method
    public static double slope(double x1, double x2, double y1, double y2)
    {
        double num = (y2 - y1) / (x2 - x1);

        return(num);
    }


    public static void main(String[] args) {

        //setup

        Scanner in = new Scanner(System.in);
        String input;
        double x1;
        double x2;
        double y1;
        double y2;


        //input

        System.out.print("length or slope : ");
        input = in.nextLine();

        if(input.equals("length"))
        {
            System.out.println("Input a x1, y1, x2, and y2 coordinate: ");
            System.out.print("x1 = ");
            x1 = in.nextInt();
            System.out.print("x2 = ");
            x2 = in.nextInt();
            System.out.print("y1 = ");
            y1 = in.nextInt();
            System.out.print("y2 = ");
            y2 = in.nextInt();

            double num = length(x1,x2,y1,y2);

            //output
            System.out.println("The length is: " + num);
        }
        else if(input.equals("slope"))
        {
            System.out.println("Input a x1, y1, x2, and y2 coordinate: ");
            System.out.print("x1 = ");
            x1 = in.nextInt();
            System.out.print("x2 = ");
            x2 = in.nextInt();
            System.out.print("y1 = ");
            y1 = in.nextInt();
            System.out.print("y2 = ");
            y2 = in.nextInt();

            double num = slope(x1,x2,y1,y2);

            //output
            System.out.println("The slope is: " + num);
        }

    }
}
