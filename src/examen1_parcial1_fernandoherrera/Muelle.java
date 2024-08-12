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
        System.out.println("5. Salir");
        
        int op = read.nextInt();
        
        switch (op){
            case 1:
                System.out.println("Que tipo de barco desea agregar? (PESQUERO/PASAJERO)");
                String nom_barco = read.nextLine().toUpperCase();
                agregarBarco(nom_barco);
                break;
            case 2:
                System.out.println("Ingrese el nombre del barco: ");
                String nombre = read.nextLine();
                agregarElemento(nombre);
                break;
            case 3:
                System.out.println("Ingrese el nombre del barco: ");
                nombre = read.nextLine();
                double total = vaciarBarco(nombre);
                System.out.println("Total generado: Lps. " + total);
                break;
            case 4:
                System.out.println("Ingrese el año de referencia: ");
                int año = read.nextInt();
                barcoFecha(año);
                break;
            case 5:
                System.out.println("Nos vemos....");
            default:
                System.out.println("La opcion que ingreso no es valida");
                break;
        }
        
        public void agregarBarco (String nom_barco){
            Scanner read = new Scanner (System.in);
            
            System.out.println("Ingrese nuevamente el nombre del barco: ");
            String nombre = read.nextLine();
            
            for (Barco barco : barcos) {
                if (barco.getNombre().equals(nombre)){
                    System.out.println("Ya existe un barco con ese nombre");
                    return;
                }
                else if (tipo.equals("PESQUERO")){
                    
                }
            }
        }
    }

    
}
