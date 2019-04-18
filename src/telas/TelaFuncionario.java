package telas;

import entidades.Funcionario;
import entidades.Ingresso;
import controladores.ControladorEntidades;
import javax.swing.*;

public class TelaFuncionario extends javax.swing.JPanel {

    public TelaFuncionario(Funcionario funcionario) {
        initComponents();
        lbl_bem_vindo.setText("Seja bem vindo(a), " + funcionario.getNome() + "!");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        btn_adicionar_filmes = new javax.swing.JButton();
        btn_listar_filmes = new javax.swing.JButton();
        btn_adicionar_sessoes = new javax.swing.JButton();
        btn_voltar = new javax.swing.JButton();
        lbl_bem_vindo = new javax.swing.JLabel();
        btn_relatorio = new javax.swing.JButton();
        btn_listar_sessoes = new javax.swing.JButton();

        jPasswordField1.setText("jPasswordField1");

        setBackground(new java.awt.Color(55, 55, 55));
        setFocusable(false);
        setRequestFocusEnabled(false);

        btn_adicionar_filmes.setBackground(new java.awt.Color(76, 76, 76));
        btn_adicionar_filmes.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btn_adicionar_filmes.setForeground(new java.awt.Color(37, 184, 255));
        btn_adicionar_filmes.setText("Adicionar Filmes");
        btn_adicionar_filmes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_adicionar_filmesActionPerformed(evt);
            }
        });

        btn_listar_filmes.setBackground(new java.awt.Color(76, 76, 76));
        btn_listar_filmes.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btn_listar_filmes.setForeground(new java.awt.Color(37, 184, 255));
        btn_listar_filmes.setText("Filmes Cadastrados");
        btn_listar_filmes.setActionCommand("Listar Filmes");
        btn_listar_filmes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_listar_filmesActionPerformed(evt);
            }
        });

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
        lbl_bem_vindo.setText("label bem vindo");

        btn_relatorio.setText("Relatório");
        btn_relatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_relatorioActionPerformed(evt);
            }
        });

        btn_listar_sessoes.setBackground(new java.awt.Color(76, 76, 76));
        btn_listar_sessoes.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btn_listar_sessoes.setForeground(new java.awt.Color(37, 184, 255));
        btn_listar_sessoes.setText("Listar Sessões");
        btn_listar_sessoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_listar_sessoesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_relatorio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_voltar)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 396, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_adicionar_filmes, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_listar_filmes, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_adicionar_sessoes, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_listar_sessoes, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(347, 347, 347))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_bem_vindo, javax.swing.GroupLayout.PREFERRED_SIZE, 824, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(lbl_bem_vindo)
                .addGap(38, 38, 38)
                .addComponent(btn_adicionar_filmes, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btn_listar_filmes, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btn_adicionar_sessoes, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btn_listar_sessoes, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_voltar)
                    .addComponent(btn_relatorio))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_voltarActionPerformed
        ((MainFrame) SwingUtilities.getWindowAncestor(this)).exibeTelaPrincipal();
    }//GEN-LAST:event_btn_voltarActionPerformed

    private void btn_adicionar_filmesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_adicionar_filmesActionPerformed
        ((MainFrame) SwingUtilities.getWindowAncestor(this)).exibeTelaCadastroFilmes();
    }//GEN-LAST:event_btn_adicionar_filmesActionPerformed

    private void btn_listar_filmesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_listar_filmesActionPerformed
        ((MainFrame) SwingUtilities.getWindowAncestor(this)).exibeTelaListaFilmes();
    }//GEN-LAST:event_btn_listar_filmesActionPerformed

    private void btn_adicionar_sessoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_adicionar_sessoesActionPerformed
        ((MainFrame) SwingUtilities.getWindowAncestor(this)).exibeTelaCadastroSessoes();
    }//GEN-LAST:event_btn_adicionar_sessoesActionPerformed

    private void btn_relatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_relatorioActionPerformed
        String mensagem = "Valor total das vendas: R$ " + ControladorEntidades.getInstance().totalVendas() + ",00\r\n";
        mensagem += "Ingressos vendidos: \r\n";

        for (Ingresso ing : ControladorEntidades.getInstance().ingressos) {
            mensagem += "ID: " + ing.ID + ", Filme: " + ing.sessao.getFilme().getTitulo() + ", Valor: R$ " + ing.valor + ",00\r\n";
        }
        JOptionPane.showMessageDialog(null, mensagem);
    }//GEN-LAST:event_btn_relatorioActionPerformed

    private void btn_listar_sessoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_listar_sessoesActionPerformed
       ((MainFrame) SwingUtilities.getWindowAncestor(this)).exibeTelaListaSessoes();
    }//GEN-LAST:event_btn_listar_sessoesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_adicionar_filmes;
    private javax.swing.JButton btn_adicionar_sessoes;
    private javax.swing.JButton btn_listar_filmes;
    private javax.swing.JButton btn_listar_sessoes;
    private javax.swing.JButton btn_relatorio;
    private javax.swing.JButton btn_voltar;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel lbl_bem_vindo;
    // End of variables declaration//GEN-END:variables
}
