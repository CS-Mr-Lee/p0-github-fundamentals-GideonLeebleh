/**
 *   Author name: Gideon Lee
 *   Date: Nov 11 2021
 *   Name of program: File
 *   Program purpose: This program will create a text file that contains a power of two table in HTML format.
 *                    The number of values on the table will depend on the user's input.
 */
package com.company;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class File {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num;

        System.out.println("Input what 2 will be powered to: ");
        num = in.nextInt();


        try
        {
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Gideo\\Desktop\\twoPowerTable.html"));

            bw.write("<html><head>");
            bw.write("<title>Powers of Two</title>");
            bw.write("</head>");
            bw.write("<body>");
            bw.write("<table border cellpadding=5>");
            bw.write("<tr><th>Power of 2</th><th>Value</th></tr>");
            //loop to create the table
            for(int i = 0; i <= num; i++)
            {
                bw.write("<tr><th>" + i + "</th><th>" + Math.pow(2,i) + "</th></tr>");
            }
            bw.write("</table>");
            bw.write("</body></html>");
            bw.close();
        }
        catch(Exception ex)
        {
            return;
        }

    }
}
