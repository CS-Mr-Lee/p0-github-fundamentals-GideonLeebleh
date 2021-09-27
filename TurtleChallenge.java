public class TurtleChallenge {
   public static void main(String[] a)
   {
   Turtle bob = new Turtle();
   //Look at https://docs.oracle.com/javase/7/docs/api/java/awt/Color.html for different colours
   Turtle.bgcolor("orange");
   bob.penColor("black");
   bob.width(10);
  
  
   //bob's directions
      
      bob.dot("maroon", 382);
      
      //setup
         bob.up();
         bob.right(90);
         bob.forward(190);
         bob.left(90);
      
      //circle
         bob.down();
         for(int i=0; i < 135; i++)
         {
         bob.forward(10);
         bob.left(3);
         } 
      
      //spiral
         bob.left(180);
         for(int i=0; i < 52; i++)
         {
         bob.forward(10);
         bob.right(4);
         }
         
         for(int i=0; i < 25; i++)
         {
         bob.forward(10);
         bob.right(5.5);
         }
   
         
         for(int i=0; i < 20; i++)
         {
         bob.forward(10);
         bob.right(10); 
         }
         
      //hide the bob     
         bob.hide();


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