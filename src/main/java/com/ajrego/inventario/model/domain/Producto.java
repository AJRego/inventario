package com.ajrego.inventario.model.domain;

import java.time.LocalDate;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.FloatProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleFloatProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Producto {
    private final IntegerProperty ID;
    private final StringProperty nombre;
    private final FloatProperty precio;
    private final IntegerProperty stock;
    private final ObjectProperty<LocalDate> fechaDeIngreso;
    private final ObjectProperty<LocalDate> fechaDeVencimiento;
    private final BooleanProperty devuelto;
    private final IntegerProperty categoriaID;
    private final IntegerProperty proveedorID;
    private final StringProperty QR;
    
    public Producto(){
        this.ID = new SimpleIntegerProperty();
        this.nombre = new SimpleStringProperty();
        this.precio = new SimpleFloatProperty();
        this.stock = new SimpleIntegerProperty();
        this.fechaDeIngreso = new SimpleObjectProperty<LocalDate>();
        this.fechaDeVencimiento = new SimpleObjectProperty<LocalDate>();
        this.devuelto = new SimpleBooleanProperty();
        this.categoriaID = new SimpleIntegerProperty();
        this.proveedorID = new SimpleIntegerProperty();
        this.QR = new SimpleStringProperty();
    }
    
    public Producto(int ID, String nombre, float precio, int stock, LocalDate fechaDeIngreso,
        LocalDate fechaDeVencimiento, boolean devuelto, int categoriaID, int proveedorID, String QR){
        
        this.ID = new SimpleIntegerProperty(ID);
        this.nombre = new SimpleStringProperty(nombre);
        this.precio = new SimpleFloatProperty(precio);
        this.stock = new SimpleIntegerProperty(stock);
        this.fechaDeIngreso = new SimpleObjectProperty<LocalDate>(fechaDeIngreso);
        this.fechaDeVencimiento = new SimpleObjectProperty<LocalDate>(fechaDeVencimiento);
        this.devuelto = new SimpleBooleanProperty(devuelto);
        this.categoriaID = new SimpleIntegerProperty(categoriaID);
        this.proveedorID = new SimpleIntegerProperty(proveedorID);
        this.QR = new SimpleStringProperty(QR);
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
    
    public String getNombre(){
        return nombre.get();
    }
    
    public void setNombre(String nombre){
        this.nombre.set(nombre);
    }
    
    public StringProperty nombreProperty(){
        return nombre;
    }
    
    public Float getPrecio(){
        return precio.get();
    }
    
    public void setPrecio(float precio){
        this.precio.set(precio);
    }
    
    public FloatProperty precioProperty(){
        return precio;
    }
    
    public int getStock(){
        return stock.get();
    }
    
    public void setStock(int stock){
        this.stock.set(stock);
    }
    
    public IntegerProperty stockProperty(){
        return stock;
    }
    
    public LocalDate getFechaDeIngreso(){
        return fechaDeIngreso.get();
    }
    
    public void setFechaDeIngreso(LocalDate fechaDeIngreso){
        this.fechaDeIngreso.set(fechaDeIngreso);
    }
    
    public ObjectProperty<LocalDate> fechaDeIngresoProperty(){
        return fechaDeIngreso;
    }
    
    public LocalDate getFechaDeVencimiento(){
        return fechaDeVencimiento.get();
    }
    
    public void setFechaDeVencimiento(LocalDate fechaDeVencimiento){
        this.fechaDeVencimiento.set(fechaDeVencimiento);
    }
    
    public ObjectProperty<LocalDate> fechaDeVencimientoProperty(){
        return fechaDeVencimiento;
    }
    
    public boolean getDevuelto(){
        return devuelto.get();
    }
    
    public void setDevuelto(boolean devuelto){
        this.devuelto.set(devuelto);
    }
    
    public BooleanProperty devueltoProperty(){
        return devuelto;
    }
    
    public int getCategoriaID(){
        return categoriaID.get();
    }
    
    public void setCategoriaID(int categoriaID){
        this.categoriaID.set(categoriaID);
    }
    
    public IntegerProperty categoriaIDProperty(){
        return categoriaID;
    }
    
    public int getProveedorID(){
        return proveedorID.get();
    }
    
    public void setProveedorID(int proveedorID){
        this.proveedorID.set(proveedorID);
    }
    
    public IntegerProperty proveedorIDProperty(){
        return proveedorID;
    }
    
    public String getQR(){
        return QR.get();
    }
    
    public void setQR(String QR){
        this.QR.set(QR);
    }
    
    public StringProperty QRProperty(){
        return QR;
    }
}
