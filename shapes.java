import java.util.Scanner;
public class shapes {
   
   public static void fillSquare(Turtle bob, int num)
   {
   //bob's directions
      bob.forward(num);
      bob.left(90);
      
      bob.forward(2*num);
      bob.left(90);
      
      bob.forward(2*num);
      bob.left(90);
      
      bob.forward(2*num);
      bob.left(90);
      
      bob.forward(num);
      bob.left(90);
      
   //filling the square
      for(int i=0; i < 2*num; i++)
      {
         bob.forward(1);
         bob.left(90);
         bob.forward(num);
         bob.backward(2*num);
         bob.forward(num);
         bob.right(90);
      }

   }
   
   public static void main(String[] a)
   {
   Turtle bob = new Turtle();
   //Look at https://docs.oracle.com/javase/7/docs/api/java/awt/Color.html for different colours
   Turtle.bgcolor("orange");
   bob.penColor("black");
   bob.width(10);
  
  Scanner in = new Scanner(System.in);
  int num;
  
  System.out.print("what size of square would you like?");
  num = in.nextInt();
  
  fillSquare(bob, num);      
    

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