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
        super.setCoorX1(coorX1);
        super.setCoorX2(coorX2);
        super.setCoorX3(coorX3);
        super.setCoorX4(coorX4);
        super.setCoorY1(coorY1);
        super.setCoorY2(coorY2);
        super.setCoorY3(coorY3);
        super.setCoorY4(coorY4);
    }

    public void dibujarFigura(Graphics graficador, int coorX1, int coorX2, int coorX3, int coorX4, int coorY1, int coorY2, int coorY3, int coorY4) {

        for (int i = 10; i < 500; i += 10) {

            graficador.drawLine(245, i, 255, i);
            graficador.drawLine(i, 245, i, 255);
        }

        int[] xCoordenadas = {coorX1 * 50 + 260, coorX2 * 50 + 260, coorX3 * 50 + 260, coorX4 * 50 + 260};
        int[] yCoordenadas = {250 - coorY1 * 50, 250 - coorY2 * 50, 250 - coorY3 * 50, 250 - coorY4 * 50};
        graficador.fillPolygon(xCoordenadas, yCoordenadas, 4);
    }

    //metodo heredado de la clase figura
    @Override
    public void coordenadaALados() {
        setLadoA(Math.sqrt(Math.pow((getCoorX2() - getCoorX1()), 2) + Math.pow((getCoorY2() - getCoorY1()), 2)));//calculo de ladoA
        setLadoB(Math.sqrt(Math.pow((getCoorX3() - getCoorX2()), 2) + Math.pow((getCoorY3() - getCoorY2()), 2)));//calculo de ladoB
        setLadoC(Math.sqrt(Math.pow((getCoorX4() - getCoorX3()), 2) + Math.pow((getCoorY4() - getCoorY3()), 2)));//calculo de ladoC
        setLadoD(Math.sqrt(Math.pow((getCoorX4() - getCoorX1()), 2) + Math.pow((getCoorY4() - getCoorY1()), 2)));//calculo de ladoD
    }

    //metodo heredado de la clase figura
    @Override
    public void area() {
        setArea(getLadoA() * getLadoB());
    }

    //metodo heredado de la clase figura
    @Override
    public void perimetro() {
        setPerimetro(getLadoA() * 2 + getLadoB() * 2);
    }

}
