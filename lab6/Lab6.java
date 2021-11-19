/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author dell
 */
public class Lab6 {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Coche> coches = new ArrayList();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    leerCoches();
        System.out.println("\nCoches introducidos:");
        mostrarCoches();
        mostrarPorMarca();
        mostrarPorKm();
        System.out.println("\nCoche con mayor número de Km: " + mostrarMayorKm());                                
        System.out.println("\nCoches ordenados de menor a mayor número de Km");
        mostrarOrdenadosPorKm();
}
public static void leerCoches(){
 
        //Declaración de variables para leer los datos de los coches
        String matricula, marca, modelo
        int Km,Coche aux, i, N;
  
        //se pide por teclado el número de coches a leer
        do {
            System.out.print("Número de coches? ");
            N = sc.nextInt();
        } while (N < 0);
        sc.nextLine(); //limpiar el intro
  
        //lectura de N coches
        for (i = 1; i <= N; i++) {
            //leer datos de cada coche
            System.out.println("Coche " + i);
            System.out.print("Matrícula: ");
            matricula = sc.nextLine();          
            System.out.print("Marca: ");
            marca = sc.nextLine();
            System.out.print("Modelo: ");
            modelo = sc.nextLine();
            System.out.print("Número de Kilómetros: ");
            Km = sc.nextInt();
            sc.nextLine(); //limpiar el intro
   
            aux = new Coche(); //Se crea un objeto Coche y se asigna su referencia a aux                          
   
            //se asignan valores a los atributos del nuevo objeto
            aux.setMatricula(matricula);
            aux.setMarca(marca);
            aux.setModelo(modelo);
            aux.setKm(Km);
                      
            //se añade el objeto al final del array
            coches.add(aux);
        }
    }//fin método leerCoches()

//Método para mostrar todos los coches   
    public static void mostrarCoches(){      
        for(int i = 0; i< coches.size(); i++)
            System.out.println(coches.get(i));  //se invoca el método toString de la clase Coche                  
    }
    //Método para mostrar todos los coches de una marca que se pide por teclado                                   
    public static void mostrarPorMarca(){
        String marca;
        System.out.print("Introduce marca: ");
        marca = sc.nextLine();
        System.out.println("Coches de la marca " + marca);
        for(int i = 0; i < coches.size(); i++){
            if(coches.get(i).getMarca().equalsIgnoreCase(marca))
                System.out.println(coches.get(i));
        }
    }
    //Método para mostrar todos los coches con un número de Km inferior                                           
    //al número de Km que se pide por teclado
    public static void mostrarPorKm(){
        int Km;
        System.out.print("Introduce número de kilómetros: ");
        Km = sc.nextInt();
        System.out.println("Coches con menos de " + Km + " Km");
        for(int i = 0; i < coches.size(); i++){
            if(coches.get(i).getKm() < Km)
                System.out.println(coches.get(i));
        }
    }
    //Método que devuelve el Coche con mayor número de Km                                                         
    public static Coche mostrarMayorKm(){
        Coche mayor = coches.get(0);
        for(int i = 0; i < coches.size(); i++){
            if(coches.get(i).getKm() > mayor.getKm())
                mayor = coches.get(i);
        }
        return mayor;
    }
    //Método que muestra los coches ordenados por número de Km de menor a mayor                                   
    public static void mostrarOrdenadosPorKm(){
        int i, j;
        Coche aux;
        for(i = 0; i < coches.size()-1; i++)
            for(j=0; j < coches.size()-i-1; j++)
                if(coches.get(j+1).getKm() < coches.get(j).getKm()){
                    aux = coches.get(j+1);
                    coches.set(j+1, coches.get(j));
                    coches.set(j, aux);                
                }
        mostrarCoches();
    }
}//fin de la clase principal