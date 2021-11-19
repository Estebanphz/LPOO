/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab11;
import java.util.Scanner;
import static lab11.Funciones.Serie;
import static lab11.Funciones.conversion;
import static lab11.Funciones.numRandom;
import static lab11.Funciones.suma;
/**
 *
 * @author dell
 */
public class Lab11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        int op;
        System.out.println("\nMenu");
        System.out.println("1. Convertir int a string ");
        System.out.println("2. Suma n números ");
        System.out.println("3. Numeros random ");
        System.out.println("4. Numeros del 1 al 100 ");
        System.out.println("5. Salir ");
        System.out.print("Seleccione opcion: ");
        op = sc.nextInt();
            switch(op){
                case 1:
                    conversion();
                    break;
                        
                case 2:
                    suma();
                    break;
                        
                case 3:
                    numRandom();
                    break;
                        
                case 4:
                    Serie();
                    break;

                case 5: 
                    break;
                }
               
}
    }

