/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JButton;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

/**
 *
 * @author User
 */
public class MyButton extends JButton{
    public MyButton(String text){
        super(text);
        this.setBackground(new Color(51,51,51));
        this.setForeground(colorLegal);
        this.setPreferredSize(new Dimension(170, 60));;
        this.setBorder(new LineBorder(colorLegal, 2));
        this.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 22)); 
    }
    
    private Color colorLegal = new Color(37, 184, 255);
//    @Override
//    protected void paintComponent(Graphics g)
//    {
// 
//        super.paintComponent(g);
//        
////                this.repaint();
//
//    }
}
    

