/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.OperacionesBinarios;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author chris
 */
public class controlador implements ActionListener{
//private final principal view;
    private final OperacionesBinarios model;
    private int[] Q=new int[8];
    private int[] M=new int[8];
    private String salida="";
    private DefaultTableModel tablaDatos;
    
    public controlador(OperacionesBinarios model){
        this.model=model;
    }
     public void inicarTabla(){
        String data[][]={};
        String col[]={"#Inventario","Indentificación","Fecha Garantía","Departamento"};
        tablaDatos= new DefaultTableModel(data,col);
        
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
     public void arranca(String num,int [] arreglo){
        int a=Integer.valueOf(num);
        model.binary(a,arreglo);
    }
    
}
