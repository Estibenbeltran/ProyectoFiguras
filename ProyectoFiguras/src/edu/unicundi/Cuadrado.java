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
public class Cuadrado extends Figura {

    public Cuadrado(double coorX1, double coorX2, double coorX3, double coorY1, double coorY2, double coorY3) {
        this.coorX1 = coorX1;
        this.coorX2 = coorX2;
        this.coorX3 = coorX3;
        this.coorY1 = coorY1;
        this.coorY2 = coorY2;
        this.coorY3 = coorY3;
    }

    //metodo heredado de la clase figura
    @Override
    public void coordenadaALados() {
        ladoA = Math.sqrt(Math.pow((coorX2 - coorX1), 2) + Math.pow((coorY2 - coorY1), 2));
    }

    //metodo heredado de la clase figura
    @Override
    public void area() {
        area = ladoA * ladoA;
    }

    //metodo heredado de la clase figura
    @Override
    public void perimetro() {
        perimetro = ladoA * 4;
    }

}
