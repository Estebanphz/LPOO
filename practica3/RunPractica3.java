/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class RunPractica3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj = new Scanner(System.in);
        String marcaR, modeloR, marcaT, modeloT, marcaC, modeloC;
        
        System.out.println("Marca de la television: ");
        marcaT = obj.nextLine();
        System.out.println("Modelo de la television: ");
        modeloT = obj.nextLine();
        System.out.println("Marca del radio: ");
        marcaR = obj.nextLine();
        System.out.println("Modelo de la radio: ");
        modeloR = obj.nextLine();
        System.out.println("Marca de la calculadora: ");
        marcaC = obj.nextLine();
        System.out.println("Modelo de la calculadora: ");
        modeloC = obj.nextLine();
        
        
        Television tvSony = new Television();
        Radio rd = new Radio();
        Calculadora casio = new Calculadora();
        
        System.out.println("\nMarca de television: " + marcaT);
        System.out.println("Modelo de television: " + modeloT);
        tvSony.encender();
        tvSony.apagar();
        
        System.out.println("\nMarca de radio: " + marcaR);
        System.out.println("Marca de radio: " + modeloR);
        rd.encender();
        rd.cambioCanal();
        rd.cambioVolumen();
        
        System.out.println("\nMarca de calculadora: " + marcaC);
        System.out.println("Marca de calculadora: " + modeloC);
        System.out.println("La suma es: " + casio.suma(2, 2));
    }
    
}
