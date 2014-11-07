/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

/**
 *
 * @author StormRed2
 */
public class Factory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int modelA; // Numbers of car per day for A
        int modelB; // Numbers of car per day for B
        int count = 0;
        int count2 = 0;
        
        for(modelA = 42; modelA < 10550; modelA = modelA + 42){
            for(modelB = 70; modelB < 10550; modelB = modelB + 70){
                
                int i = modelA;
                int j = modelB;
                //System.out.println(i+ "+" + j);
                count++;
                
                
                if( (((modelA) + (modelB)) <= 10550) && (((modelA) + (modelB)) >= (i+j)) && ((modelA/42) + ((modelB/70))) == 200){
                    
                    count2++;
           
                    System.out.println("----------------------------------------------");
                    System.out.println("Solution found: #" + count2);                    
                    System.out.println("Car Model A: " + modelA +" Stück" +"\nCar Model B: " + modelB +" Stück");                    
                    System.out.println("Profit: " +((modelA * 900) + (modelB * 600)) +"€" );
                    System.out.println("");
                    System.out.println("Schleifen " +count);
                    System.out.println("----------------------------------------------");
                    System.out.println("");
                    return;
                     }
            }
        }
        
        
    }
}
