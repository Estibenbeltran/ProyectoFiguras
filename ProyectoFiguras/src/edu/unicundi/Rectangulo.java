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

    //metodo heredado de la clase figura
    @Override
    public void coordenadaALados() {
        ladoA = Math.sqrt(Math.pow((coorX2 - coorX1), 2) + Math.pow((coorY2 - coorY1), 2));//calculo de ladoA
        ladoB = Math.sqrt(Math.pow((coorX3 - coorX2), 2) + Math.pow((coorY3 - coorY2), 2));//calculo de ladoB
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
