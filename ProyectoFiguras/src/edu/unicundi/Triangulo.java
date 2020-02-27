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
    
    public Triangulo(int ladoA, int ladoB, int ladoC, int altura) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
        this.altura = altura;
    }

    @Override
    public void area() {
        areaTrian = ladoA * altura / 2;
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
