package com.ajrego.inventario.model.domain;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Categoria {
    private final IntegerProperty ID;
    private final StringProperty categoria;
    private final StringProperty descripcion;
    
    public Categoria(){
        this.ID = new SimpleIntegerProperty();
        this.categoria = new SimpleStringProperty();
        this.descripcion = new SimpleStringProperty();
    }
    
    public Categoria(int ID, String categoria, String descripcion){
        this.ID = new SimpleIntegerProperty(ID);
        this.categoria = new SimpleStringProperty(categoria);
        this.descripcion = new SimpleStringProperty(descripcion);
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
    
    public String getCategoria(){
        return categoria.get();
    }
    
    public void setCategoria(String categoria){
        this.categoria.set(categoria);
    }
    
    public StringProperty categoriaProperty(){
        return categoria;
    }
    
    public String getDescripcion(){
        return descripcion.get();
    }
    
    public void setDescripcion(String descripcion){
        this.descripcion.set(descripcion);
    }
    
    public StringProperty descripcionProperty(){
        return descripcion;
    }
}
