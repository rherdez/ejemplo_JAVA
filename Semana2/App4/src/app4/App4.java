/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app4;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author rober
 */
public class App4 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        persona a =new persona();
        ArrayList<persona> conjunto=new ArrayList();
        
        
        System.out.println("Ingrese Codigo");
        a.set_id(sc.nextInt());
        System.out.println("Nombre");
        a.setNombre(sc.next());
        
        conjunto.add(a);
        
        ///presentar
        System.out.println("ID: "+conjunto.get(0).get_id());
        System.out.println("Nombre:"+conjunto.get(0).getNombre());
        
        
        
        
        
    }
    
}
