/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app2;
import java.util.Scanner;
/**
 *
 * @author rober
 */
public class App2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc =new Scanner(System.in);
        char letra;
        System.out.println("Ingrese una letra");
        letra=sc.next().charAt(0);
        
        //if(letra.equals("a")){
        if(letra=='a'){
            System.out.println("una vaocal");
        }
        else{
            System.out.println("no se");
        }        
        
    }    
}

