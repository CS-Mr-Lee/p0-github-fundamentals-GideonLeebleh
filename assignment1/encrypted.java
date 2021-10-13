package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class encrypted {

    public static void main(String[] args) {

        //Setup

            Scanner in = new Scanner(System.in);
            String encrypt;
            int var1 = 0;
            char var2 = 32;
            char scan;


        //Input

            System.out.print("Please input a string: ");
            encrypt = in.nextLine();


        //Calculations

            //puts string into an array
            char[] array = new char [encrypt.length()];
            for(int i = 0; i <= encrypt.length() - 1; i++)
            {
                array[i] = encrypt.charAt(i);
            }

            //scans whole array for spaces
            char [] scanA = new char[encrypt.length() + 1];
            for(int i = 0; i <= encrypt.length() - 1; i++)
            {
                scan = array[i];

                if (scan == 32)
                {
                    scanA[i] = '1';
                }

                else
                {
                    scanA[i] = '0';
                }
            }
            //System.out.print(scanA);  //meant to show results of scanA for testing
            //System.out.println();       //space

            //sort words
            char [] out = new char[encrypt.length()];
            for(int i = 0; i <= encrypt.length() - 1; i++)
            {
                if (i == 0 || scanA[i-1] == '1') //first letter of word
                {
                    var1 = i;
                    var2 = array[i];
                }

                else if (scanA[i+1] == '1' ||  i == encrypt.length() - 1) //last letter of word
                {
                    out[i] = var2;
                    out[var1] = array[i];
                }

                else if (scanA[i] == '0') //letters in the middle of word
                {
                    out[i] = array[i];
                }

                else if (scanA[i] == '1') //spaces
                {
                    System.out.print(" ");
                }
            }

            //output
            System.out.println();
            for(int i = 0; i <= encrypt.length() - 1; i++)
            {
                if (i == 0 || scanA[i-1] == '1') //first letter of word
                {
                    System.out.print(Character.toString(out[i]));
                }

                else if (scanA[i+1] == '1' ||  i == encrypt.length() - 1) //last letter of word
                {
                    System.out.print(Character.toString(out[i]));
                }

                else if (scanA[i] == '0') //letters in the middle of word
                {
                    System.out.print(Character.toString(out[i] + 2));
                }

                else if (scanA[i] == '1') //spaces
                {
                    System.out.print(" ");
                }
            }
    }
}