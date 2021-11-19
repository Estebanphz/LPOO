/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;
import java.util.Scanner;

/**
 *
 * @author dell
 */
public class Practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
    String nom, num;
    double tipo, imp;

 //Se crea cta sin parámetros
 //Se ejecuta el constructor por defecto
    Cuenta cta = new Cuenta();

    System.out.print("Nombre : ");
    nom = sc.nextLine();
    System.out.print("Número de cuenta : ");
    num = sc.nextLine();
    System.out.print("Tipo de interes : ");
    tipo = sc.nextDouble();
    System.out.print("Saldo: ");
    imp = sc.nextDouble();

    cta.setNomCliente(nom);
    cta.setNumCuenta(num);
    cta.setTinteres(tipo);
    cta.setSaldo(imp);
    
    //Se crea cta2 con los valores leidos por teclado
    //Se ejecuta el constructor con parámetros
    Cuenta cta2 = new Cuenta("Esteban Uriel Pérez Hernández", "ABC123", .10, 5000.39);                       

    //se crea cta3 como copia de cta
    //se ejecuta el constructor copia
    Cuenta cta3 = new Cuenta(cta);

    //mostrar los datos de cta
    System.out.println("Datos de la cuenta 1");
    System.out.println("Nombre del titular: " + cta.getNomCliente());
    System.out.println("Número de cuenta: " + cta.getNumCuenta());
    System.out.println("Tipo de interés: " + cta.getTinteres());
    System.out.println("Saldo: " + cta.getSaldo());
    System.out.println();
       
    //se realiza un deposito en cta
    cta.deposito(1000);
     
    //mostrar el saldo de cuenta1 después del ingreso
    System.out.println("Saldo: " + cta.getSaldo());
     
    //mostrar los datos de cta2
    System.out.println("Datos de la cuenta 2");
    System.out.println("Nombre del titular: " + cta2.getNomCliente());
    System.out.println("Número de cuenta: " + cta2.getNumCuenta());
    System.out.println("Tipo de interés: " + cta2.getTinteres());
    System.out.println("Saldo: " + cta2.getSaldo());
    System.out.println();
     
    //mostrar los datos de cta3
    System.out.println("Datos de la cuenta 3");
    System.out.println("Nombre del titular: " + cta3.getNomCliente());
    System.out.println("Número de cuenta: " + cta3.getNumCuenta());                                         
    System.out.println("Tipo de interés: " + cta3.getTinteres());
    System.out.println("Saldo: " + cta3.getSaldo());
    System.out.println();
     
    //Transferencia de 500 desde cta3 a cta2
    cta3.transferencia(cta2, 500);
     
    //mostrar el saldo de cta2
    System.out.println("Saldo de la cuenta 2");
    System.out.println("Saldo: " + cta2.getSaldo());
    System.out.println();
     
    //mostrar el saldo de cta3
    System.out.println("Saldo de la cuenta 3");
    System.out.println("Saldo: " + cta3.getSaldo());
    System.out.println();
    }
    
}
