
package com.ajrego.inventario.model.dao;

import com.ajrego.inventario.model.domain.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Producto_dao {
    
    private Connection con;
    
    public Connection getConnection(){        
        return con;
    }
    
    public void setConnection(Connection con){
        this.con = con;
    }
    
    public boolean insert(Producto producto){
        
        String query = "INSERT INTO PRODUCTO(Nombre, Precio, Stock, FechaDeIngreso, FechaDeVencimiento,"
                + "Devuelto, QR, CategoriaID, ProveedorID) VALUES (?,?,?,?,?,?,?,?,?)";
        
        try {
            
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, producto.getNombre());
            ps.setDouble(2, producto.getPrecio());
            ps.setInt(3, producto.getStock());
            ps.setString(4, producto.getFechaDeIngreso().toString());
            ps.setString(5, producto.getFechaDeVencimiento().toString());
            ps.setBoolean(6, producto.getDevuelto());
            ps.setString(7, producto.getQR());
            ps.setInt(8, producto.getCategoriaID());
            ps.setInt(9, producto.getProveedorID());
            ps.execute();
            return true;
            
        } catch (Exception e) {
            Logger.getLogger(Producto_dao.class.getName()).log(Level.SEVERE, null, e);
            return false;
        }
        
    }
    
    public boolean update(Producto producto){
        
        String query = "UPDATE PRODUCTO SET Nombre=?, Precio=?, Stock=?, FechaDeIngreso=?,"
                + "FechaDeVencimiento=?, Devuelto=?, QR=?, CategoriaID=?, ProveedorID=? WHERE ID=?";
        
        try {
            
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, producto.getNombre());
            ps.setDouble(2, producto.getPrecio());
            ps.setInt(3, producto.getStock());
            ps.setString(4, producto.getFechaDeIngreso().toString());
            ps.setString(5, producto.getFechaDeVencimiento().toString());
            ps.setBoolean(6, producto.getDevuelto());
            ps.setString(7, producto.getQR());
            ps.setInt(8, producto.getCategoriaID());
            ps.setInt(9, producto.getProveedorID());
            ps.setInt(10, producto.getID());
            ps.execute();
            return true;
            
        } catch (Exception e) {
            Logger.getLogger(Producto_dao.class.getName()).log(Level.SEVERE, null, e);
            return false;
        }
    }
    
    public boolean delete(Producto producto){
        
        String query = "DELETE FROM PRODUCTO WHERE ID=?";
        
        try {
            
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, producto.getID());
            ps.execute();
            return true;
            
        } catch (Exception e) {
            Logger.getLogger(Producto_dao.class.getName()).log(Level.SEVERE, null, e);
            return false;
        }
    }
    
}
