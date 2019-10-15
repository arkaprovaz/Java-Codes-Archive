import java.awt.*;
import java.io.*;
/**
* This program demonstrates how to capture a screenshot (full screen) as an
* image which will be saved into a file.
*
*/
public class RedDelta {

   /**
    *
    */

   public static Color getColorAt(int x, int y){
     Color c = null;
     try{
       c = new Robot().getPixelColor(x, y);
     } catch (AWTException ex){
       System.out.println(ex);
     }
     return c;
   }

   public static void main(String[] args) {
      RedDelta f = new RedDelta();
      try {
        /*
         * Let the program wait for 5 seconds to allow you to open the
         * window whose screenshot has to be captured
         */
         // Thread.sleep(5000);
         // Robot robot = new Robot();
         // String fileName = "./FullScreenshot.jpg";
         // Rectangle screenRect = new Rectangle(1000,500);
         // BufferedImage screenFullImage = robot.createScreenCapture(screenRect);
         // ImageIO.write(screenFullImage, "jpg", new File(fileName));
         Color c = null;
         int q = 0;
         while (true){
           for(int i=1294; i<1601; i+=10){
             c = getColorAt(i, 1326);
            // System.out.println("R: " + c.getRed() + "\nG: " + c.getGreen() + "\nB: " + c.getBlue());
           }
           System.out.println("Loop: " + ++q);
         }
      } catch (Exception ex) {
               System.err.println(ex);
      }
   }
}
