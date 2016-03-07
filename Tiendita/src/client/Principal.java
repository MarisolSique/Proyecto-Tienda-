package client;

import java.awt.Color;
import java.awt.Dimension;

import java.awt.Font;
import java.awt.Rectangle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToggleButton;

public class Principal extends JFrame {
    private JLabel jLabel1 = new JLabel();
    private JLabel jLabel2 = new JLabel();
    private JToggleButton jToggleButton1 = new JToggleButton();
    private JToggleButton jToggleButton2 = new JToggleButton();

    public Principal()
    {   
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.getContentPane().setLayout( null );
        this.setSize(new Dimension(650, 437));
        this.setTitle("La Tiendita");
        
        jLabel1.setText("La Tiendita");
        jLabel1.setBounds(new Rectangle(195, 15, 260, 60));
        jLabel1.setForeground(new Color(0, 82, 255));
        jLabel1.setFont(new Font("Constantia", 1, 41));
        jLabel2.setText("Sistema de Reportes");
        jLabel2.setBounds(new Rectangle(205, 60, 215, 40));
        jLabel2.setFont(new Font("Constantia", 3, 22));
        jLabel2.setForeground(new Color(0, 148, 231));
        jToggleButton1.setText("Comenzar");
        jToggleButton1.setBounds(new Rectangle(435, 250, 165, 40));
        jToggleButton1.setFont(new Font("Constantia", 0, 16));
        jToggleButton1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    jToggleButton1_actionPerformed(e);
                }
            });
        jToggleButton2.setText("Terminar");
        jToggleButton2.setBounds(new Rectangle(435, 315, 165, 40));
        jToggleButton2.setFont(new Font("Constantia", 0, 17));
        jToggleButton2.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    jToggleButton2_actionPerformed(e);
                }
            });
        this.getContentPane().add(jToggleButton2, null);
        this.getContentPane().add(jToggleButton1, null);
        this.getContentPane().add(jLabel2, null);
        this.getContentPane().add(jLabel1, null); 
            
            
    }
    

    private void jToggleButton2_actionPerformed(ActionEvent e) 
    {
        System.exit(0);
    }

    private void jToggleButton1_actionPerformed(ActionEvent e) 
    {
        Opciones obj = new Opciones();
        obj.setVisible(true);
        this.dispose();
        
    }
}
