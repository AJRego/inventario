package com.ajrego.inventario.model.domain;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class DetalleFactura {
    private final IntegerProperty ID;
    private final IntegerProperty productoID;
    private final IntegerProperty facturaID;
    private final IntegerProperty cantidad;
    
    public DetalleFactura(){
        this.ID = new SimpleIntegerProperty();
        this.productoID = new SimpleIntegerProperty();
        this.facturaID = new SimpleIntegerProperty();
        this.cantidad = new SimpleIntegerProperty();
    }
    
    public DetalleFactura(int ID, int productoID, int facturaID, int cantidad){
        this.ID = new SimpleIntegerProperty(ID);
        this.productoID = new SimpleIntegerProperty(productoID);
        this.facturaID = new SimpleIntegerProperty(facturaID);
        this.cantidad = new SimpleIntegerProperty(cantidad);
    }
    
    public int getID(){
        return ID.get();
    }
    
    public void setID(int ID){
        this.ID.set(ID);
    }
    
    public IntegerProperty IDProperty(){
        return ID;
    }
    
    public int getProductoID(){
        return productoID.get();
    }
    
    public void setProductoID(int productoID){
        this.productoID.set(productoID);
    }
    
    public IntegerProperty productoIDProperty(){
        return productoID;
    }
    
    public int getFacturaID(){
        return facturaID.get();
    }
    
    public void setFacturaID(int facturaID){
        this.facturaID.set(facturaID);
    }
    
    public IntegerProperty facturaIDProperty(){
        return facturaID;
    }
    
    public int getCantidad(){
        return cantidad.get();
    }
    
    public void setCantidad(int cantidad){
        this.cantidad.set(cantidad);
    }
    
    public IntegerProperty cantidadProperty(){
        return cantidad;
    }
    
    
}
