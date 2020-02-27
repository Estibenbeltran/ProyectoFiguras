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
public class Cuadrado extends Figura{

    public Cuadrado(int ladoA) {
        this.ladoA = ladoA;
    }    
    
    @Override
    public void area(){
        area = ladoA * ladoA;
    }
    
    @Override
    public void perimetro(){
        perimetro = ladoA * 4;
    }
  
}
