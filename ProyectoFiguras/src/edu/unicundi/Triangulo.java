package edu.unicundi;

//Clase triángulo que contiene métodos y atributos que heredan de la clase Figura, que es la clase padre

import java.awt.Graphics;
import java.text.DecimalFormat;

public class Triangulo extends Figura{
    DecimalFormat formato = new DecimalFormat("#.000");
    String difTriangulo;
    double perimetroTriangulo;
    //constructor de la clase, el cuál recibe las 6 coordenadas del triángulo
    public Triangulo(double coorX1, double coorX2, double coorX3, double coorY1, double coorY2, double coorY3) {
        this.coorX1 = coorX1;
        this.coorX2 = coorX2;
        this.coorX3 = coorX3;
        this.coorY1 = coorY1;
        this.coorY2 = coorY2;
        this.coorY3 = coorY3;
    }
    
   
    public void dibujarFigura(Graphics graficador, int coorX1, int coorX2, int coorX3, int coorY1, int coorY2, int coorY3){
        
         for (int i = 10; i < 500; i += 10) {

            graficador.drawLine(245, i, 255, i);
            graficador.drawLine(i, 245, i, 255);
        }
         
        int[] xCoordenadas = {coorX1 * 50 + 10, coorX2 * 50 + 10, coorX3 * 50 + 10};
        int[] yCoordenadas = {510 - coorY1 * 50, 510 - coorY2 * 50, 510 - coorY3 * 50};
        graficador.fillPolygon(xCoordenadas, yCoordenadas, 3);
    }
    
    //método para hallar el perimetro del tríangulo
    @Override
    public void perimetro() {
        //para hallar el ára del triángulo, primero se deben calcular las tres longitudes
        ladoA = Math.sqrt(Math.pow(coorX2 - coorX1, 2) + Math.pow(coorY2 - coorY1, 2));
        ladoB = Math.sqrt(Math.pow(coorX3 - coorX2, 2) + Math.pow(coorY3 - coorY2, 2));
        ladoC = Math.sqrt(Math.pow(coorX3 - coorX1, 2) + Math.pow(coorY3 - coorY1, 2));
        
        //el perímetro del triángulo es la suma de sus tres magnitudes
        perimetro = ladoA + ladoB + ladoC;
        System.out.println("perimetro: "+ formato.format(perimetro) +" ladoA: "+ formato.format(ladoA) +" ladoB: "+ formato.format(ladoB) +" ladoC: "+ formato.format(ladoC));
    }
    
    //método para hallar el área del tríangulo
    @Override
    public void area() {
        //para aplicar la fórmula de Heron, hay que dividir el perímetro anteriormente encontrado en dos
        perimetroTriangulo = perimetro/2; 
        
        //se aplica la fórmula de Heron
        area = Math.sqrt(perimetroTriangulo * (perimetroTriangulo - ladoA) * (perimetroTriangulo - ladoB) * (perimetroTriangulo - ladoC));
        System.out.println("perimetro/2: " +formato.format(perimetroTriangulo) + " area: " + formato.format(area));
   }
    
    public void difTriangulos(){
        if(ladoA == ladoB && ladoB != ladoC || ladoA == ladoC && ladoC != ladoA || ladoB == ladoC && ladoC != ladoA  ){
            difTriangulo = "triangulo isosceles";
        }else if(ladoA == ladoB && ladoB == ladoC && ladoA == ladoC){
            difTriangulo = "triangulo equilatero";
        }else difTriangulo = "triangulo Escaleno";
    }
}
