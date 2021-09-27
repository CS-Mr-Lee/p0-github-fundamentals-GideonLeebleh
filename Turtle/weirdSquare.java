public class weirdSquare {
   public static void main(String[] a)
   {
   Turtle bob = new Turtle();
   //Look at https://docs.oracle.com/javase/7/docs/api/java/awt/Color.html for different colours
   Turtle.bgcolor("slategray");
   bob.penColor("maroon");
   bob.width(10);
  
   //bob's directions
      bob.forward(50);
      
      bob.left(90);
      bob.forward(200);
      
      bob.left(90);
      bob.forward(25);
      
      bob.left(90);
      bob.forward(100);
      
      bob.right(90);
      bob.forward(75);
      
      bob.left(90);
      bob.forward(100);
      
      bob.left(90);
      bob.forward(50);
      
      //puts bob in the center
      bob.up();
      bob.left(90);
      bob.forward(50);


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