package com.ajrego.inventario.model.domain;

import java.time.LocalDate;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Cliente {
    private final IntegerProperty ID;
    private final IntegerProperty cedula;
    private final StringProperty nombre;
    private final IntegerProperty telefono;
    private final StringProperty correo;
    private final StringProperty direccion;
    private final ObjectProperty<LocalDate> fechaIngreso;
    private final ObjectProperty<LocalDate> fechaSalida;
    
    public Cliente(){
        this.ID = new SimpleIntegerProperty();
        this.cedula = new SimpleIntegerProperty();
        this.nombre = new SimpleStringProperty();
        this.telefono = new SimpleIntegerProperty();
        this.correo = new SimpleStringProperty();
        this.direccion = new SimpleStringProperty();
        this.fechaIngreso = new SimpleObjectProperty<LocalDate>();
        this.fechaSalida = new SimpleObjectProperty<LocalDate>();
    }
    
    public Cliente(int ID, int cedula, String nombre, int telefono, String correo, String direccion,
        LocalDate fechaIngreso, LocalDate fechaSalida){
        
        this.ID = new SimpleIntegerProperty(ID);
        this.cedula = new SimpleIntegerProperty(cedula);
        this.nombre = new SimpleStringProperty(nombre);
        this.telefono = new SimpleIntegerProperty(telefono);
        this.correo = new SimpleStringProperty(correo);
        this.direccion = new SimpleStringProperty(direccion);
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
    
    public int getCedula(){
        return cedula.get();
    }
    
    public void setCedula(int cedula){
        this.cedula.set(cedula);
    }
    
    public IntegerProperty cedulaProperty(){
        return cedula;
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
    
    public String getDireccion(){
        return direccion.get();
    }
    
    public void setDireccion(String direccion){
        this.direccion.set(direccion);
    }
    
    public StringProperty direccionProperty(){
        return direccion;
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
