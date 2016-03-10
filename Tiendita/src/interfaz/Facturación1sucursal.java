
package interfaz;

import java.awt.Dimension;
import java.awt.Rectangle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JToggleButton;

public class Facturación1sucursal extends JFrame {


    private JToggleButton jToggleButton1 = new JToggleButton();
    private JToggleButton jToggleButton2 = new JToggleButton();
    private JToggleButton jToggleButton3 = new JToggleButton();

    public Facturación1sucursal() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.getContentPane().setLayout(null);
        this.setSize(new Dimension(605, 407));
        this.setTitle("Facturación");
        jToggleButton1.setText("Regresar...");
        jToggleButton1.setBounds(new Rectangle(30, 340, 107, 21));
        jToggleButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jToggleButton1_actionPerformed(e);
            }
        });
        jToggleButton2.setText("Creaci\u00f3n de Nueva Factura");
        jToggleButton2.setBounds(new Rectangle(55, 55, 170, 55));
        jToggleButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jToggleButton2_actionPerformed(e);
            }
        });
        jToggleButton3.setText("Reporte de facturas ");
        jToggleButton3.setBounds(new Rectangle(305, 60, 205, 50));
        this.getContentPane().add(jToggleButton3, null);
        this.getContentPane().add(jToggleButton2, null);
        this.getContentPane().add(jToggleButton1, null);
        setLocationRelativeTo(null);

    }

    private void jToggleButton1_actionPerformed(ActionEvent e) {
        
        PrimeraSucursal prim = new PrimeraSucursal();
        prim.setVisible(true);
        this.dispose();  
        }

    private void jToggleButton2_actionPerformed(ActionEvent e) {
        
        CreacionFacturaPrimeraSucursal fact = new CreacionFacturaPrimeraSucursal();
        fact.setVisible(true);
        this.dispose();
    }
}
