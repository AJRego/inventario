package com.ajrego.inventario.model.domain;

import java.time.LocalDate;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Proveedor {
    private final IntegerProperty ID;
    private final StringProperty nombre;
    private final IntegerProperty telefono;
    private final StringProperty correo;
    private final ObjectProperty<LocalDate> fechaIngreso;
    private final ObjectProperty<LocalDate> fechaSalida;
    
    public Proveedor(){
        this.ID = new SimpleIntegerProperty();
        this.nombre = new SimpleStringProperty();
        this.telefono = new SimpleIntegerProperty();
        this.correo = new SimpleStringProperty();
        this.fechaIngreso = new SimpleObjectProperty<LocalDate>();
        this.fechaSalida = new SimpleObjectProperty<LocalDate>();
    }
    
    public Proveedor(int ID, String nombre, int telefono, String correo, LocalDate fechaIngreso, LocalDate fechaSalida){
        this.ID = new SimpleIntegerProperty(ID);
        this.nombre = new SimpleStringProperty(nombre);
        this.telefono = new SimpleIntegerProperty(telefono);
        this.correo = new SimpleStringProperty(correo);
        this.fechaIngreso = new SimpleObjectProperty<LocalDate>(fechaIngreso);
        this.fechaSalida = new SimpleObjectProperty<LocalDate>(fechaSalida);
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
    
    public int getTelefono(){
        return telefono.get();
    }
    
    public void setTelefono(int telefono){
        this.telefono.set(telefono);
    }
    
    public IntegerProperty telefonoProperty(){
        return telefono;
    }
    
    public String getCorreo(){
        return correo.get();
    }
    
    public void setCorreo(String correo){
        this.correo.set(correo);
    }
    
    public StringProperty correoProperty(){
        return correo;
    }
    
    public LocalDate getFechaIngreso(){
        return fechaIngreso.get();
    }
    
    public void setFechaIngreso(LocalDate fechaIngreso){
        this.fechaIngreso.set(fechaIngreso);
    }
    
    public ObjectProperty<LocalDate> fechaIngresoProperty(){
        return fechaIngreso;
    }
    
    public LocalDate getFechaSalida(){
        return fechaSalida.get();
    }
    
    public void setFechaSalida(LocalDate fechaSalida){
        this.fechaSalida.set(fechaSalida);
    }
    
    public ObjectProperty<LocalDate> fechaSalidaProperty(){
        return fechaSalida;
    }
}
