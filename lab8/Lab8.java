/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author dell
 */
public class Lab8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Se ejecuta dos veces el programa una vez para crearlo y despues para poder escribir sobre el
        String nombre;
        File miArchivo; //manipular archivo
        PrintWriter escribir; //escribir archivo
        miArchivo = new File("ArchivoPractica8.txt");
        if(!miArchivo.exists()){
        System.out.println("Archivo creado");
            try {
                miArchivo.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(Lab8.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            System.out.println("El archivo ya existe");
            try {
                escribir = new PrintWriter(miArchivo, "utf-8");
                nombre = JOptionPane.showInputDialog(null, "Ingresa tu nombre: ");
                escribir.println("Bienvenido " + nombre + " a mi archivo para la practica 8");
                System.out.println("Bienvenido " + nombre + " a mi archivo para la practica 8");
                escribir.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            
            
        }
    }
    
}
