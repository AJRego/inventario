package com.ajrego.inventario.model.domain;

<<<<<<< HEAD
public class Factura {
   
=======
import java.time.LocalDate;
import javafx.beans.property.FloatProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleFloatProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Factura {
    private final IntegerProperty ID;
    private final ObjectProperty<LocalDate> fecha;
    private final IntegerProperty clienteID;
    private final FloatProperty total;
    private final StringProperty estado;
    private final StringProperty QR;
    
    public Factura(){
        this.ID = new SimpleIntegerProperty();
        this.fecha = new SimpleObjectProperty<LocalDate>();
        this.clienteID = new SimpleIntegerProperty();
        this.total = new SimpleFloatProperty();
        this.estado = new SimpleStringProperty();
        this.QR = new SimpleStringProperty();
    }
    
    public Factura(int ID, LocalDate fecha, int clienteID, float total, String estado, String QR){
        this.ID = new SimpleIntegerProperty(ID);
        this.fecha = new SimpleObjectProperty<LocalDate>(fecha);
        this.clienteID = new SimpleIntegerProperty(clienteID);
        this.total = new SimpleFloatProperty(total);
        this.estado = new SimpleStringProperty(estado);
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
    
    public LocalDate getFecha(){
        return fecha.get();
    }
    
    public void setFecha(LocalDate fecha){
        this.fecha.set(fecha);
    }
    
    public ObjectProperty<LocalDate> fechaProperty(){
        return fecha;
    }
    
    public int getClienteID(){
        return clienteID.get();
    }
    
    public void setClienteID(int clienteID){
        this.clienteID.set(clienteID);
    }
    
    public IntegerProperty clienteIDProperty(){
        return clienteID;
    }
    
    public Float getTotal(){
        return total.get();
    }
    
    public void setTotal(float total){
        this.total.set(total);
    }
    
    public FloatProperty totalProperty(){
        return total;
    }
    
    public String getEstado(){
        return estado.get();
    }
    
    public void setEstado(String estado){
        this.estado.set(estado);
    }
    
    public StringProperty estadoProperty(){
        return estado;
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
>>>>>>> b6887030ae5bd0ac9461c74b00fabcea8caae891
}
