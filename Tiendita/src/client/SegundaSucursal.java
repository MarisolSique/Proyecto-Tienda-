package client;

import java.awt.Dimension;

import java.awt.Rectangle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JToggleButton;

public class SegundaSucursal extends JFrame {
    private JToggleButton jToggleButton1 = new JToggleButton();

    public SegundaSucursal() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.getContentPane().setLayout( null );
        this.setSize( new Dimension(400, 300) );
        jToggleButton1.setText("Regresar a Sucursales");
        jToggleButton1.setBounds(new Rectangle(275, 240, 107, 21));
        jToggleButton1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    jToggleButton1_actionPerformed(e);
                }
            });
        this.getContentPane().add(jToggleButton1, null);
    }

    private void jToggleButton1_actionPerformed(ActionEvent e) 
    {
        Sucursales su = new Sucursales();
        su.setVisible(true);
        this.dispose();
    }
}
