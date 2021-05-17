
package com.ajrego.inventario.model.dao;

import com.ajrego.inventario.model.database.DatabaseSQLite;
import com.ajrego.inventario.model.domain.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Cliente_dao {
    
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    DatabaseSQLite connection = new DatabaseSQLite();
    
    public boolean insert(Cliente cliente){
        
        String query = "INSERT INTO CLIENTE (ID, Cedula, Nombre, Telefono, Correo, Direccion, "
                + "FechaIngreso, FechaSalida) VALUES (?,?,?,?,?,?,?,?)";
        
        try {
            
            ps = (PreparedStatement) connection.connect(query);
            ps.setInt(1, cliente.getID());
            ps.setInt(2, cliente.getCedula());
            ps.setString(3, cliente.getNombre());
            ps.setInt(4, cliente.getTelefono());
            ps.setString(5, cliente.getCorreo());
            ps.setString(6, cliente.getDireccion());
            ps.setString(7, cliente.getFechaIngreso().toString());
            ps.setString(8, cliente.getFechaSalida().toString());
            ps.execute();
            return true;
            
        } catch (Exception e) {
            Logger.getLogger(Cliente_dao.class.getName()).log(Level.SEVERE, null, e);
            return false;
            
        }finally{
            connection.close((Connection) connection);
        }

    }
    
    public boolean update(Cliente cliente){
        
        String query = "UPDATE CLIENTE SET Cedula=?, Nombre=?, Telefono=?, Correo=?"
                        + "Direccion=?, FechaIngreso=?, FechaSalida=? WHERE ID=?";
        
        try {
            
            ps = (PreparedStatement) connection.connect(query);
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
            
        }finally{
            connection.close((Connection) connection);
        }
        
    }
    
    public boolean delete(Cliente cliente){
        
        String query = "DELETE FROM CLIENTE WHERE ID=?";
        
        try {
            
            ps = (PreparedStatement) connection.connect(query);
            ps.setInt(1, cliente.getID());
            ps.execute();
            return true;
            
        } catch (Exception e) {
            Logger.getLogger(Cliente_dao.class.getName()).log(Level.SEVERE, null, e);
            return false;
        }finally{
            connection.close((Connection) connection);
        }
        
    }
    
}
