/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miBiblioteca.Principal;

import javax.swing.JOptionPane;
import miBiblioteca.Clases.Venta;

/**
 *
 * @author Sketcher
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opc=1,c=0;
        String turno, dSemana, r;
        int ct;
        double tmanana=0,ttarde=0,tnoche=0;
        
        Venta [] tVentas = new Venta[50];
        Venta nVenta = new Venta();
        String [] opc1 = new String[3];
        opc1[0]="MANANA";
        opc1[1]="TARDE";
        opc1[2]="NOCHE";
        String [] opc2 = new String[7];
        opc2[0]="LUNES";
        opc2[1]="MARTES";
        opc2[2]="MIERCOLES";
        opc2[3]="JUEVES";
        opc2[4]="VIERNES";
        opc2[5]="SABADO";
        opc2[6]="DOMINGO";
        
        JOptionPane.showMessageDialog(null, "Bienvenido a sistema de ventas");
        do {
            
            JOptionPane.showMessageDialog(null, "Agregue una venta");
            dSemana =(String) JOptionPane.showInputDialog(null, "Seleccione Dia de la semana", "VENTAS", JOptionPane.DEFAULT_OPTION, null, opc2, opc2[0]);
            turno =(String) JOptionPane.showInputDialog(null, "Seleccione Turno", "VENTAS", JOptionPane.DEFAULT_OPTION, null, opc1, opc1[0]);
            ct= Integer.parseInt( JOptionPane.showInputDialog(null, "Escriba la cantidad de pasajes", "Ventas", JOptionPane.DEFAULT_OPTION));
             
            tVentas[c]=new Venta(ct,turno,dSemana);
            
            int resp = JOptionPane.showConfirmDialog(null, "Venta agregada: "+tVentas[c].getPrecio()+ "\nDesea agregar otra venta?", "Ventas", JOptionPane.YES_NO_OPTION);
            
            
            if (resp==0){
                opc=1;
                c++;
            }else{
                opc=0;
            }
        }while (opc==1);
        
        for(int i=0;i<=c;i++){
            switch(tVentas[i].getTurno()){
                case "MANANA":
                    tmanana+=tVentas[i].getPrecio();
                    break;
                case "TARDE":
                    ttarde+=tVentas[i].getPrecio();
                    break;
                case "NOCHE":
                    tnoche+=tVentas[i].getPrecio();
            }
        }
        r="Ventas de la Mañana= "+tmanana+"\nVentas de la tarde= "+ttarde+"\nVentas de la noche= "+tnoche;
        JOptionPane.showMessageDialog(null, r);
        
    }
    
}
