/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import componentes.InfoFilme;
import controladores.ControladorFilme;
import entidades.Filme;
import java.awt.Component;
import java.awt.GridLayout;
import javax.swing.SwingUtilities;

/**
 *
 * @author jsouza
 */
public class TelaSelecaoFilme extends javax.swing.JPanel {

    /**
     * Creates new form TelaSelecaoFilme
     */
        Component frame = null;
        Filme filme;
    public TelaSelecaoFilme() {
        initComponents();
         for(Filme filme : ControladorFilme.getInstance().filmes ){
            grid_filmes.add(new InfoFilme(filme));
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grid_filmes = new javax.swing.JPanel();
        btn_voltar = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 51, 51));

        grid_filmes.setLayout(new java.awt.GridLayout(1, 0));

        btn_voltar.setBackground(new java.awt.Color(95, 0, 0));
        btn_voltar.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btn_voltar.setForeground(new java.awt.Color(250, 250, 250));
        btn_voltar.setText("Voltar");
        btn_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_voltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(grid_filmes, javax.swing.GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE)
                .addContainerGap(586, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(btn_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(grid_filmes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 608, Short.MAX_VALUE)
                .addComponent(btn_voltar)
                .addGap(24, 24, 24))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_voltarActionPerformed
       ((MainFrame) SwingUtilities.getWindowAncestor(this)).exibeTelaPrincipal();
    }//GEN-LAST:event_btn_voltarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_voltar;
    private javax.swing.JPanel grid_filmes;
    // End of variables declaration//GEN-END:variables
}
