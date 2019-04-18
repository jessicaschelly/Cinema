package telas;

import componentes.InfoFilme;
import componentes.InfoSessao;
import entidades.Filme;
import entidades.Sessao;
import entidades.Poltrona;
import entidades.Ingresso;
import controladores.ControladorEntidades;
import controladores.ControladorSessao;
import java.time.Duration;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import java.awt.*;

import java.util.*;
import javax.swing.ImageIcon;

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

    private Filme filme;
    
    
   
    TelaConfirmacaoIngresso(Filme filme) {
        this.filme = filme;
           
        initComponents();
      
        
        Filme f = this.filme;
        //pega dados do filme
        lbl_titulo.setText(f.getTitulo());
        lbl_duracao.setText(formatDuration(f.getDuracao()));
        lbl_genero.setText(f.getGenero());
        lbl_classificacao.setText(Integer.toString(f.getClassificacao()));
        lbl_exibicao.setText(f.getExibicao().getName() + " - " + f.getLinguagem().toString());
        jTextPane1.setText(f.getSinopse());
        painelImagemFundo1.setImg(new ImageIcon(f.getImage()));
        jPanel1.add(new InfoSessao(this.filme));
     
    }
      


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        btn_voltar = new javax.swing.JButton();
        btn_concluir = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        lbl_titulo = new javax.swing.JLabel();
        lbl_duracao = new javax.swing.JLabel();
        lbl_genero = new javax.swing.JLabel();
        lbl_exibicao = new javax.swing.JLabel();
        lbl_classificacao = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        painelImagemFundo1 = new entidades.PainelImagemFundo();
        jPanel1 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(51, 51, 51));

        btn_voltar.setBackground(new java.awt.Color(95, 0, 0));
        btn_voltar.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btn_voltar.setForeground(new java.awt.Color(250, 250, 250));
        btn_voltar.setText("Voltar");
        btn_voltar.setToolTipText("");
        btn_voltar.setMinimumSize(new java.awt.Dimension(162, 95));
        btn_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_voltarActionPerformed(evt);
            }
        });

        btn_concluir.setBackground(new java.awt.Color(52, 163, 55));
        btn_concluir.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btn_concluir.setForeground(new java.awt.Color(250, 250, 250));
        btn_concluir.setText("Concluir");
        btn_concluir.setMinimumSize(new java.awt.Dimension(162, 95));
        btn_concluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_concluirActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(250, 250, 250));
        jLabel12.setText("Confirmação do Ingresso");

        lbl_titulo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl_titulo.setForeground(new java.awt.Color(37, 184, 255));
        lbl_titulo.setText("Titulo do Filme");

        lbl_duracao.setForeground(new java.awt.Color(250, 250, 250));
        lbl_duracao.setText("jLabel13");

        lbl_genero.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbl_genero.setForeground(new java.awt.Color(250, 250, 250));
        lbl_genero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_genero.setText("jLabel14");
        lbl_genero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250, 250, 250)));

        lbl_exibicao.setForeground(new java.awt.Color(250, 250, 250));
        lbl_exibicao.setText("jLabel16");

        lbl_classificacao.setForeground(new java.awt.Color(250, 250, 250));
        lbl_classificacao.setText("18");

        jTextPane1.setEditable(false);
        jTextPane1.setBackground(new java.awt.Color(51, 51, 51));
        jTextPane1.setBorder(null);
        jTextPane1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jTextPane1.setForeground(new java.awt.Color(250, 250, 250));
        jTextPane1.setSelectionColor(new java.awt.Color(51, 51, 51));
        jScrollPane2.setViewportView(jTextPane1);

        javax.swing.GroupLayout painelImagemFundo1Layout = new javax.swing.GroupLayout(painelImagemFundo1);
        painelImagemFundo1.setLayout(painelImagemFundo1Layout);
        painelImagemFundo1Layout.setHorizontalGroup(
            painelImagemFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );
        painelImagemFundo1Layout.setVerticalGroup(
            painelImagemFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 934, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(360, 360, 360))
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(btn_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_concluir, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_genero, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbl_classificacao, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_duracao))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(painelImagemFundo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(lbl_exibicao, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel12)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(painelImagemFundo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_titulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_genero, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_classificacao)
                            .addComponent(lbl_duracao))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lbl_exibicao)
                                .addGap(8, 8, 8)))))
                .addGap(47, 47, 47)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_concluir, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_voltarActionPerformed
        ((MainFrame) SwingUtilities.getWindowAncestor(this)).exibeTelaSelecaoFilme();
    }//GEN-LAST:event_btn_voltarActionPerformed

    private void btn_concluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_concluirActionPerformed
        Sessao sessao = ControladorSessao.getInstance().getSessoesByFilme(filme).get(0);

        ((MainFrame) SwingUtilities.getWindowAncestor(this)).exibeTelaPagamento(sessao);
    }//GEN-LAST:event_btn_concluirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_concluir;
    private javax.swing.JButton btn_voltar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JLabel lbl_classificacao;
    private javax.swing.JLabel lbl_duracao;
    private javax.swing.JLabel lbl_exibicao;
    private javax.swing.JLabel lbl_genero;
    private javax.swing.JLabel lbl_titulo;
    private entidades.PainelImagemFundo painelImagemFundo1;
    // End of variables declaration//GEN-END:variables

   

   
}
