/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicundi;

import javax.swing.JPanel;
import java.awt.Graphics;

/**
 *
 * @author daiyd
 */
public class JPanelCuadrado extends javax.swing.JPanel {

    private JPanel jPanel = new JPanel();

    /**
     * Creates new form JPanelCuadrado
     */
    public JPanelCuadrado() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        coordenada1YCuadrado = new javax.swing.JTextField();
        coordenada1XCuadrado = new javax.swing.JTextField();
        coordenada2XCuadrado = new javax.swing.JTextField();
        coordenada2YCuadrado = new javax.swing.JTextField();
        coordenada3XCuadrado = new javax.swing.JTextField();
        coordenada3YCuadrado = new javax.swing.JTextField();
        coordenada4XCuadrado = new javax.swing.JTextField();
        coordenada4YCuadrado = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        botonCalcularCuadrado = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        labelAreaCuadrado = new javax.swing.JLabel();
        labelPerimetroCuadrado = new javax.swing.JLabel();
        jPanelGraficaCuadrado = new javax.swing.JPanel();
        labelValidacionCuadrado = new javax.swing.JLabel();
        botonGuardarCuadrado = new javax.swing.JButton();

        jLabel1.setText("Ingresa las coordenadas");

        jLabel2.setText("coordenadas x");

        jLabel3.setText("coordenadas y");

        coordenada2XCuadrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coordenada2XCuadradoActionPerformed(evt);
            }
        });

        jLabel4.setText("C1");

        jLabel5.setText("C2");

        jLabel6.setText("C3");

        jLabel7.setText("C4");

        botonCalcularCuadrado.setText("Calcular");
        botonCalcularCuadrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCalcularCuadradoActionPerformed(evt);
            }
        });

        jLabel9.setText("El área del cuadrado es:");

        jLabel10.setText("El perímetro del cuadrado es:");

        labelAreaCuadrado.setText("Area");

        labelPerimetroCuadrado.setText("Perimetro");

        jPanelGraficaCuadrado.setPreferredSize(new java.awt.Dimension(400, 400));

        javax.swing.GroupLayout jPanelGraficaCuadradoLayout = new javax.swing.GroupLayout(jPanelGraficaCuadrado);
        jPanelGraficaCuadrado.setLayout(jPanelGraficaCuadradoLayout);
        jPanelGraficaCuadradoLayout.setHorizontalGroup(
            jPanelGraficaCuadradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 531, Short.MAX_VALUE)
        );
        jPanelGraficaCuadradoLayout.setVerticalGroup(
            jPanelGraficaCuadradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        labelValidacionCuadrado.setText("validacion");

        botonGuardarCuadrado.setText("Guardar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(coordenada1XCuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(coordenada2XCuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(coordenada3XCuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(coordenada4XCuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addGap(31, 31, 31)
                                            .addComponent(jLabel7))))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel9))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(labelAreaCuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(labelPerimetroCuadrado)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addGap(18, 18, 18)
                                            .addComponent(coordenada1YCuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(32, 32, 32)
                                            .addComponent(botonCalcularCuadrado)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(botonGuardarCuadrado)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(coordenada2YCuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(coordenada3YCuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(coordenada4YCuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(55, 55, 55))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(labelValidacionCuadrado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jPanelGraficaCuadrado, javax.swing.GroupLayout.DEFAULT_SIZE, 531, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(coordenada1XCuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(coordenada2XCuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(coordenada3XCuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(coordenada4XCuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(coordenada1YCuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(coordenada2YCuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(coordenada3YCuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(coordenada4YCuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonCalcularCuadrado)
                    .addComponent(botonGuardarCuadrado))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                    .addComponent(labelAreaCuadrado))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(labelPerimetroCuadrado))
                .addGap(18, 18, 18)
                .addComponent(labelValidacionCuadrado)
                .addContainerGap(129, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelGraficaCuadrado, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void coordenada2XCuadradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coordenada2XCuadradoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_coordenada2XCuadradoActionPerformed

    private void botonCalcularCuadradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCalcularCuadradoActionPerformed
        // TODO add your handling code here:
        //coordenadas para poder calcular el cuadrado
        double areaCuadrado, perimetroCuadrado;
        int coorX1 = Integer.parseInt(coordenada1XCuadrado.getText());
        int coorX2 = Integer.parseInt(coordenada2XCuadrado.getText());
        int coorX3 = Integer.parseInt(coordenada3XCuadrado.getText());
        int coorX4 = Integer.parseInt(coordenada4XCuadrado.getText());
        int coorY1 = Integer.parseInt(coordenada1YCuadrado.getText());
        int coorY2 = Integer.parseInt(coordenada2YCuadrado.getText());
        int coorY3 = Integer.parseInt(coordenada3YCuadrado.getText());
        int coorY4 = Integer.parseInt(coordenada4YCuadrado.getText());
        //System.out.println(coorX1+""+coorX2+""+coorX3+""+coorX4);

        //se envían las coordenadas al constructor de la clase Cuadrado
        Cuadrado cuadrado = new Cuadrado(coorX1, coorX2, coorX3, coorX4, coorY1, coorY2, coorY3, coorY4);
        cuadrado.dibujarFigura(jPanelGraficaCuadrado.getGraphics(), coorX1, coorX2, coorX3, coorX4, coorY1, coorY2, coorY3, coorY4);
        //se llaman las funciones para poder calcular el área y el perímetro
        cuadrado.coordenadaALados();
        cuadrado.perimetro();
        cuadrado.area();
        if (cuadrado.getLadoA() == cuadrado.getLadoB()) {
            //System.out.println(cuadrado.ladoA+"asdasd lado a");
            areaCuadrado = cuadrado.getArea();
            //System.out.println("area   "+areaCuadrado);
            perimetroCuadrado = cuadrado.getPerimetro();
            //se añaden al Label para mostrar en pantalla el área y el perímetro
            labelAreaCuadrado.setText(Double.toString(areaCuadrado));
            labelPerimetroCuadrado.setText(Double.toString(perimetroCuadrado));
        } else {
            labelValidacionCuadrado.setText("las coordenadas ingresadas no son un cuadrado");
        }

    }//GEN-LAST:event_botonCalcularCuadradoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCalcularCuadrado;
    private javax.swing.JButton botonGuardarCuadrado;
    private javax.swing.JTextField coordenada1XCuadrado;
    private javax.swing.JTextField coordenada1YCuadrado;
    private javax.swing.JTextField coordenada2XCuadrado;
    private javax.swing.JTextField coordenada2YCuadrado;
    private javax.swing.JTextField coordenada3XCuadrado;
    private javax.swing.JTextField coordenada3YCuadrado;
    private javax.swing.JTextField coordenada4XCuadrado;
    private javax.swing.JTextField coordenada4YCuadrado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanelGraficaCuadrado;
    private javax.swing.JLabel labelAreaCuadrado;
    private javax.swing.JLabel labelPerimetroCuadrado;
    private javax.swing.JLabel labelValidacionCuadrado;
    // End of variables declaration//GEN-END:variables
}
