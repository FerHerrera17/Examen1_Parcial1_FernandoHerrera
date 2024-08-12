/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1_parcial1_fernandoherrera;


import java.util.Date;
/**
 *
 * @author herre
 */
public abstract class Barco {
    private final String nombre;
    private final Date fechaCirculacion;

    public Barco(String nombre) {
        this.nombre = nombre;
        this.fechaCirculacion = new Date();
    }
    
    public String getNombre() {
        return nombre;
    }

    public Date getFechaCirculacion() {
        return fechaCirculacion;
    }
    
    public String toString(){
        return nombre;
    }
    
    public abstract void agregarElemento();
    public abstract double vaciarCobrar();
    public abstract double precioElemento();
    
    
    
    
    
}
