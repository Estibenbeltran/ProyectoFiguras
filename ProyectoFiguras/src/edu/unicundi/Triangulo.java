package edu.unicundi;

public class Triangulo extends Figura {

    double areaTrian, areaTrianRec, areaTrianEqui, perimetroTrian, perimetroTrianRec, perimetroTrianEqui;
    double longitud1, longitud2, longitud3, s;

    //metodo constructor para ingresar coordenadas 
    public Triangulo(double coorX1, double coorX2, double coorX3, double coorY1, double coorY2, double coorY3) {
        this.coorX1 = coorX1;
        this.coorX2 = coorX2;
        this.coorX3 = coorX3;
        this.coorY1 = coorY1;
        this.coorY2 = coorY2;
        this.coorY3 = coorY3;
        this.longitud1 = longitud1;
        this.longitud2 = longitud2;
        this.longitud3 = longitud3;
    }

    //metodo heredado de la clase figura
    @Override
    public void area() {
        longitud1 = Math.sqrt(Math.pow(coorX2 - coorX1, 2) + Math.pow(coorY2 - coorY1, 2));
        longitud2 = Math.sqrt(Math.pow(coorX3 - coorX2, 2) + Math.pow(coorY3 - coorY2, 2));
        longitud3 = Math.sqrt(Math.pow(coorX3 - coorX1, 2) + Math.pow(coorY3 - coorY1, 2));

        perimetroTrian = longitud1 + longitud2 + longitud3;
        s = perimetroTrian / 2; //perímetro 
        areaTrian = Math.sqrt(s * (s - longitud1) * (s - longitud2) * (s - longitud3));
        //areaTrian = Math.abs(coorX1 * (coorY2 - coorY3) + coorX2 * (coorY3 - coorY1) + coorX3 * (coorY1 - coorY2))   / 2;
        areaTrianEqui = Math.pow(ladoA, 2) * Math.sqrt(3) / 4;
        areaTrianRec = ladoA * ladoB / 2;
    }
}
