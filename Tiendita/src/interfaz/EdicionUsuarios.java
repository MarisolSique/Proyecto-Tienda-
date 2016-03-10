package interfaz;

import java.awt.Dimension;

import java.awt.Rectangle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.List;

import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JToggleButton;
import javax.swing.table.DefaultTableModel;

public class EdicionUsuarios extends JFrame {
    private JToggleButton jToggleButton1 = new JToggleButton();
    private JTable jTable1 = new JTable();
    private JToggleButton jToggleButton2 = new JToggleButton();
    private JToggleButton jToggleButton3 = new JToggleButton();
    private JToggleButton jToggleButton4 = new JToggleButton();
    public static Integer id = -1;
    private JEditorPane jEditorPane1 = new JEditorPane();
    
    public EdicionUsuarios() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    DefaultTableModel aModel = new DefaultTableModel() {
        //Tabla read-only
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };
    private void jbInit() throws Exception {
        this.getContentPane().setLayout( null );
        this.setSize(new Dimension(699, 294));
        this.setTitle("Usuarios");
        
        String[] columnNames = { "Nombre Completo", "Correo y/o Usuario"};
        jTable1.setFillsViewportHeight(true);
        aModel.setColumnIdentifiers(columnNames);
        
   
        
        jTable1.setBounds(new Rectangle(55, 45, 580, 130));
        jToggleButton2.setText("Eliminar Usuario");
        jToggleButton2.setBounds(new Rectangle(295, 220, 120, 20));
        jToggleButton3.setText("Moficar Usuario");
        jToggleButton3.setBounds(new Rectangle(430, 220, 107, 21));
        jToggleButton4.setText("Crear Usuario");
        jToggleButton4.setBounds(new Rectangle(545, 220, 107, 21));
        this.getContentPane().add(jToggleButton4, null);
        this.getContentPane().add(jToggleButton3, null);
        this.getContentPane().add(jToggleButton2, null);
        this.getContentPane().add(jTable1, null);
        this.getContentPane().add(jToggleButton1, null);
    }
        
    private void jToggleButton1_actionPerformed(ActionEvent e)
    {
        Opciones ops = new Opciones();
        ops.setVisible(true);
        this.dispose();
    }
}
