/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicundi;

import java.awt.Graphics;

/**
 *
 * @author daiyd
 */
public class Rectangulo extends Figura {

    //metodo constructor para ingresar coordenadas 
    public Rectangulo(double coorX1, double coorX2, double coorX3, double coorX4, double coorY1, double coorY2, double coorY3, double coorY4) {
        this.coorX1 = coorX1;
        this.coorX2 = coorX2;
        this.coorX3 = coorX3;
        this.coorX4 = coorX4;
        this.coorY1 = coorY1;
        this.coorY2 = coorY2;
        this.coorY3 = coorY3;
        this.coorY4 = coorY4;
    }

    public void dibujarFigura(Graphics graficador, int coorX1, int coorX2, int coorX3, int coorX4, int coorY1, int coorY2, int coorY3, int coorY4) {
        int[] xCoordenadas = {coorX1 * 50 + 10, coorX2 * 50 + 10, coorX3 * 50 + 10, coorX4 * 50 + 10};
        int[] yCoordenadas = {510 - coorY1 * 50, 510 - coorY2 * 50, 510 - coorY3 * 50, 510 - coorY4 * 50};
        graficador.fillPolygon(xCoordenadas, yCoordenadas, 4);
    }

    public void dibujarPlano(){
        Graphics g = null;
        for (int i = 10; i < 500; i += 10) {

            g.drawLine(245, i, 255, i);
            g.drawLine(i, 245, i, 255);

        }
    }
    //metodo heredado de la clase figura
    @Override
    public void coordenadaALados() {
        ladoA = Math.sqrt(Math.pow((coorX2 - coorX1), 2) + Math.pow((coorY2 - coorY1), 2));//calculo de ladoA
        ladoB = Math.sqrt(Math.pow((coorX3 - coorX2), 2) + Math.pow((coorY3 - coorY2), 2));//calculo de ladoB
        ladoC = Math.sqrt(Math.pow((coorX4 - coorX3), 2) + Math.pow((coorY4 - coorY3), 2));//calculo de ladoC
        ladoD = Math.sqrt(Math.pow((coorX4 - coorX1), 2) + Math.pow((coorY4 - coorY1), 2));//calculo de ladoD
    }

    //metodo heredado de la clase figura
    @Override
    public void area() {
        area = ladoA * ladoB;
    }

    //metodo heredado de la clase figura
    @Override
    public void perimetro() {
        perimetro = ladoA * 2 + ladoB * 2;
    }

}
