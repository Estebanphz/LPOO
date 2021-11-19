/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

/**
 *
 * @author dell
 */

//Clase Cuenta
public class Cuenta {
    private String nomCliente;
    private String numCuenta;
    private double Tinteres;
    private double saldo;
    
    //Constructor por defecto
    public Cuenta(){
    }
    
    //Constructor con parámetros
    public Cuenta(String nomCliente, String numCuenta, double Tinteres, double saldo){
        this.nomCliente = nomCliente;
        this.numCuenta = numCuenta;
        this.Tinteres = Tinteres;
        this.saldo = saldo;
    }
    
    //Constructor copia
    public Cuenta(Cuenta objCuenta){
        this.nomCliente = objCuenta.nomCliente;
        this.numCuenta = objCuenta.numCuenta;
        this.Tinteres = objCuenta.Tinteres;
        this.saldo = objCuenta.saldo;
    }

    /**
     * @return the Tinteres
     */
    
    //Getters y Setters
    public double getTinteres() {
        return Tinteres;
    }

    /**
     * @param Tinteres the Tinteres to set
     */
    public void setTinteres(double Tinteres) {
        this.Tinteres = Tinteres;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the nomCliente
     */
    public String getNomCliente() {
        return nomCliente;
    }

    /**
     * @param nomCliente the nomCliente to set
     */
    public void setNomCliente(String nomCliente) {
        this.nomCliente = nomCliente;
    }

    /**
     * @return the numCuenta
     */
    public String getNumCuenta() {
        return numCuenta;
    }

    /**
     * @param numCuenta the numCuenta to set
     */
    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    //Método Deposito
    public boolean deposito(double cnt){
        boolean depositoDone = true;
        if(cnt < 0){
            depositoDone = false;
        }
        else{
            this.saldo = this.saldo + cnt;
        }
        return depositoDone;
    }
    
    //Método Retiro
    public boolean retiro(double cnt) {
        boolean retiroDone = true;                                                                         
        if (cnt < 0) {
            retiroDone = false;
        } else if (saldo >= cnt) {
            saldo -= cnt;
        } else {
            retiroDone = false;
        }
        return retiroDone;
    }

    //Método Transferencia
    public boolean transferencia(Cuenta Destino, double cnt) {
        boolean Done = true;
        if (cnt < 0) {
            Done = false;
        } else if (saldo >= cnt) {
            retiro(cnt);
            Destino.deposito(cnt);
        } else {
            Done = false;
        }
        return Done;
    }
}
