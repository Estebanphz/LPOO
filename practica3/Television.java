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
public class Television extends DispositivoElectronico implements IFunciones{

    @Override
    public void encender() {
        System.out.println("Television Enciende");
    }

    @Override
    public String apagar() {
        return "Television Apagado";
        
    }

    @Override
    public String cambioCanal() {
        return "Television cambio de Canal";
        
    }

    @Override
    public void cambioVolumen() {
        System.out.println("Television cambio de volumen");
    }
    
}
