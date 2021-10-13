package com.company;
import  java.util.Scanner;

public class slopeOrLength {

    //length method
    public static double length(int x1, int x2, int y1, int y2)
    {
        double num = Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2);
        num = Math.sqrt(num);

        return(num);
    }

    //slope method
    public static double slope(int x1, int x2, int y1, int y2)
    {
        double num = (y2 - y1) / (x2 - x1);

        return(num);
    }


    public static void main(String[] args) {

        //setup

            Scanner in = new Scanner(System.in);
            String input;
            int x1;
            int x2;
            int y1;
            int y2;


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
