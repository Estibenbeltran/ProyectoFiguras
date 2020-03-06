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
public abstract class Figura implements IFigura {

    //declaracion de variables
    private double ladoA, ladoB, ladoC, ladoD, altura, area, perimetro;
    private double coorX1, coorX2, coorX3, coorX4, coorY1, coorY2, coorY3, coorY4;
    private String color;
    private double coordenada1, coordenada2, coordenada3, coordenada4;

    public void dibujarFigura() {

    }

    public void color() {

    }

    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public double getLadoC() {
        return ladoC;
    }

    public void setLadoC(double ladoC) {
        this.ladoC = ladoC;
    }

    public double getLadoD() {
        return ladoD;
    }

    public void setLadoD(double ladoD) {
        this.ladoD = ladoD;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCoorX1() {
        return coorX1;
    }

    public void setCoorX1(double coorX1) {
        this.coorX1 = coorX1;
    }

    public double getCoorX2() {
        return coorX2;
    }

    public void setCoorX2(double coorX2) {
        this.coorX2 = coorX2;
    }

    public double getCoorX3() {
        return coorX3;
    }

    public void setCoorX3(double coorX3) {
        this.coorX3 = coorX3;
    }

    public double getCoorX4() {
        return coorX4;
    }

    public void setCoorX4(double coorX4) {
        this.coorX4 = coorX4;
    }

    public double getCoorY1() {
        return coorY1;
    }

    public void setCoorY1(double coorY1) {
        this.coorY1 = coorY1;
    }

    public double getCoorY2() {
        return coorY2;
    }

    public void setCoorY2(double coorY2) {
        this.coorY2 = coorY2;
    }

    public double getCoorY3() {
        return coorY3;
    }

    public void setCoorY3(double coorY3) {
        this.coorY3 = coorY3;
    }

    public double getCoorY4() {
        return coorY4;
    }

    public void setCoorY4(double coorY4) {
        this.coorY4 = coorY4;
    }

    public double getCoordenada1() {
        return coordenada1;
    }

    public void setCoordenada1(double coordenada1) {
        this.coordenada1 = coordenada1;
    }

    public double getCoordenada2() {
        return coordenada2;
    }

    public void setCoordenada2(double coordenada2) {
        this.coordenada2 = coordenada2;
    }

    public double getCoordenada3() {
        return coordenada3;
    }

    public void setCoordenada3(double coordenada3) {
        this.coordenada3 = coordenada3;
    }

    public double getCoordenada4() {
        return coordenada4;
    }

    public void setCoordenada4(double coordenada4) {
        this.coordenada4 = coordenada4;
    }
}
