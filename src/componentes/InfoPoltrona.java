/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentes;

import entidades.Poltrona;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;

/**
 *
 * @author guilherme
 */
public class InfoPoltrona extends javax.swing.JPanel {

    /**
     * Creates new form InfoPoltrona
     */
    public InfoPoltrona(Poltrona poltrona) {
        initComponents();

        if (poltrona.ocupada) {
            this.btn_poltrona.setIcon(new ImageIcon("resources/poltronaVermelha.png"));
        } else {
            this.btn_poltrona.setIcon(new ImageIcon("resources/poltronaVerde.png"));

        }

    }

    public void setCallback(ActionListener al) {
        this.btn_poltrona.addActionListener(al);

    }
    
    
    public void deseleciona() {
            this.btn_poltrona.setIcon(new ImageIcon("resources/poltronaVerde.png"));
    }
    
    public void seleciona() {
            this.btn_poltrona.setIcon(new ImageIcon("resources/poltronaAzul.png"));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_poltrona = new javax.swing.JButton();

        setBackground(new java.awt.Color(57, 57, 57));

        btn_poltrona.setBackground(new java.awt.Color(57, 57, 57));
        btn_poltrona.setForeground(new java.awt.Color(56, 56, 56));
        btn_poltrona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_poltronaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_poltrona)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_poltrona)
                .addContainerGap(32, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_poltronaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_poltronaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_poltronaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_poltrona;
    // End of variables declaration//GEN-END:variables

    

}
