public class House {
   public static void main(String[] a)
   {
   Turtle bob = new Turtle();
   //Look at https://docs.oracle.com/javase/7/docs/api/java/awt/Color.html for different colours
   Turtle.bgcolor("slategray");
   bob.penColor("maroon");
   bob.width(10);
  
  
   //bob's directions
   
      //setup
      bob.up();
      bob.backward(100);
      bob.right(90);
      bob.forward(150);
      bob.left(90);
      bob.down();
         
      //house main square   
      bob.forward(200);
      bob.left(90);
      
      bob.forward(200);
      bob.left(90);
      
      bob.forward(200);
      bob.left(90);
      
      bob.forward(200);
      bob.left(90);
      
      //house triangle
      bob.left(90);
      bob.forward(200);
      bob.left(90);
      bob.forward(40);
      
      bob.right(135);
      bob.forward(198);
      
      bob.right(90);
      bob.forward(198);
      bob.right(135);
      bob.forward(50);
      
      //chimney
      bob.up();
      bob.right(90);
      bob.forward(50);
      
      bob.down();
      bob.forward(100);
      
      bob.left(90);
      bob.forward(40);
      
      bob.left(90);
      bob.forward(60);
      
      //window
      bob.up();
      bob.forward(130);
      
      int win = 50; //had win for editing size quickly
      bob.down();
      bob.forward(win);
      
      bob.left(90);
      bob.forward(win/2);
      
      bob.left(90);
      bob.forward(win);
      
      bob.left(90);
      bob.forward(win);
      
      bob.left(90);
      bob.forward(win);
      
      bob.left(90);
      bob.forward(win/2);
      
      bob.left(90);
      bob.forward(win/2);
      
      bob.left(90);
      bob.forward(win/2);
      bob.backward(win);

      //door
      bob.up();
      bob.forward(150);
      
      bob.left(90);
      bob.forward(40);
      
      bob.down();
      bob.forward(95);
      
      bob.left(90);
      bob.forward(65);
      
      bob.left(90);
      bob.forward(95);
      
      bob.left(90);
      bob.forward(65);


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