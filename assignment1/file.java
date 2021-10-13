package com.company;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.*;

public class file {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num;

        System.out.println("Input what 2 will be powered to: ");
        num = in.nextInt();


        try
        {
            //to get program to work, replace Gideo with whatever your computer uses
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Gideo\\Desktop\\twoPowerTable.html"));
            bw.write("Exponent power of 2");
            bw.write("<br>");

            for(int i = 0; i <= num; i++)
            {
                bw.write("<pre>" + i + "             " + Math.pow(2,i) + "</pre>");
                bw.write("<br>");
            }

            bw.close();
        }
        catch(Exception ex)
        {
            return;
        }

    }
}
