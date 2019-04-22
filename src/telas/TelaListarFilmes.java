package telas;

import controladores.ControladorFilme;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class TelaListarFilmes extends javax.swing.JPanel {

    public TelaListarFilmes() {
        initComponents();

        list_filmes.setListData(ControladorFilme.getInstance().nomesFilmesEDescricao());
        refresh();
    }
    
     public void refresh(){
        list_filmes.setListData(ControladorFilme.getInstance().nomesFilmesEDescricao());
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        list_filmes = new javax.swing.JList<String>();
        jLabel1 = new javax.swing.JLabel();
        btn_voltar = new javax.swing.JButton();
        btn_remover_filme = new javax.swing.JButton();

        setBackground(new java.awt.Color(55, 55, 55));
        setAlignmentY(1.0F);

        list_filmes.setBackground(new java.awt.Color(76, 76, 76));
        list_filmes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        list_filmes.setForeground(new java.awt.Color(37, 184, 255));
        jScrollPane1.setViewportView(list_filmes);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(37, 184, 255));
        jLabel1.setText("Filmes em cartaz");

        btn_voltar.setText("Voltar");
        btn_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_voltarActionPerformed(evt);
            }
        });

        btn_remover_filme.setText("Remover");
        btn_remover_filme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_remover_filmeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(399, 399, 399)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 271, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_remover_filme)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(btn_voltar)
                            .addGap(41, 41, 41))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(226, 226, 226)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_remover_filme)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(btn_voltar)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_voltarActionPerformed
        ((MainFrame) SwingUtilities.getWindowAncestor(this)).exibeTelaFuncionario();
    }//GEN-LAST:event_btn_voltarActionPerformed

    private void btn_remover_filmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_remover_filmeActionPerformed
       int dialogButton = JOptionPane.YES_NO_OPTION;
       int dialogResult = JOptionPane.showConfirmDialog (null, "Você tem certeza que deseja excluir este filme?","Warning",dialogButton);
       if(dialogResult == JOptionPane.YES_OPTION){ 
       ControladorFilme.getInstance().filmes.remove(list_filmes.getSelectedIndex());
       }else{
          ((MainFrame) SwingUtilities.getWindowAncestor(this)).exibeTelaListaFilmes(); 
       }
       refresh();
    }//GEN-LAST:event_btn_remover_filmeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_remover_filme;
    private javax.swing.JButton btn_voltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> list_filmes;
    // End of variables declaration//GEN-END:variables
}
