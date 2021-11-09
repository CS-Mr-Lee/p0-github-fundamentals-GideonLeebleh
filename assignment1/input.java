/**
 *   Author name: Gideon Lee
 *   Date: Nov 8 2021
 *   Name of program: Input
 *   Program puropose: This program will take the date of birth of the user and the current day it is and calculate how many days the user has been alive and 
 *                     how many total hours the user has slept total assuming each month is exactly 30 days, there are 365 days every year, and the user gets 8 hours of 
 *                     sleep every night.
 */
package com.company;

import java.util.Scanner;

public class Input {

    public static void main(String[] args) {

            //Setup

            Scanner in = new Scanner(System.in);

            //input val
            int year;
            int month;
            int day;
            int year2;
            int month2;
            int day2;
            boolean bool = true;

            //calc var
            int yAlive;
            int dAlive = 0;
            int hours;

            //Input

            System.out.println("Enter your birthdate: ");

            System.out.print("Year: ");
            year = in.nextInt();

            System.out.print("Month: ");
            month = in.nextInt();

            System.out.print("Day: ");
            day = in.nextInt();

            System.out.println("Enter today's date: ");

            System.out.print("Year: ");
            year2 = in.nextInt();

            System.out.print("Month: ");
            month2 = in.nextInt();

            System.out.print("Day: ");
            day2 = in.nextInt();


            //Calculations

            //years
            yAlive = year2 - year;
            dAlive = dAlive + (yAlive * 365);

            //months
            if (month2 < month)
            {
                yAlive = yAlive - 1;
                dAlive = dAlive - 365;
                dAlive = dAlive + (12 - (month - month2)) * 30;
                System.out.println("hi");
            }
            else if (month2 >= month)
            {
                dAlive = dAlive + (month2 - month) * 30;
                System.out.println("bleh");
            }
        

            //days
            if (day2 < day)
            {
                dAlive = dAlive - 30;
                dAlive = dAlive + (30 - day) + day2;
            }
            else if (day2 >= day)
            {
                dAlive = dAlive + (day2 - day);
            }

            //hours
            hours = (dAlive - 1) * 8;


            //Output

            System.out.println("You have been alive for " + dAlive + " days.");
            System.out.println("You have slept " + hours + " hours.");

    }
}
