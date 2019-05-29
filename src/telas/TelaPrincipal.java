package telas;

import controladores.ControladorEntidades;
import entidades.Funcionario;
import entidades.Gerente;
import javax.swing.*;

public class TelaPrincipal extends javax.swing.JPanel {

    TelaPrincipal() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        btn_acesso_funcionario = new javax.swing.JButton();
        lbl_guiche = new javax.swing.JLabel();
        btn_acesso_gerencia = new javax.swing.JButton();
        btn_bomboniere = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 51, 51));
        setPreferredSize(new java.awt.Dimension(800, 500));

        jButton1.setBackground(new java.awt.Color(37, 184, 255));
        jButton1.setFont(new java.awt.Font("Noto Sans", 1, 36)); // NOI18N
        jButton1.setForeground(new java.awt.Color(250, 250, 250));
        jButton1.setText("Comprar ingressos");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btn_acesso_funcionario.setBackground(new java.awt.Color(173, 52, 62));
        btn_acesso_funcionario.setForeground(new java.awt.Color(250, 250, 250));
        btn_acesso_funcionario.setText("Acesso funcionário");
        btn_acesso_funcionario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(173, 52, 62), 2, true));
        btn_acesso_funcionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_acesso_funcionarioActionPerformed(evt);
            }
        });

        lbl_guiche.setBackground(new java.awt.Color(242, 175, 41));
        lbl_guiche.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lbl_guiche.setForeground(new java.awt.Color(250, 250, 250));
        lbl_guiche.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_guiche.setText("Cinema Itaguaçu");

        btn_acesso_gerencia.setBackground(new java.awt.Color(173, 52, 62));
        btn_acesso_gerencia.setForeground(new java.awt.Color(250, 250, 250));
        btn_acesso_gerencia.setText("Acesso gerência");
        btn_acesso_gerencia.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(173, 52, 62), 2, true));
        btn_acesso_gerencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_acesso_gerenciaActionPerformed(evt);
            }
        });

        btn_bomboniere.setText("Bomboniere");
        btn_bomboniere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bomboniereActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_acesso_gerencia, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_acesso_funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(422, 422, 422)
                .addComponent(lbl_guiche, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_bomboniere, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(180, 180, 180))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(lbl_guiche)
                .addGap(111, 111, 111)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                    .addComponent(btn_bomboniere, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 61, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_acesso_gerencia, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_acesso_funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ((MainFrame) SwingUtilities.getWindowAncestor(this)).exibeTelaSelecaoFilme();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_acesso_funcionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_acesso_funcionarioActionPerformed
        String option = JOptionPane.showInputDialog("Entre com o ID do funcionário:");

        Funcionario funcionario = ControladorEntidades.getInstance().getFuncionarioById(option);
        if (funcionario != null) {
            ((MainFrame) SwingUtilities.getWindowAncestor(this)).exibeTelaFuncionario(funcionario);
        } else if (option != null) {
            JOptionPane.showMessageDialog(null, "Erro, funcionário não encontrado.");
        }
    }//GEN-LAST:event_btn_acesso_funcionarioActionPerformed

    private void btn_acesso_gerenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_acesso_gerenciaActionPerformed
        String option = JOptionPane.showInputDialog("Entre com o ID do Gerente:");

        Gerente gerente = ControladorEntidades.getInstance().getGerenteoById(option);
        if (gerente != null) {
            ((MainFrame) SwingUtilities.getWindowAncestor(this)).exibeTelaGerencia(gerente);
        } else if (option != null) {
            JOptionPane.showMessageDialog(null, "Erro, gerente não encontrado.");
        }
    }//GEN-LAST:event_btn_acesso_gerenciaActionPerformed

    private void btn_bomboniereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bomboniereActionPerformed
        ((MainFrame) SwingUtilities.getWindowAncestor(this)).exibeTelaBombonier(null);
    }//GEN-LAST:event_btn_bomboniereActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_acesso_funcionario;
    private javax.swing.JButton btn_acesso_gerencia;
    private javax.swing.JButton btn_bomboniere;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lbl_guiche;
    // End of variables declaration//GEN-END:variables
}
