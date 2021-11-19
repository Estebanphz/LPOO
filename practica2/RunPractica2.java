/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class RunPractica2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj = new Scanner(System.in);
        String npa, nch, nsi, npe, nperi, nca;
        
        System.out.println("Nombre del Pastor Aleman: ");
        npa = obj.nextLine();
        System.out.println("Nombre del Chihuahua: ");
        nch = obj.nextLine();
        System.out.println("Nombre del Siames: ");
        nsi = obj.nextLine();
        System.out.println("Nombre del Persa: ");
        npe = obj.nextLine();
        System.out.println("Nombre del Perico:");
        nperi = obj.nextLine();
        System.out.println("Nombre del Canario: ");
        nca = obj.nextLine();
        
        System.out.println("\nNombre: " + npa);
        PastorAleman pa = new PastorAleman();
        System.out.println(pa.ladrar());
        System.out.println(pa.comer());
        System.out.println(pa.correr());
        
        System.out.println("\nNombre: " + nch);
        Chihuahua ch = new Chihuahua();
        System.out.println(ch.ladrar());
        System.out.println(ch.comer());
        System.out.println(ch.correr());
        
        System.out.println("\nNombre: " + nsi);
        Siames si = new Siames();
        System.out.println(si.maullar());
        System.out.println(si.comer());
        System.out.println(si.brincar());
        
        System.out.println("\nNombre: " + npe);
        Persa pe = new Persa();
        System.out.println(pe.maullar());
        System.out.println(pe.comer());
        System.out.println(pe.brincar());
        
        System.out.println("\nNombre: " + nperi);
        Perico peri = new Perico();
        System.out.println(peri.cantar());
        System.out.println(peri.comer());
        System.out.println(peri.volar());

        System.out.println("\nNombre: " + nperi);
        Canario ca = new Canario();
        System.out.println(ca.cantar());
        System.out.println(ca.comer());
        System.out.println(ca.volar());
    }
    
}
