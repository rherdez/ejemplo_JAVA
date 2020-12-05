/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author rober
 */
public class clase {

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        
        this.url ="jdbc:sqlite:"+ url;
    }
    
     String url="jdbc:sqlite:C:/temp/inventario.db";
     public Connection connect;
     
     public void abrir(){
           try{
            connect = DriverManager.getConnection(url);
           
        }catch(Exception x){
            JOptionPane.showMessageDialog(null, "Error "+x.toString());
        }
     }
     
     public void cerrar(){
         try{
            connect.close();
           
        }catch(Exception x){
            JOptionPane.showMessageDialog(null, "Error "+x.getMessage().toString());
        }
     }
     
     ResultSet Seleccionar(String sql){
        ResultSet resul=null;
          try{
                PreparedStatement st=connect.prepareStatement("select codigo,nombre from producto");
                resul=st.executeQuery();                                            
            }
            catch(Exception x){
                JOptionPane.showMessageDialog(null, "Error "+x.getMessage().toString());
            }
        return resul;
         
     }
     void Seleccionar(String sql,JTable tabla){
        ResultSet resul=null;
        DefaultTableModel model;
        model=(DefaultTableModel)tabla.getModel();
           model.setRowCount(0);
            try{
            PreparedStatement st=connect.prepareStatement(sql);
            resul=st.executeQuery();
            
            while(resul.next()){
                Object d[]=new Object[tabla.getColumnCount()];
                for(int i=0;i<tabla.getColumnCount();i++){
                    d[i]=resul.getString(i+1);
                }
                //model.addRow(new Object[]{resul.getInt("codigo"),resul.getString("nombre")});
                model.addRow(d);
            }
                        
        }
        catch(Exception x){
            JOptionPane.showMessageDialog(null, "Error "+x.getMessage().toString());
        }
        
     }
     void actoins(String sql){
           try{
                PreparedStatement st= connect.prepareStatement(sql);
                st.execute();
                JOptionPane.showMessageDialog(null, "Datos Guardados");
                
           
        }catch(Exception x){
            JOptionPane.showMessageDialog(null, x.getMessage().toString());
        }
       
     }
}
