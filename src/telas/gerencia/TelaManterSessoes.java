/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package telas.gerencia;

import controladores.ControladorEntidades;
import entidades.Ingresso;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import telas.MainFrame;

/**
 *
 * @author jessicassouza
 */
public class TelaManterSessoes extends javax.swing.JPanel {

    /** Creates new form TelaManterSessoes */
    public TelaManterSessoes() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_adicionar_sessoes = new javax.swing.JButton();
        btn_voltar = new javax.swing.JButton();
        lbl_bem_vindo = new javax.swing.JLabel();
        btn_listar_sessoes = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(55, 55, 55));
        jPanel1.setFocusable(false);
        jPanel1.setRequestFocusEnabled(false);

        btn_adicionar_sessoes.setBackground(new java.awt.Color(76, 76, 76));
        btn_adicionar_sessoes.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btn_adicionar_sessoes.setForeground(new java.awt.Color(37, 184, 255));
        btn_adicionar_sessoes.setText("Adicionar sessões");
        btn_adicionar_sessoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_adicionar_sessoesActionPerformed(evt);
            }
        });

        btn_voltar.setText("Voltar");
        btn_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_voltarActionPerformed(evt);
            }
        });

        lbl_bem_vindo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_bem_vindo.setForeground(new java.awt.Color(37, 184, 255));
        lbl_bem_vindo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_bem_vindo.setText("Gerenciar Sessões");

        btn_listar_sessoes.setBackground(new java.awt.Color(76, 76, 76));
        btn_listar_sessoes.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btn_listar_sessoes.setForeground(new java.awt.Color(37, 184, 255));
        btn_listar_sessoes.setText("Listar Sessões");
        btn_listar_sessoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_listar_sessoesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 284, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_adicionar_sessoes, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_listar_sessoes, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(480, 480, 480))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_voltar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_bem_vindo, javax.swing.GroupLayout.PREFERRED_SIZE, 824, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(lbl_bem_vindo)
                .addGap(36, 36, 36)
                .addComponent(btn_adicionar_sessoes, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(btn_listar_sessoes, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 254, Short.MAX_VALUE)
                .addComponent(btn_voltar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1036, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 648, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_adicionar_sessoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_adicionar_sessoesActionPerformed
        ((MainFrame) SwingUtilities.getWindowAncestor(this)).exibeTelaCadastroSessoes();
    }//GEN-LAST:event_btn_adicionar_sessoesActionPerformed

    private void btn_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_voltarActionPerformed
        ((MainFrame) SwingUtilities.getWindowAncestor(this)).exibeTelaFuncionario();
    }//GEN-LAST:event_btn_voltarActionPerformed

    private void btn_listar_sessoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_listar_sessoesActionPerformed
        ((MainFrame) SwingUtilities.getWindowAncestor(this)).exibeTelaListaSessoes();
    }//GEN-LAST:event_btn_listar_sessoesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_adicionar_sessoes;
    private javax.swing.JButton btn_listar_sessoes;
    private javax.swing.JButton btn_voltar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_bem_vindo;
    // End of variables declaration//GEN-END:variables

}