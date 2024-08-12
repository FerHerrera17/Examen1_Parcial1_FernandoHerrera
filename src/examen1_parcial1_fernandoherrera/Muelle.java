/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1_parcial1_fernandoherrera;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author herre
 */
public class Muelle {
    private ArrayList<Barco> barcos = new ArrayList<>();
    
    public static void main(String[] args){
        Muelle muelle = new Muelle();
        muelle.menu();
    }
    
    public void menu(){
        Scanner read = new Scanner (System.in);
        
        System.out.println("------MENU------");
        System.out.println("1. Agregar Barco");
        System.out.println("2. Agregar Elemento");
        System.out.println("3. Vaciar Barco");
        System.out.println("4. Lista de Barcos");
        
        int op = read.nextInt();
        
        switch (op){
            case 1:
                System.out.println("Que tipo de barco desea agregar? (PESQUERO/PASAJERO)");
                String nom_barco = read.nextLine().toUpperCase();
                agregarBarco(nom_barco);
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            default:
                break;
                
                
        }
    }

    
}
