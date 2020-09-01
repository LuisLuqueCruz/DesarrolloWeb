/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miBiblioteca.Clases;

/**
 *
 * @author Sketcher
 */
public class Venta {
    private String dSemana;
    private int cantidad;
    private String turno;
    private double precio;

    public String getTurno() {
        return turno;
    }

    public double getPrecio() {
        return precio;
    }
    public Venta(){
        this.cantidad=0;
        this.turno=null;
        this.precio=0.0;
        this.dSemana=null;
    }

    public String getdSemana() {
        return dSemana;
    }
    
    public Venta(int ct, String turno, String dSemana){
        this.cantidad=ct;
        this.turno=turno;
        this.precio=calcularPrecio(turno,ct, dSemana);
    }
    private double calcularPrecio(String turno,int ct, String dSemana){
        double p=0;
        switch(turno){
            case "MANANA":
                p=87.3;
                break;
            case "TARDE":
                p=93.5;
                break;
            case "NOCHE":
                p=74.5;
                
        }
        if (dSemana.equals("SABADO")&&dSemana.equals("DOMINGO")){
            p=p*1;
        }else{
            if(ct>=3&&ct<=5){
                p=p*0.91;                    
            }else if(ct>=6&&ct<=10){
                p=p*0.87;                    
            }else if(ct>=11){
                p=p*0.81;
            }
        }
        
        return p;
    }
    
}
    
    

