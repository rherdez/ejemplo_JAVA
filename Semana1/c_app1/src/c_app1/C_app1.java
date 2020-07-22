/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c_app1;
import java.util.Scanner;
/**
 *
 * @author rober
 */
public class C_app1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner ct = new Scanner (System.in);
        int golA, golB; 
        System.out.println(" Ingrese los goles del equipo A");
            golA = ct.nextInt();
        System.out.println(" Ingrese los goles del equipo B");
            golB = ct.nextInt();

        if(golA > golB)
        {
            System.out.println(" El equipo A gano el partido");
        }
        else if (golA==golB) 
        {
            System.out.println(" El partido está empatado");
        }
        else
        {
            System.out.println(" El equipo B gano el partido");
        }               
    }    
}
