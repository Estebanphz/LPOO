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
public class Automovil {
    private enum MarcaVehiculo{FORD,TOYOTA,SUZUKI,RENAULT,SEAT};
    private String matricula;
    private MarcaVehiculo marca;
   
    public Automovil(){
        matricula = "";
        marca = null;
    }
   
    public void setMatricula(String datoMatricula){
        matricula = datoMatricula;
    }
   
    public void setMarca(String datoMarca){
        switch(datoMarca){
            case "Ford":
            case "ford":
                marca = MarcaVehiculo.FORD;
            break;
            case "Toyota":
            case "toyota":
                marca = MarcaVehiculo.TOYOTA;
            break;
            case "Suzuki":
            case "suzuki":
                marca = MarcaVehiculo.SUZUKI;
            break;
            case "Renault":
            case "renault":
                marca = MarcaVehiculo.RENAULT;
            break;
            case "Seat":
            case "seat":
                marca = MarcaVehiculo.SEAT;
            break;
            default:
                System.out.println("Marca de automovil no registrado");
            break;
        }
    }
   
    public String getMatricula(){
        return matricula;
    }
   
    public String getMarca(){
        return marca.toString().toLowerCase();
    }
}
