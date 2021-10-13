package com.company;
import java.util.Scanner;

public class addPairs {

    public static void main(String[] args) {

        //setup

            Scanner in = new Scanner(System.in);
            String input;
            int integer;
            int var1 = 0;
            int var2 = 0;
            int var3 = 0;
            boolean bool = true;

        //input

            System.out.print("Enter a string of integers: ");
            integer = in.nextInt();

        //calculations

            System.out.print("("); //apart of the overall output

            //changes int into string
            input = Integer.toString(integer);

            //finds if there is an odd digit number
            var2 = input.length() % 2;

            //if the inputted value has an odd digit out
            if(var2 != 0)
            {
                    //puts int into an array
                    int[] nums = new int [input.length() + 1];
                    for(int i = 0; i <= input.length() - 1; i++)
                    {
                            nums[i] = Character.getNumericValue(input.charAt(i));
                            var2 = nums[input.length() - 1];
                            nums[input.length() - 1] = 0;
                            nums[input.length()] = var2;
                    }

                    //puts numbers into pairs
                    int [] sums = new int[input.length()];
                    for(int i = 0; i <= input.length() - 1; i += 2)
                    {
                            var1 = nums[i] * 10;
                            sums[i] = var1 + nums[i +  1];
                            if(i == input.length() - 1)
                            {
                                    System.out.print(sums[i] + ")");
                            }
                            else {System.out.print(sums[i] + "+");}

                            var3 = var3 + sums[i];
                    }
                    System.out.print(" = " + var3);
            }

            //if there is no odd digit out
            else if (var2 == 0)
            {
                    int[] nums = new int[input.length()];
                    //puts int into an array
                    for (int i = 0; i <= input.length() - 1; i++)
                    {
                            nums[i] = Character.getNumericValue(input.charAt(i));
                    }

                    //puts numbers into pairs
                    int [] sums = new int[input.length()];
                    for(int i = 0; i <= input.length() - 1; i += 2)
                    {
                            var1 = nums[i] * 10;
                            sums[i] = var1 + nums[i +  1];
                            if(i == input.length() - 2)
                            {
                                    System.out.print(sums[i] + ")");
                            }
                            else {System.out.print(sums[i] + "+");}

                            var3 = var3 + sums[i];
                    }
                    System.out.println(" = " + var3);
            }
    }
}
