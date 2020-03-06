package edu.unicundi;

//Clase triángulo que contiene métodos y atributos que heredan de la clase Figura, que es la clase padre
import java.awt.Color;
import java.awt.Graphics;
import java.text.DecimalFormat;

public class Triangulo extends Figura {
    
    DecimalFormat formato = new DecimalFormat("#.000");
    double perimetroTriangulo;

    //constructor de la clase, el cuál recibe las 6 coordenadas del triángulo
    public Triangulo(double coorX1, double coorX2, double coorX3, double coorY1, double coorY2, double coorY3) {
        super.setCoorX1(coorX1);
        super.setCoorX2(coorX2);
        super.setCoorX3(coorX3);
        super.setCoorY1(coorY1);
        super.setCoorY2(coorY2);
        super.setCoorY3(coorY3);
    }

    public void dibujarFigura(Graphics graficador, int coorX1, int coorX2, int coorX3, int coorY1, int coorY2, int coorY3, String color) {
        System.out.println(color);
        switch (color) {
            case "Azul":
                graficador.setColor(Color.BLUE);
                break;
            case "Rojo":
                graficador.setColor(Color.RED);
                break;
            case "Amarillo":
                graficador.setColor(Color.YELLOW);
                break;
            case "Verde":
                graficador.setColor(Color.GREEN);
                break;
        }    
        
        for (int i = 10; i < 500; i += 10) {
            
            graficador.drawLine(245, i, 255, i);
            graficador.drawLine(i, 245, i, 255);
        }
        
        int[] xCoordenadas = {coorX1 * 50 + 250, coorX2 * 50 + 250, coorX3 * 50 + 250};
        int[] yCoordenadas = {250 - coorY1 * 50, 250 - coorY2 * 50, 250 - coorY3 * 50};
        graficador.fillPolygon(xCoordenadas, yCoordenadas, 3);
    }
    
    @Override
    public void coordenadaALados() {
        //para hallar el area del triángulo, primero se deben calcular las tres longitudes
        setLadoA(Math.sqrt(Math.pow((getCoorX2() - getCoorX1()), 2) + Math.pow((getCoorY2() - getCoorY1()), 2)));//calculo de ladoA
        setLadoB(Math.sqrt(Math.pow((getCoorX3() - getCoorX2()), 2) + Math.pow((getCoorY3() - getCoorY2()), 2)));//calculo de ladoB
        setLadoC(Math.sqrt(Math.pow((getCoorX3() - getCoorX1()), 2) + Math.pow((getCoorY3() - getCoorY1()), 2)));//calculo de ladoC
    }

    //método para hallar el perimetro del tríangulo
    @Override
    public void perimetro() {
        //el perímetro del triángulo es la suma de sus tres magnitudes
        setPerimetro(getLadoA() + getLadoB() + getLadoC());
        //System.out.println("perimetro: " + formato.format(getPerimetro()) + " ladoA: " + formato.format(getLadoA()) + " ladoB: " + formato.format(getLadoB()) + " ladoC: " + formato.format(getLadoC()));
    }

    //método para hallar el área del tríangulo
    @Override
    public void area() {
        //para aplicar la fórmula de Heron, hay que dividir el perímetro anteriormente encontrado en dos
        perimetroTriangulo = getPerimetro() / 2;

        //se aplica la fórmula de Heron
        setArea(Math.sqrt(perimetroTriangulo * (perimetroTriangulo - getLadoA()) * (perimetroTriangulo - getLadoB()) * (perimetroTriangulo - getLadoC())));
        //System.out.println("perimetro/2: " + formato.format(perimetroTriangulo) + " area: " + formato.format(getArea()));
    }
    
    public void difTriangulos() {
        if (getLadoA() == getLadoB() && getLadoB() != getLadoC() || getLadoA() == getLadoC() && getLadoC() != getLadoB() || getLadoB() == getLadoC() && getLadoC() != getLadoA()) {
            setDifTriangulo("triangulo isosceles");
        } else if (getLadoA() == getLadoB() && getLadoB() == getLadoC() && getLadoA() == getLadoC()) {
            setDifTriangulo("triangulo equilatero");
        } else {
            setDifTriangulo("triangulo Escaleno");
        }
    }
    
}
