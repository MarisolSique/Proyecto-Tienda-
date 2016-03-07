package client;

import java.awt.Color;
import java.awt.Dimension;

import java.awt.Font;
import java.awt.Rectangle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JToggleButton;

public class PrimeraSucursal extends JFrame {
    private JLabel jLabel1 = new JLabel();
    private JToggleButton jToggleButton1 = new JToggleButton();
    private JToggleButton jToggleButton2 = new JToggleButton();
    private JToggleButton jToggleButton3 = new JToggleButton();

    public PrimeraSucursal() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.getContentPane().setLayout( null );
        this.setSize(new Dimension(627, 412));
        setLocationRelativeTo(null);
        
        jLabel1.setText("Primera Sucursal");
        jLabel1.setBounds(new Rectangle(195, 25, 280, 30));
        jLabel1.setFont(new Font("Constantia", 0, 30));
        jLabel1.setForeground(new Color(0, 132, 198));
        jToggleButton1.setText("Cliente Nuevo ");
        jToggleButton1.setBounds(new Rectangle(40, 80, 110, 60));
        jToggleButton1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    jToggleButton1_actionPerformed(e);
                }
            });
        jToggleButton2.setText("Regresar a Sucursales");
        jToggleButton2.setBounds(new Rectangle(460, 330, 145, 35));
        jToggleButton2.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    jToggleButton2_actionPerformed(e);
                }
            });
        jToggleButton3.setText("Facturación");
        jToggleButton3.setBounds(new Rectangle(250, 80, 115, 60));
        this.getContentPane().add(jToggleButton3, null);
        this.getContentPane().add(jToggleButton2, null);
        this.getContentPane().add(jToggleButton1, null);
        this.getContentPane().add(jLabel1, null);
    }

    private void jToggleButton1_actionPerformed(ActionEvent e) {
    }

    private void jToggleButton2_actionPerformed(ActionEvent e) 
    {
        Sucursales sucu = new Sucursales();
        sucu.setVisible(true);
        this.dispose();
    }
}
