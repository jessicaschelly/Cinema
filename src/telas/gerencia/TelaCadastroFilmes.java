package telas.gerencia;

import entidades.Filme;
import enums.Classificacao;
import enums.Exibicao;
import enums.Linguagem;
import java.io.File;
import java.time.format.DateTimeParseException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.FileSystemView;
import telas.MainFrame;
import telas.TelaSelecaoSessao;

public class TelaCadastroFilmes extends javax.swing.JPanel {

    private final Filme filme;

    public TelaCadastroFilmes(Filme filme) {
        initComponents();
        cbox_classificacao.setModel(new DefaultComboBoxModel(Classificacao.valuesNormais()));

        this.filme = filme;
        if (filme != null) {
            lbl_titulo_formulario.setText("Editar Filme");
            ArquivoSelecionado = filme.getImage();
            txt_duracao.setText(TelaSelecaoSessao.formatDuration(filme.getDuracao()));
            txt_genero.setText(filme.getGenero());
            txt_sinopse.setText(filme.getSinopse());
            txt_titulo.setText(filme.getTitulo());
            cbox_classificacao.setSelectedItem(filme.getClassificacao().getName());
            if (ArquivoSelecionado != null){
                jButton1.setText("Alterar imagem");
            }
        } else {
            lbl_titulo_formulario.setText("Cadastrar Filme");
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_voltar = new javax.swing.JButton();
        btn_salvar = new javax.swing.JButton();
        lbl_titulo_formulario = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txt_duracao = new javax.swing.JTextField();
        txt_titulo = new javax.swing.JTextField();
        txt_genero = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_sinopse = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        cbox_classificacao = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(51, 51, 51));

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

        lbl_titulo_formulario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbl_titulo_formulario.setForeground(new java.awt.Color(37, 184, 255));
        lbl_titulo_formulario.setText("Cadastro de filmes");

        jPanel1.setBackground(new java.awt.Color(76, 76, 76));

        txt_duracao.setBackground(new java.awt.Color(250, 250, 250));
        txt_duracao.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        txt_titulo.setBackground(new java.awt.Color(250, 250, 250));
        txt_titulo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        txt_genero.setBackground(new java.awt.Color(250, 250, 250));
        txt_genero.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        txt_sinopse.setBackground(new java.awt.Color(250, 250, 250));
        txt_sinopse.setColumns(20);
        txt_sinopse.setRows(5);
        txt_sinopse.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane1.setViewportView(txt_sinopse);

        jLabel1.setForeground(new java.awt.Color(37, 184, 255));
        jLabel1.setText("Título: ");

        jLabel2.setForeground(new java.awt.Color(37, 184, 255));
        jLabel2.setText("Duração: ");

        jLabel3.setForeground(new java.awt.Color(37, 184, 255));
        jLabel3.setText("Sinopse:");

        jLabel5.setForeground(new java.awt.Color(37, 184, 255));
        jLabel5.setText("Classificação:");

        jLabel4.setForeground(new java.awt.Color(37, 184, 255));
        jLabel4.setText("Gênero: ");

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("(HH:mm:ss)");

        jLabel11.setForeground(new java.awt.Color(37, 184, 255));
        jLabel11.setText("Imagem:");

        jButton1.setText("Selecionar imagem");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        cbox_classificacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbox_classificacao, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addGap(25, 34, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_genero, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txt_duracao, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))))
                .addContainerGap(128, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_duracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbox_classificacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jButton1))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(btn_voltar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_salvar)
                .addGap(22, 22, 22))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(312, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbl_titulo_formulario)
                        .addGap(360, 360, 360))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(218, 218, 218))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(lbl_titulo_formulario)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 154, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_voltar)
                    .addComponent(btn_salvar))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarActionPerformed
        String titulo = txt_titulo.getText();
        String duracao = txt_duracao.getText();
        String genero = txt_genero.getText();
        String image = ArquivoSelecionado;

        Classificacao classificacao = Classificacao.getClassificacao(cbox_classificacao.getSelectedItem().toString());
        String sinopse = txt_sinopse.getText();

        try {
            if (filme != null) {
                controladores.ControladorFilme.getInstance().edita(titulo, duracao, genero, sinopse, classificacao, image, filme);
                JOptionPane.showMessageDialog(null, "Filme editado com sucesso!");
                ((MainFrame) SwingUtilities.getWindowAncestor(this)).exibeTelaListaFilmes();
            } else {
                controladores.ControladorFilme.getInstance().cadastra(titulo, duracao, genero, sinopse, classificacao, image);
                JOptionPane.showMessageDialog(null, "Filme cadastrado com sucesso!");
                ((MainFrame) SwingUtilities.getWindowAncestor(this)).exibeTelaFuncionario();
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Erro, insira uma classificação válida.");
        } catch (DateTimeParseException ex) {
            JOptionPane.showMessageDialog(null, "Duração em formato incorreto");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());

        }
    }//GEN-LAST:event_btn_salvarActionPerformed

    private void btn_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_voltarActionPerformed
        if (filme != null) {
            ((MainFrame) SwingUtilities.getWindowAncestor(this)).exibeTelaListaFilmes();
        } else {
            ((MainFrame) SwingUtilities.getWindowAncestor(this)).exibeTelaManterFilmes();
        }

    }//GEN-LAST:event_btn_voltarActionPerformed
    private String ArquivoSelecionado;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());

        int returnValue = jfc.showOpenDialog(null);
        // int returnValue = jfc.showSaveDialog(null);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = jfc.getSelectedFile();
            ArquivoSelecionado = jfc.getSelectedFile().getAbsolutePath();
            jButton1.setText("Alterar imagem");
        }


    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_salvar;
    private javax.swing.JButton btn_voltar;
    private javax.swing.JComboBox<String> cbox_classificacao;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_titulo_formulario;
    private javax.swing.JTextField txt_duracao;
    private javax.swing.JTextField txt_genero;
    private javax.swing.JTextArea txt_sinopse;
    private javax.swing.JTextField txt_titulo;
    // End of variables declaration//GEN-END:variables
}
