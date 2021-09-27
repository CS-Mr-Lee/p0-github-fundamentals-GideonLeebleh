import java.util.Scanner;
public class input_math {
   
   
   public static void main(String[] a)
   {
   
   //Setup
      
      Scanner in = new Scanner(System.in);
      
      //input val
      int year;
      int month;
      int day;
      int year2;
      int month2;
      int day2;
      
      //calc var
      int yAlive;
      int mAlive;
      int dAlive;
      int hours;
   
   //Questions
     
      System.out.println("Enter your birthdate: ");
      
      System.out.print("Year: ");
      year = in.nextInt();
      
      System.out.print("Month: ");
      month = in.nextInt();
      
      System.out.print("Day: ");
      day = in.nextInt();
      
      System.out.print("Enter today's date: ");
      
      System.out.print("Year: ");
      year2 = in.nextInt();
      
      System.out.print("Month: ");
      month2 = in.nextInt();
      
      System.out.print("Day: ");
      day2 = in.nextInt();
      
      
   //Calculations
      
      //days
      dAlive = (30 - day) + day2;
      
      //years
      yAlive = year2 - year;
      dAlive = dAlive + (yAlive * 365);
      
      //months
      mAlive = (12 - month) + month2;
      dAlive = dAlive + (mAlive * 30);
      
      //hours
      hours = dAlive * 8;
      
   //Output
      
      System.out.println("You have been alive for " + dAlive + " days.");
      System.out.println("You have slept " + hours + " hours.");
      
      
   
   }
   }