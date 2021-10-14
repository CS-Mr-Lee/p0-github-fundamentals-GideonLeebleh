package com.company;
import java.util.Scanner;

public class foolProof {

    public static void main(String[] args) {

        //setup

            Scanner in = new Scanner(System.in);
            String input;
            float num1 = 0;
            float num2 = 0;
            boolean bool = false;


        while (!bool)
        {
            try
            {
                System.out.print("input a numerator: ");
                input = in.nextLine();  //error here

                if(input.startsWith("q") || input.startsWith("Q"))
                {
                    bool = true;
                }

                else
                {
                    num1 = Float.parseFloat(input);
                    System.out.print("input a divisor: ");
                    num2 = in.nextInt();
                    in.nextLine();
                    if(num2 == 0) // triggers logic error if divisor = 0
                    {
                        int [] fail = new int[1];
                        for(int i = 0; i <= 1; i++)
                        {
                            fail[i] = i;
                        }
                    }

                    System.out.println();
                    System.out.println(num1 + "/" + num2 + " = "  + num1 / num2);
                }
            }
            catch (Exception e)
            {
                System.out.println("You entered bad data, try again");
                System.out.println();
            }
        }

    }
}
