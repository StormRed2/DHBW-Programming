/*
*
*Copyright Florian Martin
*Nov 15, 2014
*/

package dhbw;

import javax.swing.JOptionPane;


public class ggTandkgV {

   private static int ggt(int a, int b) {
        
            //int a = Integer.parseInt(firststring);
            //int b = Integer.parseInt(secondstring);
            int c = a;
            int d = b;
       
       
            while (b != 0) {
                  if (a > b) 
                  {
                      a = a - b;
                  } 
                 else 
                  {
                  b = b - a;
                  }
           }
                    
           System.out.println("The GGT(gcf) for " +c+ " and " +d+ " is: " +a);
           //System.out.println(a);
           
           
           return a;
         
                                     
}
  
   private static String kgv(int a, int b) {
        
            //int a = Integer.parseInt(firststring);
            //int b = Integer.parseInt(secondstring);
           
            
             System.out.println("The KGV(lcm) is: " +(a * b)/ggt(a, b));
             return null;
 }
public static void main (String[] args){


    String firstinput;
    String secondinput;
    
    firstinput = JOptionPane.showInputDialog("Enter first Number:");
    
        if (firstinput != null)
        {
            secondinput = JOptionPane.showInputDialog("Enter second Number:");
        }
        else
        {
            return;
        }
        
        if (secondinput != null)
        {
            if ( JOptionPane.showConfirmDialog(null, "You entered: " + firstinput 
             + " & " + secondinput + " Correct?", "Check your Input!", 
                                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
            {
                int a = Integer.parseInt(firstinput);
                int b = Integer.parseInt(secondinput);
                
                //ggt(a, b);
                kgv(a, b);
            }
        }


    }
}
