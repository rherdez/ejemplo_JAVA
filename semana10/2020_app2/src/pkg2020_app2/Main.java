/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2020_app2;

/**
 *
 * @author rober
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
       int max=4;
        for(int i=0;i<=max;i++){
           for(int x=0;x<=i;x++){
               System.out.print("* ");
           }
            System.out.println("");
        }
        
        for(int i=4;i>=0;i--){
           for(int x=0;x<=i;x++){
               System.out.print("* ");
           }
            System.out.println("");
        }
        
         for(int i=0;i<=max;i++){
           for(int x=0;x<=4-i;x++){
               System.out.print("  ");
           }
            for(int x=0;x<=i;x++){
               System.out.print("* ");
           }
            System.out.println("");
        }
        
         
          for(int i=0;i<=max;i++){
         
            for(int x=0;x<=i;x++){
               System.out.print("  ");
           }
            
              for(int x=0;x<=4-i;x++){
               System.out.print("* ");
           }
              System.out.println("");
        }   
    }
}
