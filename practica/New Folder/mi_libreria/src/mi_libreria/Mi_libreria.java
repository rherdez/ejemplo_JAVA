/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mi_libreria;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author rober
 */
public class Mi_libreria {
     String  url="jdbc:sqlite:C://textos//bd_lina.db";
    Connection conector;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    public ResultSet seleccionar(String sql){
                  
        ResultSet resul=null;               
            PreparedStatement st;
            try {
                st = conector.prepareStatement(sql);
                 resul=st.executeQuery();
                                                
            } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: "+ ex.getMessage().toString());
            }                       
            
        return resul;
        /*try {
            while(resul.next()){
                model.addRow(new Object[]{resul.getInt("id_equipo"),resul.getString("nombre_equipo")});
            }
        } catch (SQLException ex) {
            Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }
    public void cud(String sql){
         
        try{
            PreparedStatement st=conector.prepareStatement(sql);
            st.execute();
        }
        catch(Exception x){
            JOptionPane.showMessageDialog(null,x.toString());
        }
    }
    
   public void conectar(){
         try {         
            conector=DriverManager.getConnection(url);
           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: "+ ex.getMessage().toString());
        }
   }
   
   public void desconectar(){
        try {
            // TODO add your handling code here:
            conector.close();
        } catch (SQLException ex) {
              JOptionPane.showMessageDialog(null, "Error: "+ ex.getMessage().toString());
        }
   }
   
   public void saludo(){
       JOptionPane.showMessageDialog(null, "Hola Mundo");
   }
    
}
