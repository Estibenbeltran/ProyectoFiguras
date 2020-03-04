package edu.unicundi;

//Clase triángulo que contiene métodos y atributos que heredan de la clase Figura, que es la clase padre

import java.awt.Graphics;

public class Triangulo extends Figura{
    
    //variables para clacular el area, el perímetro y demás
    double areaTrian, areaTrianRec, areaTrianEqui, perimetroTrian, perimetroTrianRec, perimetroTrianEqui;
    double longitud1, longitud2, longitud3, perimetroTriangulo;
    
    //constructor de la clase, el cuál recibe las 6 coordenadas del triángulo
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
    
   
    public void dibujarFigura(Graphics graficador, int coorX1, int coorX2, int coorX3, int coorY1, int coorY2, int coorY3){
        int[] xCoordenadas = {coorX1 * 50 + 10, coorX2 * 50 + 10, coorX3 * 50 + 10};
        int[] yCoordenadas = {510 - coorY1 * 50, 510 - coorY2 * 50, 510 - coorY3 * 50};
        graficador.fillPolygon(xCoordenadas, yCoordenadas, 3);
    }
    
    //método para hallar el área del tríangulo
    @Override
    public void area() {
        
        //para hallar el ára del triángulo, primero se deben calcular las tres longitudes
        longitud1 = Math.sqrt(Math.pow(coorX2 - coorX1, 2) + Math.pow(coorY2 - coorY1, 2));
        longitud2 = Math.sqrt(Math.pow(coorX3 - coorX2, 2) + Math.pow(coorY3 - coorY2, 2));
        longitud3 = Math.sqrt(Math.pow(coorX3 - coorX1, 2) + Math.pow(coorY3 - coorY1, 2));
        
        //el perímetro del triángulo es la suma de sus tres magnitudes
        perimetroTrian = longitud1 + longitud2 + longitud3;
        
        //para aplicar la fórmula de Heron, hay que dividir el perímetro anteriormente encontrado en dos
        perimetroTriangulo = perimetroTrian/2; 
        
        //se aplica la fórmula de Heron
        areaTrian = Math.sqrt(perimetroTriangulo *(perimetroTriangulo - longitud1)*(perimetroTriangulo - longitud2)*(perimetroTriangulo - longitud3));
       
    }
}
