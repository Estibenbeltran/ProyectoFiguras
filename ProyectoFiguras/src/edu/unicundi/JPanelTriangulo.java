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
        jLabel6 = new javax.swing.JLabel();
        coordenada2YTriangulo = new javax.swing.JTextField();
        coordenada3XTriangulo = new javax.swing.JTextField();
        labelPerimetroTriangulo = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        labelTipoTriangulo = new javax.swing.JLabel();
        jPanelGraficaTriangulo = new javax.swing.JPanel();

        botonCalcularTriangulo.setText("Calcular");
        botonCalcularTriangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCalcularTrianguloActionPerformed(evt);
            }
        });

        jLabel1.setText("Ingresa las coordenadas");

        labelCoordenadasX.setText("coordenadas x");

        jLabel9.setText("El área del triángulo es:");

        labelCoordenadasY.setText("coordenadas y");

        jLabel4.setText("C1");

        jLabel10.setText("El perímetro del triángulo es:");

        coordenada1XTriangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coordenada1XTrianguloActionPerformed(evt);
            }
        });

        jLabel5.setText("C2");

        coordenada2XTriangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coordenada2XTrianguloActionPerformed(evt);
            }
        });

        labelAreaTriangulo.setText("Area");

        jLabel6.setText("C3");

        labelPerimetroTriangulo.setText("Perimetro");

        jLabel12.setText("El tipo de triángulo es:");

        labelTipoTriangulo.setText("Triangulo");

        jPanelGraficaTriangulo.setPreferredSize(new java.awt.Dimension(400, 400));

        javax.swing.GroupLayout jPanelGraficaTrianguloLayout = new javax.swing.GroupLayout(jPanelGraficaTriangulo);
        jPanelGraficaTriangulo.setLayout(jPanelGraficaTrianguloLayout);
        jPanelGraficaTrianguloLayout.setHorizontalGroup(
            jPanelGraficaTrianguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 539, Short.MAX_VALUE)
        );
        jPanelGraficaTrianguloLayout.setVerticalGroup(
            jPanelGraficaTrianguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
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
                        .addComponent(coordenada3YTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelAreaTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelPerimetroTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelTipoTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelGraficaTriangulo, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(23, 23, 23)
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
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTipoTriangulo))
                .addContainerGap(123, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelGraficaTriangulo, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonCalcularTrianguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCalcularTrianguloActionPerformed
        // TODO add your handling code here:
        //coordenadas para poder hallar el área y el perímetro del triángulo
        double areaTriangulo, perimetroTriangulo;
        String difTriangulo;
        int coorX1 = Integer.parseInt(coordenada1XTriangulo.getText());
        int coorX2 = Integer.parseInt(coordenada2XTriangulo.getText());
        int coorX3 = Integer.parseInt(coordenada3XTriangulo.getText());
        int coorY1 = Integer.parseInt(coordenada1YTriangulo.getText());
        int coorY2 = Integer.parseInt(coordenada2YTriangulo.getText());
        int coorY3 = Integer.parseInt(coordenada3YTriangulo.getText());

        //se envían al constructor las coordenadas para poder hallar el +área y el perímetro del triángulo
        Triangulo triangulo = new Triangulo(coorX1, coorX2, coorX3, coorY1, coorY2, coorY3);
        //triangulo.dibujarFigura(jPanelGraficaTriangulo.getGraphics(), coorX1, coorX2, coorX3, coorY1, coorY2, coorY3);
        //System.out.println(triangulo);
        triangulo.perimetro();
        triangulo.area();
        triangulo.difTriangulos();
        areaTriangulo = triangulo.getArea();
        perimetroTriangulo = triangulo.getPerimetro();
        difTriangulo = triangulo.difTriangulo;

        //se muestran los resultados
        labelAreaTriangulo.setText(Double.toString(areaTriangulo));
        labelPerimetroTriangulo.setText(Double.toString(perimetroTriangulo));
        labelTipoTriangulo.setText(difTriangulo);
    }//GEN-LAST:event_botonCalcularTrianguloActionPerformed

    private void coordenada2XTrianguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coordenada2XTrianguloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_coordenada2XTrianguloActionPerformed

    private void coordenada1XTrianguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coordenada1XTrianguloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_coordenada1XTrianguloActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GrupoTipoTriangulo;
    private javax.swing.JButton botonCalcularTriangulo;
    private javax.swing.JTextField coordenada1XTriangulo;
    private javax.swing.JTextField coordenada1YTriangulo;
    private javax.swing.JTextField coordenada2XTriangulo;
    private javax.swing.JTextField coordenada2YTriangulo;
    private javax.swing.JTextField coordenada3XTriangulo;
    private javax.swing.JTextField coordenada3YTriangulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanelGraficaTriangulo;
    private javax.swing.JLabel labelAreaTriangulo;
    private javax.swing.JLabel labelCoordenadasX;
    private javax.swing.JLabel labelCoordenadasY;
    private javax.swing.JLabel labelPerimetroTriangulo;
    private javax.swing.JLabel labelTipoTriangulo;
    // End of variables declaration//GEN-END:variables
}
