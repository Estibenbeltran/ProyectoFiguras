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
public class Triangulo extends Figura{
    
    double areaTrian, areaTrianRec, areaTrianEqui, perimetroTrian, perimetroTrianRec, perimetroTrianEqui;
    double coorX1,coorX2,coorX3,coorY1,coorY2,coorY3;
    
    public Triangulo(double coorX1, double coorX2, double coorX3, double coorY1, double coorY2, double coorY3) {
        this.coorX1 = coorX1;
        this.coorX2 = coorX2;
        this.coorX3 = coorX3;
        this.coorY1 = coorY1;
        this.coorY2 = coorY2;
        this.coorY3 = coorY3;
    }

    @Override
    public void area() {
        areaTrian = Math.abs(coorX1 * (coorY2 - coorY3) + coorX2 * (coorY3 - coorY1) + coorX3 * (coorY1 - coorY2))   / 2;
        areaTrianEqui = Math.pow(ladoA, 2) * Math.sqrt(3) / 4;
        areaTrianRec = ladoA * ladoB / 2;
    }

    @Override
    public void perimetro() {
        perimetroTrian = ladoA + ladoB + ladoC;
        perimetroTrianEqui = ladoA * 3;
        perimetroTrianRec = ladoA + ladoB + ladoC;;
    }
    
}
