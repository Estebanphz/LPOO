/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab11;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author dell
 */
public class Funciones {
    
    public static void conversion() {
        Scanner con = new Scanner (System.in);
        int num;
        System.out.print("Ingrese un numero: ");
        num = con.nextInt();
        System.out.println("El numero " + num + " en cadena de caracteres es: "+String.valueOf(num));
    }
    
    public static void suma() {
        int sum, sfinal = 0, num1;
        Scanner sc = new Scanner (System.in);
        System.out.println("Cantidad de numeros que desea sumar: ");
        sum = sc.nextInt();
        System.out.println("Ingrese el numero: ");
        for (int i = 0; i < sum; i++){
            num1 = sc.nextInt();
            sfinal = num1 + sfinal;
        }
        System.out.println("El resultado es: ");
    }
    
   public static void numRandom() {
    Random dado = new Random();
   int num2;
   for (int i=0; i<30;i++){
    num2 = (dado.nextInt(30-20+1)+20);
    System.out.println(num2);
    }
   }
   
    
    
    public static void Serie(){
    System.out.println("Serie: ");                                                            
         int i=1;
         while(i<=100) {
                   System.out.println(i);                                                                         
                   i++;
         }
    }
}
