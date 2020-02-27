/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicundi;

import javax.swing.JOptionPane;

/**
 *
 * @author daiyd
 */
public class JPanelTriangulo extends javax.swing.JPanel {

    /**
     * Creates new form JPanelTriangulo
     */
    public JPanelTriangulo() {
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

        GrupoTipoTriangulo = new javax.swing.ButtonGroup();
        coordenada3YTriangulo = new javax.swing.JTextField();
        botonCalcularTriangulo = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        labelCoordenadasX = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        labelCoordenadasY = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        coordenada1YTriangulo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        coordenada1XTriangulo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        coordenada2XTriangulo = new javax.swing.JTextField();
        labelAreaTriangulo = new javax.swing.JLabel();
        botonAreaTriangulo = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        coordenada2YTriangulo = new javax.swing.JTextField();
        coordenada3XTriangulo = new javax.swing.JTextField();
        labelPerimetroTriangulo = new javax.swing.JLabel();
        botonPerimetroTriangulo = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        botonIsosceles = new javax.swing.JRadioButton();
        botonEquilatero = new javax.swing.JRadioButton();
        botonEscaleno = new javax.swing.JRadioButton();

        botonCalcularTriangulo.setText("Calcular");
        botonCalcularTriangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCalcularTrianguloActionPerformed(evt);
            }
        });

        jLabel8.setText("¿Qué desea calcular del triángulo?");

        jLabel1.setText("Ingresa las coordenadas");

        labelCoordenadasX.setText("coordenadas x");

        jLabel9.setText("El área del triángulo es:");

        labelCoordenadasY.setText("coordenadas y");

        jLabel4.setText("C1");

        jLabel10.setText("El perímetro del triángulo es:");

        jLabel5.setText("C2");

        coordenada2XTriangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coordenada2XTrianguloActionPerformed(evt);
            }
        });

        labelAreaTriangulo.setText("Area");

        botonAreaTriangulo.setText("Area");

        jLabel6.setText("C3");

        labelPerimetroTriangulo.setText("Perimetro");

        botonPerimetroTriangulo.setText("Perímetro");

        jLabel11.setText("¿Qué tipo de triángulo desea calcular?");

        GrupoTipoTriangulo.add(botonIsosceles);
        botonIsosceles.setText("Isósceles");

        GrupoTipoTriangulo.add(botonEquilatero);
        botonEquilatero.setText("Equilátero");

        GrupoTipoTriangulo.add(botonEscaleno);
        botonEscaleno.setText("Escaleno");
        botonEscaleno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEscalenoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(54, 54, 54))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(labelCoordenadasX)
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(coordenada1XTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel4))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(coordenada2XTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel5))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(coordenada3XTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel6)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(botonCalcularTriangulo)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(labelCoordenadasY)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(coordenada1YTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(coordenada2YTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(coordenada3YTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(38, 38, 38)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel9))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(labelAreaTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(labelPerimetroTriangulo))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(botonPerimetroTriangulo)
                                    .addComponent(botonAreaTriangulo)
                                    .addComponent(botonEscaleno)
                                    .addComponent(botonIsosceles)
                                    .addComponent(botonEquilatero))
                                .addGap(24, 24, 24))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jLabel8)))
                .addContainerGap(536, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonAreaTriangulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonPerimetroTriangulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(botonEquilatero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonIsosceles)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonEscaleno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCoordenadasX)
                    .addComponent(coordenada1XTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(coordenada2XTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(coordenada3XTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCoordenadasY)
                    .addComponent(coordenada1YTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(coordenada2YTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(coordenada3YTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(botonCalcularTriangulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelAreaTriangulo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(labelPerimetroTriangulo))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    
    private void botonCalcularTrianguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCalcularTrianguloActionPerformed
        // TODO add your handling code here:
     
    }//GEN-LAST:event_botonCalcularTrianguloActionPerformed

    private void coordenada2XTrianguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coordenada2XTrianguloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_coordenada2XTrianguloActionPerformed

    private void botonEscalenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEscalenoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonEscalenoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GrupoTipoTriangulo;
    private javax.swing.JRadioButton botonAreaTriangulo;
    private javax.swing.JButton botonCalcularTriangulo;
    private javax.swing.JRadioButton botonEquilatero;
    private javax.swing.JRadioButton botonEscaleno;
    private javax.swing.JRadioButton botonIsosceles;
    private javax.swing.JRadioButton botonPerimetroTriangulo;
    private javax.swing.JTextField coordenada1XTriangulo;
    private javax.swing.JTextField coordenada1YTriangulo;
    private javax.swing.JTextField coordenada2XTriangulo;
    private javax.swing.JTextField coordenada2YTriangulo;
    private javax.swing.JTextField coordenada3XTriangulo;
    private javax.swing.JTextField coordenada3YTriangulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel labelAreaTriangulo;
    private javax.swing.JLabel labelCoordenadasX;
    private javax.swing.JLabel labelCoordenadasY;
    private javax.swing.JLabel labelPerimetroTriangulo;
    // End of variables declaration//GEN-END:variables
}
