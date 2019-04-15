/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentes;

import entidades.Filme;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import telas.MainFrame;

/**
 *
 * @author jsouza
 */
public class InfoFilme extends javax.swing.JPanel {

    /**
     * Creates new form InfoFilme
     */
    Filme filme;
    public InfoFilme(Filme filme) {
        initComponents();
        this.filme = filme;
        this.lbl_titulo.setText(filme.getTitulo());
        this.btn_filme.setIcon(new ImageIcon(filme.getImage()));
        this.btn_filme.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "");
            }
        });
        }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_filme = new javax.swing.JButton();
        lbl_titulo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 51, 51));

        btn_filme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_filmeActionPerformed(evt);
            }
        });

        lbl_titulo.setForeground(new java.awt.Color(37, 184, 255));
        lbl_titulo.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_filme, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_filme, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_titulo)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_filmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_filmeActionPerformed
     ((MainFrame) SwingUtilities.getWindowAncestor(this)).exibeTelaCompraDeIngressos();
    }//GEN-LAST:event_btn_filmeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_filme;
    private javax.swing.JLabel lbl_titulo;
    // End of variables declaration//GEN-END:variables
}
