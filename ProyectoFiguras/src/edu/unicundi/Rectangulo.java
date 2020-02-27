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
public class Rectangulo extends Figura{
    
    public Rectangulo(int ladoA, int ladoB ){
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }
    
    @Override
    public void area(){
        area = ladoA * ladoB;
    }
    
    @Override
    public void perimetro(){
        perimetro = ladoA * 2 + ladoB * 2;
    }
 
}
