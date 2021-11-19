/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3;

/**
 *
 * @author dell
 */
public class Calculadora extends DispositivoElectronico implements OperacionesAritmeticas{

    @Override
    public int suma(int a, int b) {

        return a + b;
    }

    @Override
    public int resta(int a, int b) {
        return a - b;
        }

    @Override
    public void encender() {

        System.out.println("Calculadora encendida");
    }

    @Override
    public String apagar() {

        return "Calculadora apagada";
    }
    
}
