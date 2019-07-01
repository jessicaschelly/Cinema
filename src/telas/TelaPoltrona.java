/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import componentes.InfoPoltrona;
import entidades.Filme;
import entidades.Informacoes;
import entidades.Poltrona;
import entidades.Sessao;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import utils.Utils;

/**
 *
 * @author jsouza
 */
public class TelaPoltrona extends javax.swing.JPanel {

    /**
     * Creates new form TelaDadosCliente
     */
    private Informacoes informacoes;
    private Poltrona poltronaSelecionada;
    private InfoPoltrona infoPoltronaSelecionada;

    public TelaPoltrona(Informacoes informacoes) {

        this.informacoes = informacoes;

        initComponents();

        //TODO for testing
        txt_cpf_formatted.setText("11421161907");
        txt_idade.setText("20");

        lbl_nome_filme.setText(informacoes.sessao.getFilme().getTitulo());
        lbl_classificacao.setText(informacoes.sessao.getFilme().getClassificacao().getName());
        lbl_sala.setText(informacoes.sessao.getSala().getNomeDaSala());
        lbl_sessao.setText(informacoes.sessao.getHorario().toString());
        rbtn_inteira.setSelected(true);
        lbl_valor.setText("R$ 40,00");
        Filme f = informacoes.sessao.getFilme();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                Poltrona p = informacoes.sessao.poltronas.get(i * 4 + j);

                InfoPoltrona info = new InfoPoltrona(p);
                ActionListener actionListener = (ActionEvent e) -> {
                    poltronaCallback(info, p);
                };
                info.setCallback(actionListener);

                panel_poltronas.add(info);
            }
        }
    }

    public void poltronaCallback(InfoPoltrona infoPoltrona, Poltrona poltronaClicada) {
        System.out.println(poltronaClicada.posicao);

        if (poltronaClicada.ocupada) {
            JOptionPane.showMessageDialog(this, "Esta poltrona já está ocupada!");
            return;
        }

        if (this.infoPoltronaSelecionada != null) {
            this.infoPoltronaSelecionada.deseleciona();
        }

        this.poltronaSelecionada = poltronaClicada;
        this.infoPoltronaSelecionada = infoPoltrona;

        infoPoltrona.seleciona();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup3 = new javax.swing.ButtonGroup();
        jLabel4 = new javax.swing.JLabel();
        lbl_valor = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        rbtn_meia_entrada = new javax.swing.JRadioButton();
        rbtn_inteira = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_idade = new javax.swing.JTextField();
        txt_cpf_formatted = new javax.swing.JFormattedTextField();
        lbl_nome_filme = new javax.swing.JLabel();
        lbl_sessao = new javax.swing.JLabel();
        lbl_classificacao = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        panel_poltronas = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btn_salvar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        lbl_sala = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 51, 51));

        jLabel4.setBackground(new java.awt.Color(0, 153, 102));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(37, 184, 255));
        jLabel4.setText("Valor:");

        lbl_valor.setBackground(new java.awt.Color(0, 153, 102));
        lbl_valor.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbl_valor.setForeground(new java.awt.Color(37, 184, 255));
        lbl_valor.setText("valor");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(37, 184, 255));
        jLabel7.setText("SELEÇÃO DE POLTRONAS");

        jPanel1.setBackground(new java.awt.Color(101, 101, 101));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Selecione o tipo de ingresso:");

        rbtn_meia_entrada.setBackground(new java.awt.Color(101, 101, 101));
        buttonGroup3.add(rbtn_meia_entrada);
        rbtn_meia_entrada.setForeground(new java.awt.Color(37, 184, 255));
        rbtn_meia_entrada.setText("Meia entrada");
        rbtn_meia_entrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn_meia_entradaActionPerformed(evt);
            }
        });

        rbtn_inteira.setBackground(new java.awt.Color(101, 101, 101));
        buttonGroup3.add(rbtn_inteira);
        rbtn_inteira.setForeground(new java.awt.Color(37, 184, 255));
        rbtn_inteira.setText("Inteira");
        rbtn_inteira.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn_inteiraActionPerformed(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Insira seus dados:");

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CPF:");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Idade:");

        txt_idade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250, 250, 250), 4));
        txt_idade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idadeActionPerformed(evt);
            }
        });

        try {
            txt_cpf_formatted.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lbl_nome_filme.setForeground(new java.awt.Color(37, 184, 255));
        lbl_nome_filme.setText("jLabel3");

        lbl_sessao.setForeground(new java.awt.Color(37, 184, 255));
        lbl_sessao.setText("jLabel15");

        lbl_classificacao.setForeground(new java.awt.Color(37, 184, 255));
        lbl_classificacao.setText("jLabel3");

        jLabel3.setForeground(new java.awt.Color(250, 250, 250));
        jLabel3.setText("Titulo:");

        jLabel15.setForeground(new java.awt.Color(250, 250, 250));
        jLabel15.setText("Classificação:");

        jLabel16.setForeground(new java.awt.Color(250, 250, 250));
        jLabel16.setText("Horário:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(rbtn_meia_entrada)
                    .addComponent(rbtn_inteira)
                    .addComponent(jLabel8)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_cpf_formatted, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_idade, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_classificacao)
                            .addComponent(lbl_nome_filme, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_sessao, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbtn_meia_entrada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbtn_inteira)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_cpf_formatted, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_idade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nome_filme)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_classificacao)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_sessao)
                    .addComponent(jLabel16))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        panel_poltronas.setBackground(new java.awt.Color(102, 102, 102));
        panel_poltronas.setForeground(new java.awt.Color(101, 101, 101));
        panel_poltronas.setLayout(new java.awt.GridLayout(3, 4));

        jLabel5.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("A");

        jLabel9.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("B");

        jLabel10.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("C");

        jLabel11.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("1");

        jLabel12.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("2");

        jLabel13.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("3");

        jLabel14.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("4");

        btn_salvar.setText("Confirmar");
        btn_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvarActionPerformed(evt);
            }
        });

        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lbl_sala.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        lbl_sala.setForeground(new java.awt.Color(37, 184, 255));
        lbl_sala.setText("jLabel17");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(472, 472, 472)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 217, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(130, 130, 130)
                .addComponent(jLabel13)
                .addGap(126, 126, 126)
                .addComponent(jLabel14)
                .addGap(100, 100, 100))
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_salvar))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(lbl_valor))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel_poltronas, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(57, 57, 57))
            .addGroup(layout.createSequentialGroup()
                .addGap(513, 513, 513)
                .addComponent(lbl_sala, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jLabel7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lbl_sala)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panel_poltronas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jLabel5)
                        .addGap(84, 84, 84)
                        .addComponent(jLabel9)
                        .addGap(90, 90, 90)
                        .addComponent(jLabel10)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_valor)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_salvar)
                    .addComponent(jButton1))
                .addGap(26, 26, 26))
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

    private void txt_idadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idadeActionPerformed

    private void btn_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarActionPerformed
        String cpf = txt_cpf_formatted.getText().replace("-", "").replace(".", "");
        String idade = txt_idade.getText();

        try {

            if (!Utils.isCPF(cpf)) {
                JOptionPane.showMessageDialog(null, "Erro, insira um cpf válido.");
                return;
            }

            if (poltronaSelecionada == null) {
                JOptionPane.showMessageDialog(null, "Erro, selecione uma poltrona.");
                return;
            }

            int idadeNum = Integer.parseInt(idade);

            if (idadeNum < informacoes.sessao.getFilme().getClassificacao().getIdade()) {
                JOptionPane.showMessageDialog(null, "Erro, idade abaixo da classificação indicativa do filme.");
                return;
            }
            
            informacoes.valorIngresso = rbtn_meia_entrada.isSelected() ? 20 : 40;
            informacoes.poltrona = this.poltronaSelecionada;
            int aceitou = JOptionPane.showConfirmDialog(SwingUtilities.getWindowAncestor(this), "Deseja adicionar um combo da bomboniere?");
            if (aceitou == JOptionPane.YES_OPTION) {
                ((MainFrame) SwingUtilities.getWindowAncestor(this)).exibeTelaBombonier(informacoes);
            } else {
                ((MainFrame) SwingUtilities.getWindowAncestor(this)).exibeTelaPagamento(informacoes);
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Erro, insira uma idade válida.");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());

        }

    }//GEN-LAST:event_btn_salvarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ((MainFrame) SwingUtilities.getWindowAncestor(this)).exibeTelaSelecaoSessao(informacoes.sessao.getFilme());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void bvtataa() {

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_salvar;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_classificacao;
    private javax.swing.JLabel lbl_nome_filme;
    private javax.swing.JLabel lbl_sala;
    private javax.swing.JLabel lbl_sessao;
    private javax.swing.JLabel lbl_valor;
    private javax.swing.JPanel panel_poltronas;
    private javax.swing.JRadioButton rbtn_inteira;
    private javax.swing.JRadioButton rbtn_meia_entrada;
    private javax.swing.JFormattedTextField txt_cpf_formatted;
    private javax.swing.JTextField txt_idade;
    // End of variables declaration//GEN-END:variables
}
