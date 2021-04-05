
package com.ajrego.inventario.model.dao;

import com.ajrego.inventario.model.domain.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Cliente_dao {
    
    private Connection con;
    
    public Connection getConnection(){        
        return con;
    }
    
    public void setConnection(Connection con){
        this.con = con;
    }
    
    public boolean insert(Cliente cliente){
        
        String query = "INSERT INTO CLIENTE (Cedula, Nombre, Telefono, Correo, Direccion, "
                + "FechaIngreso, FechaSalida) VALUES (?,?,?,?,?,?,?)";
  
        try {
            
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, cliente.getCedula());
            ps.setString(2, cliente.getNombre());
            ps.setInt(3, cliente.getTelefono());
            ps.setString(4, cliente.getCorreo());
            ps.setString(5, cliente.getDireccion());
            ps.setString(6, cliente.getFechaIngreso().toString());
            ps.setString(7, cliente.getFechaSalida().toString());
            ps.execute();
            return true;
            
        } catch (Exception e) {
            Logger.getLogger(Cliente_dao.class.getName()).log(Level.SEVERE, null, e);
            return false;
            
        }
    }
    
    public boolean update(Cliente cliente){
        
        String query = "UPDATE CLIENTE SET Cedula=?, Nombre=?, Telefono=?, Correo=?"
                        + "Direccion=?, FechaIngreso=?, FechaSalida=? WHERE ID=?";
        
        try {
            
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, cliente.getCedula());
            ps.setString(2, cliente.getNombre());
            ps.setInt(3, cliente.getTelefono());
            ps.setString(4, cliente.getCorreo());
            ps.setString(5, cliente.getDireccion());
            ps.setString(6, cliente.getFechaIngreso().toString());
            ps.setString(7, cliente.getFechaSalida().toString());
            ps.setInt(8, cliente.getID());
            ps.execute();
            return true;
            
        } catch (Exception e) {
            Logger.getLogger(Cliente_dao.class.getName()).log(Level.SEVERE, null, e);
            return false;
            
        }
        
    }
    
    public boolean delete(Cliente cliente){
        
        String query = "DELETE FROM CLIENTE WHERE ID=?";
        
        try {
            
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, cliente.getID());
            ps.execute();
            return true;
            
        } catch (Exception e) {
            Logger.getLogger(Cliente_dao.class.getName()).log(Level.SEVERE, null, e);
            return false;
        }
        
    }
    
}
