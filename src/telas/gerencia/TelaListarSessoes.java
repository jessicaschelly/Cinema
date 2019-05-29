/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas.gerencia;

import controladores.ControladorFilme;
import controladores.ControladorSessao;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import telas.MainFrame;

/**
 *
 * @author jsouza
 */
public class TelaListarSessoes extends javax.swing.JPanel {

    /**
     * Creates new form TelaListarSessoes
     */
    public TelaListarSessoes() {
        initComponents();
         list_sessoes.setListData(ControladorSessao.getInstance().dadosSessao());
    }
        public void refresh(){
        list_sessoes.setListData(ControladorSessao.getInstance().dadosSessao());
       
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
        jScrollPane1 = new javax.swing.JScrollPane();
        list_sessoes = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        btn_voltar = new javax.swing.JButton();
        remover_sessao = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(55, 55, 55));
        jPanel1.setAlignmentY(1.0F);

        list_sessoes.setBackground(new java.awt.Color(76, 76, 76));
        list_sessoes.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        list_sessoes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        list_sessoes.setForeground(new java.awt.Color(37, 184, 255));
        list_sessoes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                list_sessoesKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(list_sessoes);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(37, 184, 255));
        jLabel1.setText("Sessões Cadastradas");

        btn_voltar.setText("Voltar");
        btn_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_voltarActionPerformed(evt);
            }
        });

        remover_sessao.setText("Remover");
        remover_sessao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remover_sessaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_voltar)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(349, 349, 349)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(239, 239, 239)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(remover_sessao)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 288, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(remover_sessao)
                .addGap(53, 53, 53)
                .addComponent(btn_voltar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_voltarActionPerformed
        ((MainFrame) SwingUtilities.getWindowAncestor(this)).exibeTelaFuncionario();
    }//GEN-LAST:event_btn_voltarActionPerformed

    private void remover_sessaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remover_sessaoActionPerformed
     int dialogButton = JOptionPane.YES_NO_OPTION;
       int dialogResult = JOptionPane.showConfirmDialog (null, "Você tem certeza que deseja remover esta sessão?","Warning",dialogButton);
       if(dialogResult == JOptionPane.YES_OPTION){ 
       ControladorSessao.getInstance().sessoes.remove(list_sessoes.getSelectedIndex());
       }else{
          ((MainFrame) SwingUtilities.getWindowAncestor(this)).exibeTelaListaSessoes(); 
       }
       refresh();
    
    }//GEN-LAST:event_remover_sessaoActionPerformed

    private void list_sessoesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_list_sessoesKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_list_sessoesKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_voltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> list_sessoes;
    private javax.swing.JButton remover_sessao;
    // End of variables declaration//GEN-END:variables
}