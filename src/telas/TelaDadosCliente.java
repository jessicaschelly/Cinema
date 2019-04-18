/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import entidades.Filme;
import entidades.Sessao;
import javax.swing.JOptionPane;

/**
 *
 * @author jsouza
 */
public class TelaDadosCliente extends javax.swing.JPanel {

    /**
     * Creates new form TelaDadosCliente
     */
    private Sessao sessao;
    public TelaDadosCliente(Sessao sessao) {
        this.sessao = sessao;
        initComponents();
        rbtn_inteira.setSelected(true);
        lbl_valor.setText("R$ 40,00");
        Filme f = sessao.getFilme();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        rbtn_inteira = new javax.swing.JRadioButton();
        rbtn_meia_entrada = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        cbox_poltrona = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        lbl_valor = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txt_nome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_idade = new javax.swing.JTextField();

        setBackground(new java.awt.Color(51, 51, 51));

        jLabel5.setForeground(new java.awt.Color(250, 250, 250));
        jLabel5.setText("Tipo de ingresso: ");

        rbtn_inteira.setBackground(new java.awt.Color(101, 101, 101));
        rbtn_inteira.setForeground(new java.awt.Color(37, 184, 255));
        rbtn_inteira.setText("Inteira");
        rbtn_inteira.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn_inteiraActionPerformed(evt);
            }
        });

        rbtn_meia_entrada.setBackground(new java.awt.Color(101, 101, 101));
        rbtn_meia_entrada.setForeground(new java.awt.Color(37, 184, 255));
        rbtn_meia_entrada.setText("Meia entrada");
        rbtn_meia_entrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn_meia_entradaActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(250, 250, 250));
        jLabel3.setText("Poltrona:");

        cbox_poltrona.setBackground(new java.awt.Color(250, 250, 250));
        cbox_poltrona.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Poltrona 1", "Poltrona 2", "Poltrona 3", "Poltrona 4" }));

        jLabel4.setBackground(new java.awt.Color(0, 153, 102));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(37, 184, 255));
        jLabel4.setText("Valor:");

        lbl_valor.setBackground(new java.awt.Color(0, 153, 102));
        lbl_valor.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbl_valor.setForeground(new java.awt.Color(37, 184, 255));
        lbl_valor.setText("valor");

        jLabel1.setForeground(new java.awt.Color(250, 250, 250));
        jLabel1.setText("CPF:");

        txt_nome.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(250, 250, 250), 4, true));

        jLabel2.setForeground(new java.awt.Color(250, 250, 250));
        jLabel2.setText("Idade:");

        txt_idade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250, 250, 250), 4));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(72, 72, 72)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(41, 41, 41)
                            .addComponent(lbl_valor))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_idade, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(rbtn_meia_entrada)
                                .addComponent(rbtn_inteira)))
                        .addGroup(layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cbox_poltrona, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(73, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txt_idade, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(31, 31, 31)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(rbtn_inteira))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(rbtn_meia_entrada)
                            .addGap(26, 26, 26)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(lbl_valor))
                            .addGap(58, 58, 58))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbox_poltrona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addContainerGap()))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void rbtn_inteiraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn_inteiraActionPerformed
        if (rbtn_inteira.isSelected()) {
            lbl_valor.setText("R$ 40,00");
        }
    }//GEN-LAST:event_rbtn_inteiraActionPerformed

    private void rbtn_meia_entradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn_meia_entradaActionPerformed
        if (rbtn_meia_entrada.isSelected()) {
            lbl_valor.setText("R$ 20,00");
            JOptionPane.showMessageDialog(null, "É necessário apresentar um documento que comprove meia-entrada na entrega do ingresso!");

        }
    }//GEN-LAST:event_rbtn_meia_entradaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbox_poltrona;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lbl_valor;
    private javax.swing.JRadioButton rbtn_inteira;
    private javax.swing.JRadioButton rbtn_meia_entrada;
    private javax.swing.JTextField txt_idade;
    private javax.swing.JTextField txt_nome;
    // End of variables declaration//GEN-END:variables
}
