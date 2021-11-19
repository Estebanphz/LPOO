/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author dell
 */
public class Lab9 {

    public void creararchivo(){
       
        File Archivo; //manipular archivo
        PrintWriter escribir; //escribir archivo
        Archivo = new File("ArchivoPractica9.txt");
        if(!Archivo.exists()){
        System.out.println("Archivo creado");
            try {
                Archivo.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(Lab9.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            System.out.println("El archivo ya existe");
            try {
                escribir = new PrintWriter(Archivo, "utf-8");
                escribir.println("Bienvenido a mi archivo para la practica 9");
                escribir.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            
            
        }
    }
        
    }
