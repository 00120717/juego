/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Color;
import java.awt.Container;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Marvin Ramirez
 */
public class Gui extends JFrame{
   private JLabel [] labels;
   
   private String[] nombres = {"BD1","Pad Left","Pad Right"};
         
    public Gui(){
        super("pinball");
        initialComponents();    
    }
    
    public void initialComponents(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        JLabel label = new JLabel();
        Container container = getContentPane();
        label.setBounds(10, 10, 75, 70);
        
        ImageIcon fot = new ImageIcon(getClass().getResource("BD1.png"));
        Icon icono = new ImageIcon(fot.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_DEFAULT));
        label.setIcon(icono);
        this.repaint();
        container.add(label);
       
        setSize(800,650);
    }
    
    public static void main(String[] args){
        java.awt.EventQueue.invokeLater(new Runnable(){
            @Override
            public void run(){
            new Gui().setVisible(true);
        }                  
    });
    }
}
