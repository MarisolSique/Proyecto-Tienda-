package interfaz;

import java.awt.Dimension;

import java.awt.Rectangle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JToggleButton;
import javax.swing.table.DefaultTableModel;

public class EdicionSucursales extends JFrame {
    private JToggleButton jToggleButton1 = new JToggleButton();

    public EdicionSucursales() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    DefaultTableModel aModel = new DefaultTableModel() {
    public boolean isCellEditable(int row, int column) {
        return false;
    }
    };
        
    private void jbInit() throws Exception {
        this.getContentPane().setLayout( null );
        this.setSize(new Dimension(605, 407));
       
       this.setTitle("Sucursales");
      
       String[] columnNames = {"Sucursal"};
        jToggleButton1.setText("Regresar a Menu");
        jToggleButton1.setBounds(new Rectangle(445, 330, 140, 30));
        jToggleButton1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    jToggleButton1_actionPerformed(e);
                }
            });
        this.getContentPane().add(jToggleButton1, null);
        
        setLocationRelativeTo(null);
    }

    private void jToggleButton1_actionPerformed(ActionEvent e)
    {
        Opciones op = new Opciones();
        op.setVisible(true);
        this.dispose();
    }
}
