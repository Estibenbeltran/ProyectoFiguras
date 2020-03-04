/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicundi;

/**
 *
 * @author daiyd
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //se inicializa el JFrame
        JFrameInicio frame = new JFrameInicio();
        //se hace visible y se le da un tamaño
        frame.setVisible (true);
        frame.setSize(900, 700);
        //se inicializan los páneles
        JPanelCuadrado panelCuadrado = new JPanelCuadrado();
        panelCuadrado.setVisible(true);
        JPanelRectangulo panelRectangulo = new JPanelRectangulo();
        panelRectangulo.setVisible(true);
        JPanelTriangulo panelTriangulo = new JPanelTriangulo();
        panelTriangulo.setVisible(true);
    }
    
}
