import java.util.Scanner;
public class ripOff {

   public static void main(String[] a)
   {
   Turtle bob = new Turtle();
   //Look at https://docs.oracle.com/javase/7/docs/api/java/awt/Color.html for different colours
   Turtle.bgcolor("orange");
   bob.penColor("black");
   bob.width(10);
  
  Scanner in = new Scanner(System.in);
  String dir;
  int num = 0;
  int distance = 1;
  int distance2 = 1;
  
  while (num != 1)
  {
     System.out.print("what direction should bob go?");
     dir = in.nextLine();
     
     if (dir.equals("w"))
     {
      bob.forward(distance);
     }
     
     else if (dir.equals("s"))
     {
      bob.backward(distance);
     }
     
     else if (dir.equals("a"))
     {
      bob.left(distance2);
     }
     
     else if (dir.equals("d"))
     {
      bob.right(distance2);
     }
     
     else if (dir.equals("q"))
     {
      bob.up();
     }
     
     else if (dir.equals("e"))
     {
      bob.down();
     }
     
     else if (dir.equals("distance"))
     {
      System.out.print("What would you like to change the distance to?");
      distance = in.nextInt();
     }
     
     else if (dir.equals("distance2"))
     {
      System.out.print("What would you like to change the distance to?");
      distance2 = in.nextInt();
     }
   }
    

   /*possible codes:
   bob.forward(distance)
   bob.backward(distance)
   bob.left(angle)
   bob.right(angle)
   
   bob.up()
   bob.down()
   
   bob.setDirection(angle)
   bob.home()
   bob.hide()
   bob.show()
   bob.face(x, y)
   bob.setPosition(x, y)
   
   bob.tilt(angle)
   bob.width(width)
   bob.penColor("colour")
   bob.bgcolor("colour")
   bob.stamp()
   bob.dot()
   bob.dot("colour")
   bob.dot("colour", dotsize)
   */
   }
   }
   