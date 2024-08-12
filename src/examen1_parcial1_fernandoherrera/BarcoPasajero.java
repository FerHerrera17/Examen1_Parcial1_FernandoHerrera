/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1_parcial1_fernandoherrera;

import java.util.Scanner;

/**
 *
 * @author herre
 */
public final class BarcoPasajero  extends Barco{
    private final String[] pasajeros;
    private final double precioBoleto;
    private int cont_pasajeros;
    
    public BarcoPasajero(String nombre, int maximo_pasajeros, double precioBoleto){
        super(nombre);
        this.pasajeros = new String[maximo_pasajeros];
        this.precioBoleto = precioBoleto;
        this.cont_pasajeros = 0;
    }

    @Override
    public void agregarElemento() {
        if (cont_pasajeros < pasajeros.length){
            Scanner read = new Scanner (System.in);
            System.out.println("Ingrese su nombre pasajero: ");
            pasajeros[cont_pasajeros] = read.nextLine();
            cont_pasajeros++;
        }
        else {
            System.out.println("El barco se encuentra lleno, no hay mas espacio");
        }
    }    

    @Override
    public double vaciarCobrar() {
        double pasaje_total = cont_pasajeros * precioBoleto;
        cont_pasajeros = 0;
        return pasaje_total;
    }    

    @Override
    public double precioElemento() {
        return precioBoleto;
    }
    
    public String toString(){
        return super.toString() + "\n Cantidad de pasajeros que compraron boletos: " + cont_pasajeros;
    }
    
    private void listarPasajerosBarco(int num){
        if (num < cont_pasajeros){
            System.out.println(pasajeros[num]);
            listarPasajerosBarco(num+1);
        }
        
    }
}
