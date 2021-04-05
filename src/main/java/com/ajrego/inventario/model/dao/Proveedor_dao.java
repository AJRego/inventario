
package com.ajrego.inventario.model.dao;

import com.ajrego.inventario.model.domain.Proveedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Proveedor_dao {
    
    private Connection con;
    
    public Connection getConnection(){        
        return con;
    }
    
    public void setConnection(Connection con){
        this.con = con;
    }
    
    public boolean insert(Proveedor proveedor){
        
        String query = "INSERT INTO PROVEEDOR (Nombre, Telefono, Correo,"
                + "FechaIngreso, FechaSalida) VALUES (?,?,?,?,?)";
        
        try {
            
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, proveedor.getNombre());
            ps.setInt(2, proveedor.getTelefono());
            ps.setString(3, proveedor.getCorreo());
            ps.setString(4, proveedor.getFechaIngreso().toString());
            ps.setString(5, proveedor.getFechaSalida().toString());
            ps.execute();
            return true;
            
        } catch (Exception e) {
            Logger.getLogger(Proveedor_dao.class.getName()).log(Level.SEVERE, null, e);
            return false;
            
        }
  
        
    }
    
    public boolean update(Proveedor proveedor){
        
        String query = "UPDATE PROVEEDOR SET Cedula=?, Nombre=?, Telefono=?, Correo=?"
                        + "Direccion=?, FechaIngreso=?, FechaSalida=? WHERE ID=?";
        
        try {
            
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, proveedor.getNombre());
            ps.setInt(2, proveedor.getTelefono());
            ps.setString(3, proveedor.getCorreo());
            ps.setString(4, proveedor.getFechaIngreso().toString());
            ps.setString(5, proveedor.getFechaSalida().toString());
            ps.setInt(6, proveedor.getID());
            ps.execute();
            return true;
            
        } catch (Exception e) {
            Logger.getLogger(Proveedor_dao.class.getName()).log(Level.SEVERE, null, e);
            return false;
            
        }
        
    }
    
    public boolean delete(Proveedor proveedor){
        
         String query = "DELETE FROM PROVEEDOR WHERE ID=?";
         
         try {
            
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, proveedor.getID());
            ps.execute();
            return true;
            
        } catch (Exception e) {
            Logger.getLogger(Proveedor_dao.class.getName()).log(Level.SEVERE, null, e);
            return false;
            
        }
    }
    
}
