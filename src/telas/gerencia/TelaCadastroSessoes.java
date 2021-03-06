package telas.gerencia;

import entidades.Filme;
import entidades.Sala;
import controladores.ControladorFilme;
import controladores.ControladorSessao;
import controladores.ControladorEntidades;
import entidades.Sessao;
import enums.Classificacao;
import enums.Exibicao;
import enums.Linguagem;
import java.time.format.DateTimeParseException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import telas.MainFrame;
import telas.TelaSelecaoSessao;

public class TelaCadastroSessoes extends javax.swing.JPanel {

    private final Sessao sessao;

    public TelaCadastroSessoes(Sessao sessao) {
        initComponents();
        this.sessao = sessao;

        for (Sala sala : ControladorEntidades.getInstance().salas) {
            cbox_sala.addItem(sala);
        }

        cbox_filme.setModel(new DefaultComboBoxModel<>(ControladorFilme.getInstance().nomesFilmes()));
        cbox_linguagem.setModel(new DefaultComboBoxModel(Linguagem.values()));
        cbox_exibicao.setModel(new DefaultComboBoxModel(Exibicao.valuesNormais()));

        if (sessao != null) {
            txt_horario.setText(TelaSelecaoSessao.formatLocalTimeHourMinute(sessao.getHorario()));
            txt_horario.setEditable(false);
            cbox_sala.setSelectedItem(sessao.getSala());
            cbox_filme.setSelectedItem(sessao.getFilme().getTitulo());
            cbox_filme.setEnabled(false);
            cbox_linguagem.setSelectedItem(sessao.getLinguagem().name());
            cbox_exibicao.setSelectedItem(sessao.getExibicao().getName());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_titulo_formulario = new javax.swing.JLabel();
        btn_voltar = new javax.swing.JButton();
        btn_salvar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        cbox_sala = new javax.swing.JComboBox<>();
        txt_horario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cbox_filme = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cbox_exibicao = new javax.swing.JComboBox<>();
        cbox_linguagem = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(55, 55, 55));

        lbl_titulo_formulario.setBackground(new java.awt.Color(37, 184, 255));
        lbl_titulo_formulario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbl_titulo_formulario.setForeground(new java.awt.Color(37, 184, 255));
        lbl_titulo_formulario.setText("Cadastro de sessão");

        btn_voltar.setText("Voltar");
        btn_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_voltarActionPerformed(evt);
            }
        });

        btn_salvar.setText("Salvar");
        btn_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvarActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(76, 76, 76));

        cbox_sala.setBackground(new java.awt.Color(250, 250, 250));

        txt_horario.setBackground(new java.awt.Color(250, 250, 250));
        txt_horario.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setForeground(new java.awt.Color(37, 184, 255));
        jLabel4.setText("Filme:");

        cbox_filme.setBackground(new java.awt.Color(250, 250, 250));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setForeground(new java.awt.Color(37, 184, 255));
        jLabel1.setText("Sala:");

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setForeground(new java.awt.Color(37, 184, 255));
        jLabel2.setText("Horário:");

        jLabel3.setForeground(new java.awt.Color(37, 184, 255));
        jLabel3.setText("(HH:mm)");

        jLabel6.setForeground(new java.awt.Color(37, 184, 255));
        jLabel6.setText("Linguagem:");

        jLabel7.setForeground(new java.awt.Color(37, 184, 255));
        jLabel7.setText("Exibição:");

        cbox_exibicao.setBackground(new java.awt.Color(250, 250, 250));
        cbox_exibicao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3D" }));

        cbox_linguagem.setBackground(new java.awt.Color(250, 250, 250));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(cbox_linguagem, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cbox_filme, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbox_sala, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(txt_horario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(42, 42, 42)
                        .addComponent(cbox_exibicao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbox_sala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_horario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbox_filme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(cbox_linguagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cbox_exibicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(btn_voltar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_salvar)
                .addGap(25, 25, 25))
            .addGroup(layout.createSequentialGroup()
                .addGap(387, 387, 387)
                .addComponent(lbl_titulo_formulario)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(364, 364, 364)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(344, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(lbl_titulo_formulario)
                .addGap(50, 50, 50)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 173, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_voltar)
                    .addComponent(btn_salvar))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarActionPerformed
        String horario = txt_horario.getText();

        Sala sala = (Sala) cbox_sala.getSelectedItem();
        Filme filme = ControladorFilme.getInstance().getFilmeByTitulo(cbox_filme.getSelectedItem().toString());

        Linguagem linguagem = Linguagem.valueOf(cbox_linguagem.getSelectedItem().toString());
        Exibicao exibicao = Exibicao.getExibicao(cbox_exibicao.getSelectedItem().toString());

        try {
            if (sessao != null) {
                ControladorSessao.getInstance().editar(sala, exibicao, linguagem, sessao);
                JOptionPane.showMessageDialog(null, "Sessao alterada com sucesso!");
                ((MainFrame) SwingUtilities.getWindowAncestor(this)).exibeTelaListaSessoes();
            } else {
                ControladorSessao.getInstance().cadastra(sala, horario, filme, exibicao, linguagem);
                JOptionPane.showMessageDialog(null, "Sessao cadastrada com sucesso!");
                ((MainFrame) SwingUtilities.getWindowAncestor(this)).exibeTelaFuncionario();
            }

        } catch (DateTimeParseException ex) {
            JOptionPane.showMessageDialog(null, "Horário em formato incorreto");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btn_salvarActionPerformed

    private void btn_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_voltarActionPerformed
        if (sessao != null) {
            ((MainFrame) SwingUtilities.getWindowAncestor(this)).exibeTelaListaSessoes();
        }else{
            ((MainFrame) SwingUtilities.getWindowAncestor(this)).exibeTelaFuncionario();
        }
        
    }//GEN-LAST:event_btn_voltarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_salvar;
    private javax.swing.JButton btn_voltar;
    private javax.swing.JComboBox<String> cbox_exibicao;
    private javax.swing.JComboBox<String> cbox_filme;
    private javax.swing.JComboBox<String> cbox_linguagem;
    private javax.swing.JComboBox<Sala> cbox_sala;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_titulo_formulario;
    private javax.swing.JTextField txt_horario;
    // End of variables declaration//GEN-END:variables
}
