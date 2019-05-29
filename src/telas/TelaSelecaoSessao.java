package telas;

import componentes.InfoFilme;
import componentes.InfoSessao;
import entidades.Filme;
import entidades.Sessao;
import entidades.Poltrona;
import entidades.Ingresso;
import controladores.ControladorEntidades;
import controladores.ControladorSessao;
import enums.Classificacao;
import java.time.Duration;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import java.awt.*;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalField;

import java.util.*;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class TelaSelecaoSessao extends javax.swing.JPanel {

  
    public static String formatDuration(Duration duration) {
        long seconds = duration.getSeconds();
        long absSeconds = Math.abs(seconds);
        String positive = String.format(
                "%02d:%02d:%02d",
                absSeconds / 3600,
                (absSeconds % 3600) / 60,
                absSeconds % 60);
        return seconds < 0 ? "-" + positive : positive;
    }
    
    public static String formatLocalTimeHourMinute(LocalTime time){
        long seconds = time.get(ChronoField.SECOND_OF_DAY);
        long absSeconds = Math.abs(seconds);
        String positive = String.format(
                "%02d:%02d",
                absSeconds / 3600,
                (absSeconds % 3600) / 60);
        return seconds < 0 ? "-" + positive : positive;
    }
    
    public static String formatDurationHourMinute(Duration duration) {
        long seconds = duration.getSeconds();
        long absSeconds = Math.abs(seconds);
        String positive = String.format(
                "%02d:%02d",
                absSeconds / 3600,
                (absSeconds % 3600) / 60);
        return seconds < 0 ? "-" + positive : positive;
    }

    private final Filme filme;
    public void trocaCorClassif(){
        if(filme.getClassificacao().equals(Classificacao.LIVRE)){
            lbl_classificacao.setBackground(Color.green);
            lbl_classificacao.setText("L");
        }
       if(filme.getClassificacao().equals(Classificacao.DEZ)){
            lbl_classificacao.setBackground(Color.blue);
        }
       if(filme.getClassificacao().equals(Classificacao.DOZE)){
            lbl_classificacao.setForeground(Color.black);
            lbl_classificacao.setBackground(Color.yellow);
        }
         if(filme.getClassificacao().equals(Classificacao.QUATORZE)){
            lbl_classificacao.setBackground(Color.orange);
        }
            if(filme.getClassificacao().equals(Classificacao.DEZESSEIS)){
            lbl_classificacao.setBackground(Color.red);
        }   if(filme.getClassificacao().equals(Classificacao.DEZOITO)){
            lbl_classificacao.setBackground(Color.black);
        }
    }
   
    TelaSelecaoSessao(Filme filme) {
        this.filme = filme;
        
        initComponents();
//      jPanel1.add(new JLabel("testeeeeee"));;
        
        
        //opaque pra trocar o background
        lbl_classificacao.setOpaque(true);
        //pega dados do filme
        lbl_titulo.setText(filme.getTitulo());
        lbl_duracao.setText(formatDuration(filme.getDuracao()));
        lbl_genero.setText(filme.getGenero());
        lbl_classificacao.setText(filme.getClassificacao().getName());
        jTextPane1.setText(filme.getSinopse());
        painelImagemFundo1.setImg(new ImageIcon(filme.getImage()));
        trocaCorClassif();
    }
      


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        btn_voltar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        lbl_titulo = new javax.swing.JLabel();
        lbl_duracao = new javax.swing.JLabel();
        lbl_genero = new javax.swing.JLabel();
        lbl_classificacao = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        painelImagemFundo1 = new entidades.PainelImagemFundo();
        jPanel1 = new InfoSessao(this.filme);

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

        lbl_classificacao.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_classificacao.setForeground(new java.awt.Color(250, 250, 250));
        lbl_classificacao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_classificacao.setText("18");

        jTextPane1.setEditable(false);
        jTextPane1.setBackground(new java.awt.Color(51, 51, 51));
        jTextPane1.setBorder(null);
        jTextPane1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jTextPane1.setForeground(new java.awt.Color(250, 250, 250));
        jTextPane1.setSelectionColor(new java.awt.Color(250, 250, 250));
        jScrollPane2.setViewportView(jTextPane1);

        javax.swing.GroupLayout painelImagemFundo1Layout = new javax.swing.GroupLayout(painelImagemFundo1);
        painelImagemFundo1.setLayout(painelImagemFundo1Layout);
        painelImagemFundo1Layout.setHorizontalGroup(
            painelImagemFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );
        painelImagemFundo1Layout.setVerticalGroup(
            painelImagemFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 303, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(409, 409, 409)
                        .addComponent(jLabel12))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(painelImagemFundo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_genero, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbl_classificacao, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_duracao))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btn_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 765, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(199, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel12)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_titulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lbl_genero, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbl_duracao))
                            .addComponent(lbl_classificacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(painelImagemFundo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btn_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(172, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_voltarActionPerformed
        ((MainFrame) SwingUtilities.getWindowAncestor(this)).exibeTelaSelecaoFilme();
    }//GEN-LAST:event_btn_voltarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_voltar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JLabel lbl_classificacao;
    private javax.swing.JLabel lbl_duracao;
    private javax.swing.JLabel lbl_genero;
    private javax.swing.JLabel lbl_titulo;
    private entidades.PainelImagemFundo painelImagemFundo1;
    // End of variables declaration//GEN-END:variables

   

   
}
