/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10;

/**
 *
 * @author dell
 */
public class Lab10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lcadena leer = new Lcadena();
        Automovil auto = new Automovil();
        String dato;
        System.out.println("Matricula del automovil: ");
        dato = leer.leerCadena();
        auto.setMatricula(dato);
        System.out.println("Marca de carro(Ford,Toyota,Suzuki,Renault,Seat).");
        dato = leer.leerCadena();
        auto.setMarca(dato);
        System.out.printf("El automovil " + auto.getMarca() + " con la matricula " + auto.getMatricula() + ".");
    }
    
}
