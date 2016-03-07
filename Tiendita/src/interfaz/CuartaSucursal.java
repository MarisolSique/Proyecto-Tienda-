package interfaz;

import java.awt.Dimension;

import java.awt.Rectangle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JToggleButton;

public class CuartaSucursal extends JFrame {
    private JToggleButton jToggleButton1 = new JToggleButton();

    public CuartaSucursal() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.getContentPane().setLayout( null );
        this.setSize( new Dimension(400, 300) );
        setLocationRelativeTo(null);
        
        jToggleButton1.setText("Regresar a Sucursales");
        jToggleButton1.setBounds(new Rectangle(210, 230, 165, 20));
        jToggleButton1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    jToggleButton1_actionPerformed(e);
                }
            });
        this.getContentPane().add(jToggleButton1, null);
    }

    private void jToggleButton1_actionPerformed(ActionEvent e) {
        Sucursales sucurs = new Sucursales();
        sucurs.setVisible(true);
        this.dispose();
    }
}
