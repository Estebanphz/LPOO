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
public class Radio extends DispositivoElectronico implements IFunciones{

    @Override
    public void encender() {
        System.out.println("Radio encendido");
    }

    @Override
    public String apagar() {
        return "Radio apagado";
    }

    @Override
    public String cambioCanal() {
        return "Radio cambio de canal";
    }

    @Override
    public void cambioVolumen() {
        System.out.println("Cambio de volumen");
    }
    
}
