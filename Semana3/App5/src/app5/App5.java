/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app5;

/**
 *
 * @author rober
 */
public class App5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Empleado emp=new Empleado(25,5,"Carmen");
        
        //emp.setId(1);
        //emp.setNombre("Pedro");
        emp.setEmpresa("La mejor S.A.");
        //emp.setSueldo(15000);
        
        ////////////presentar
        
        System.out.println("ID: "+emp.getId());
        System.out.println("Nombre: "+emp.getNombre());
        System.out.println("Empresa: "+emp.getEmpresa());
        System.out.println("Sueldo: "+emp.getSueldo());
        
    }
    
}
