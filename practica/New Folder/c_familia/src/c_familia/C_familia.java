/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c_familia;

/**
 *
 * @author rober
 */
public class C_familia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        padre jose= new padre();
        
        jose.setNombreAbuelo("Jose Francisco Lopez");
        jose.setEdad(80);
        
        System.out.println("Nombre: "+jose.getNombreAbuelo());
        System.out.println("Edad: "+jose.getEdad());
        
        jose.setEdad_padre(40);
        jose.setNombre_padre("Chepito Pancho Lopez");
        
        System.out.println("Nombre Padre: "+jose.getNombre_padre() );
        System.out.println("Edad Padre: "+jose.getEdad_padre());
        
    }
    
}
