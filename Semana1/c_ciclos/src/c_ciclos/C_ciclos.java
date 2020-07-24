/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c_ciclos;
import java.util.Scanner;
/**
 *
 * @author rober
 */
public class C_ciclos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner sc=new Scanner(System.in); 



/*
            for(int i=0; i<6; i++)
            {
                for(int x=0; x<i; x++)
                {
                    System.out.print("* ");
                }   
                System.out.println("");
            }        */
/*
            for(int linea=0;linea<4;linea++){
                for(int c=0;c<linea;c++){
                        System.out.print("  ");
                }
                                
                for (int columna=0;columna<4-linea;columna++) {
                    System.out.print("* ");
                }
                System.out.println("");
            }
*/
/*
            for(int linea=0;linea<4;linea++){
                for (int columna=1;columna<4-linea;columna++) {
                    System.out.print("  ");
                }
                
                for(int c=0;c<=linea;c++){
                        System.out.print("* ");
                }
                                              
                System.out.println("");
            }*/

String res="s";

while(res.equals("s")){
    System.out.println("Desea Continuar");
    res=sc.next();
}

do{
    System.out.println("Desea Continuar");
    res=sc.next();
}while(res.equals("s"));

      }
}
