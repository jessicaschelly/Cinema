package telas;

import entidades.Filme;
import entidades.Sessao;
import entidades.Poltrona;
import entidades.Ingresso;
import controladores.ControladorEntidades;
import java.time.Duration;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import java.awt.*;
import java.util.*;

public class TelaConfirmacaoIngresso extends javax.swing.JPanel {

    public static String formatDuration(Duration duration) {
        long seconds = duration.getSeconds();
        long absSeconds = Math.abs(seconds);
        String positive = String.format(
                "%d:%02d:%02d",
                absSeconds / 3600,
                (absSeconds % 3600) / 60,
                absSeconds % 60);
        return seconds < 0 ? "-" + positive : positive;
    }

    private Sessao sessao;

    TelaConfirmacaoIngresso(Sessao sessao) {
        this.sessao = sessao;
        initComponents();
        rbtn_inteira.setSelected(true);
        lbl_valor.setText("R$ 40,00");

        Filme f = sessao.getFilme();
        //DIAWJDIOWA
        lbl_titulo.setText("Titulo: " + f.getTitulo());
        lbl_duracao.setText("Duração: " + formatDuration(f.getDuracao()));
        lbl_genero.setText("Gênero: " + f.getGenero());
        lbl_sinopse.setText("Sinopse: " + f.getSinopse());
        lbl_classificacao.setText("Classificação: " + Integer.toString(f.getClassificacao()) + " anos");
        lbl_exibicao.setText("Exibição: " + f.getExibicao().getName() + " - " + f.getLinguagem().toString());
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        lbl_valor = new javax.swing.JLabel();
        txt_nome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_idade = new javax.swing.JTextField();
        cbox_poltrona = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        rbtn_inteira = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        rbtn_meia_entrada = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        lbl_titulo = new javax.swing.JLabel();
        lbl_duracao = new javax.swing.JLabel();
        lbl_genero = new javax.swing.JLabel();
        lbl_classificacao = new javax.swing.JLabel();
        lbl_exibicao = new javax.swing.JLabel();
        lbl_sinopse = new javax.swing.JLabel();
        btn_voltar = new javax.swing.JButton();
        btn_confirmar = new javax.swing.JButton();

        setBackground(new java.awt.Color(102, 102, 102));

        lbl_valor.setBackground(new java.awt.Color(0, 153, 102));
        lbl_valor.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbl_valor.setForeground(new java.awt.Color(255, 255, 255));
        lbl_valor.setText("valor");

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nome");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Idade");

        cbox_poltrona.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Poltrona 1", "Poltrona 2", "Poltrona 3", "Poltrona 4" }));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Poltrona");

        rbtn_inteira.setBackground(new java.awt.Color(102, 102, 102));
        buttonGroup1.add(rbtn_inteira);
        rbtn_inteira.setForeground(new java.awt.Color(255, 255, 255));
        rbtn_inteira.setText("Inteira");
        rbtn_inteira.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn_inteiraActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(0, 153, 102));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Valor:");

        rbtn_meia_entrada.setBackground(new java.awt.Color(102, 102, 102));
        buttonGroup1.add(rbtn_meia_entrada);
        rbtn_meia_entrada.setForeground(new java.awt.Color(255, 255, 255));
        rbtn_meia_entrada.setText("Meia entrada");
        rbtn_meia_entrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn_meia_entradaActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tipo de ingresso: ");

        lbl_titulo.setForeground(new java.awt.Color(255, 255, 255));
        lbl_titulo.setText("jLabel12");

        lbl_duracao.setForeground(new java.awt.Color(255, 255, 255));
        lbl_duracao.setText("jLabel13");

        lbl_genero.setForeground(new java.awt.Color(255, 255, 255));
        lbl_genero.setText("jLabel14");

        lbl_classificacao.setForeground(new java.awt.Color(255, 255, 255));
        lbl_classificacao.setText("jLabel15");

        lbl_exibicao.setForeground(new java.awt.Color(255, 255, 255));
        lbl_exibicao.setText("jLabel16");

        lbl_sinopse.setBackground(new java.awt.Color(102, 102, 102));
        lbl_sinopse.setForeground(new java.awt.Color(255, 255, 255));
        lbl_sinopse.setText("jLabel17");
        lbl_sinopse.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lbl_sinopse.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lbl_sinopse.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        btn_voltar.setText("Voltar");
        btn_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_voltarActionPerformed(evt);
            }
        });

        btn_confirmar.setText("Confirmar");
        btn_confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_confirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_titulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_sinopse, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_classificacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(156, 156, 156))
                    .addComponent(lbl_genero, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_duracao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_exibicao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_valor)
                        .addGap(25, 25, 25))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(116, 116, 116)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(rbtn_meia_entrada)
                                .addComponent(rbtn_inteira)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3))
                                    .addGap(25, 25, 25)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cbox_poltrona, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_idade, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(249, 249, 249)
                            .addComponent(btn_voltar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btn_confirmar))))
                .addGap(41, 41, 41))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(lbl_titulo))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txt_idade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_duracao))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbox_poltrona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(lbl_genero))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(lbl_exibicao))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbtn_inteira))
                    .addComponent(lbl_classificacao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbtn_meia_entrada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(lbl_valor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_voltar)
                            .addComponent(btn_confirmar)))
                    .addComponent(lbl_sinopse, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
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
        }
    }//GEN-LAST:event_rbtn_meia_entradaActionPerformed

    private void btn_confirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_confirmarActionPerformed
        Poltrona poltrona = sessao.poltronas.get(cbox_poltrona.getSelectedIndex());

        if (poltrona.ocupada) {
            JOptionPane.showMessageDialog(null, "Erro, poltrona já está ocupada!");
            return;
        }
        try {
            int idade = Integer.parseInt(txt_idade.getText());
            if (sessao.getFilme().getClassificacao() > idade) {
                JOptionPane.showMessageDialog(null, "Erro, idade abaixo da classificação!");
                return;
            }
            poltrona.ocupada = true;

            Ingresso ing = ControladorEntidades.getInstance().geraIngresso(sessao, rbtn_inteira.isSelected());

            JOptionPane.showMessageDialog(null, "Ingresso gerado com sucesso! \r\nID: " + ing.ID);
            ((MainFrame) SwingUtilities.getWindowAncestor(this)).exibeTelaPrincipal();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Erro, idade em formato inválido!");
        }
    }//GEN-LAST:event_btn_confirmarActionPerformed

    private void btn_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_voltarActionPerformed
        ((MainFrame) SwingUtilities.getWindowAncestor(this)).exibeTelaCompraDeIngressos();
    }//GEN-LAST:event_btn_voltarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_confirmar;
    private javax.swing.JButton btn_voltar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbox_poltrona;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lbl_classificacao;
    private javax.swing.JLabel lbl_duracao;
    private javax.swing.JLabel lbl_exibicao;
    private javax.swing.JLabel lbl_genero;
    private javax.swing.JLabel lbl_sinopse;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JLabel lbl_valor;
    private javax.swing.JRadioButton rbtn_inteira;
    private javax.swing.JRadioButton rbtn_meia_entrada;
    private javax.swing.JTextField txt_idade;
    private javax.swing.JTextField txt_nome;
    // End of variables declaration//GEN-END:variables
}
