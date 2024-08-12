/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1_parcial1_fernandoherrera;

/**
 *
 * @author herre
 */
public enum TipoPesquero {
    PEZ(10.0), CAMARO(20.0), LANGOSTA(30.0);
    
    public final double price;
    
    
    TipoPesquero(double price){
        this.price = price;
    }

    
}
