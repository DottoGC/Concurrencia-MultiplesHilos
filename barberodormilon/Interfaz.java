/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barberodormilon;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.accessibility.AccessibleContext;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.border.Border;

/**
 *
 * @author dotto
 */
public class Interfaz extends javax.swing.JFrame {
    JLabel labels[] = new JLabel[20];

    public Interfaz() {
        initComponents();        
        jPanel1.setLayout(new GridLayout(4, 5));

        for (int i = 0; i < labels.length; i++) {
            JLabel label = new JLabel("", (int) CENTER_ALIGNMENT);
            label.setBackground(Color.BLACK);
            label.setOpaque(true);
            label.setPreferredSize(new Dimension(50, 50));
            label.setMaximumSize(new Dimension(50, 50));
            
            Border border = BorderFactory.createLineBorder(Color.DARK_GRAY, 5);
            label.setBorder(border);
            
            labels[i] = label;
            labels[i].setIcon(new javax.swing.ImageIcon(getClass().getResource("silla.jpg")));
            jPanel1.add(labels[i]);
        }

    }


    public void setearClientesQueSeVan(int cont) {
        jLabelClientesSeVan.setText(String.valueOf(cont));
        this.repaint();
    }
    
    public void setearVecesDormido(int cont) {
        jLabelDormido1.setText(String.valueOf(cont));
        jLabelBarbero.setBorder(BorderFactory.createLineBorder(Color.white,1));
        this.repaint();
    }
        
    public void ingresoClienteForm(String totalClientes, int i) {
        jLabelTotalClientes.setText(totalClientes);
        labels[i].setIcon(new javax.swing.ImageIcon(getClass().getResource("cliente.png")));
        this.repaint();
    }

    public void atenderClienteForm(String idContCliente, int i) {
        jLabelClienteAtendidos.setText(idContCliente);
        labels[i].setIcon(new javax.swing.ImageIcon(getClass().getResource("silla.jpg")));
        jLabelBarbero.setBorder(BorderFactory.createLineBorder(Color.black,1));
        this.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabelTotalClientes = new javax.swing.JLabel();
        jLabelClienteAtendidos = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabelBarbero = new javax.swing.JLabel();
        jLabelClientesSeVan = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabelDormido1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Barberia del Dormilon");
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 700));

        jPanel1.setPreferredSize(new java.awt.Dimension(300, 250));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        jLabel3.setFont(new java.awt.Font("Raleway ExtraBold", 0, 24)); // NOI18N
        jLabel3.setText("Barberia del dormilon");

        jLabelTotalClientes.setFont(new java.awt.Font("Raleway Black", 0, 24)); // NOI18N
        jLabelTotalClientes.setText("0");

        jLabelClienteAtendidos.setFont(new java.awt.Font("Raleway Black", 0, 24)); // NOI18N
        jLabelClienteAtendidos.setText("0");

        jLabel4.setFont(new java.awt.Font("Raleway ExtraBold", 0, 18)); // NOI18N
        jLabel4.setText("Iteracion entró cliente");

        jLabel5.setFont(new java.awt.Font("Raleway ExtraBold", 0, 18)); // NOI18N
        jLabel5.setText("Iteracion se atendió cliente");

        jLabelBarbero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barberodormilon/barbero.jpg"))); // NOI18N

        jLabelClientesSeVan.setFont(new java.awt.Font("Raleway Black", 0, 24)); // NOI18N
        jLabelClientesSeVan.setText("0");

        jLabel6.setFont(new java.awt.Font("Raleway ExtraBold", 0, 18)); // NOI18N
        jLabel6.setText("(Barbero Durmiendo)");

        jLabelDormido1.setFont(new java.awt.Font("Raleway Black", 0, 24)); // NOI18N
        jLabelDormido1.setText("0");

        jLabel7.setFont(new java.awt.Font("Raleway ExtraBold", 0, 18)); // NOI18N
        jLabel7.setText("Iteracion Barberia Llena");

        jLabel8.setFont(new java.awt.Font("Raleway ExtraBold", 0, 18)); // NOI18N
        jLabel8.setText("Interacion Barberia Vacia");

        jLabel9.setFont(new java.awt.Font("Raleway ExtraBold", 0, 18)); // NOI18N
        jLabel9.setText("(Cliente se va)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabelBarbero, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(jLabel9))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabelClientesSeVan, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(94, 94, 94))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabelDormido1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(90, 90, 90))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabelTotalClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(93, 93, 93))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabelClienteAtendidos, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(88, 88, 88))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel7)
                        .addComponent(jLabel8)))
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelDormido1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelClientesSeVan, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelTotalClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelClienteAtendidos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel3)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelBarbero, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(789, 559));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelBarbero;
    private javax.swing.JLabel jLabelClienteAtendidos;
    private javax.swing.JLabel jLabelClientesSeVan;
    private javax.swing.JLabel jLabelDormido1;
    private javax.swing.JLabel jLabelTotalClientes;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}