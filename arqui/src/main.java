
import Controlador.controlador;
import Modelo.OperacionesBinarios;
import vista.principal;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chris
 */
public class main {
    public static void main(String[] args) {
        principal view = new principal();
        view.setVisible(true);
        OperacionesBinarios op=new OperacionesBinarios();
        controlador ctrl=new controlador(view,op);
        ctrl.iniciar();
    }
}
